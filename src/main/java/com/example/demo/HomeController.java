package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/home")
    public String home(){

        return "Hello security";
    }

    @GetMapping("/api/admin")
    public String admin(){

        return "Hello admin";
    }
}
