package com.woffyapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @GetMapping("/register")
    public String register() {
        return "Greetings from Spring Boot!";
    }
}
