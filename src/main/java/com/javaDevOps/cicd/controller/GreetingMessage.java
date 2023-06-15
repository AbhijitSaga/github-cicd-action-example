package com.javaDevOps.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingMessage {
    @GetMapping("/")
    public String welcome(){
        return "welcome to India......!";
    }

    @GetMapping("/hello")
    public String hello(){
        return " Hello india.....";
}

}
