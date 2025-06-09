package com.example.music_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//ヌメラ
@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}