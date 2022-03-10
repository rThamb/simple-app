FROM maven:3-openjdk-11 AS build
WORKDIR /simpleapp
COPY pom.xml ./
RUN mvn clean dependency:go-offline -B
COPY . .
RUN mvn install

FROM openjdk:11 AS release
WORKDIR /simpleapp
COPY . .
COPY --from=build /root/.m2/repository/com/ren/learning/simple-app/0.0.1-SNAPSHOT .
EXPOSE 8080
CMD ["java", "-jar", "simple-app-0.0.1-SNAPSHOT.jar"]
#CMD ["sleep", "5h"]

# ./mvn install