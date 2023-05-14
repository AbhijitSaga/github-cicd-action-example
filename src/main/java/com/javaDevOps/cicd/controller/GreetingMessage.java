package com.javaDevOps.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingMessage {
    @GetMapping("/")
    public String welcome(){
        return "welcome to here......!";
    }

    /*
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/AbhijitSaga/github-cicd-action-example.git
git push -u origin main
    */
}
