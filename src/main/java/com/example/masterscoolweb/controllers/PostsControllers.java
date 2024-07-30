package com.example.masterscoolweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostsControllers {
    @GetMapping("/")
    public String posts() {
        return "general";
    }
    @GetMapping("/regisration")
    public String registration() {
        return "registration";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
