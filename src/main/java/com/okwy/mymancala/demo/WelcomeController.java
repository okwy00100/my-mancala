package com.okwy.mymancala.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeText() {
        return "Welcome to MyMancala";
    }
}