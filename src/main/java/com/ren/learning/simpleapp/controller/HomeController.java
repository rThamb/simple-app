package com.ren.learning.simpleapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/en", method = RequestMethod.GET)
    public ResponseEntity<String> sayHi() {
        return ResponseEntity.ok().body("{\"message\": \"Hi from Server\"}");
    }

    @RequestMapping(value = "/fr", method = RequestMethod.GET)
    public ResponseEntity<String> sayBonjour(){
        return ResponseEntity.ok().body("{\"message\": \"Bonjour from Server\"}");
    }

}
