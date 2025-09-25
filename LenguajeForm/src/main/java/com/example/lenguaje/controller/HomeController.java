package com.example.lenguaje.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }
}
