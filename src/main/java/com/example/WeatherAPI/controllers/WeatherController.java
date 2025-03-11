package com.example.WeatherAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/")
    public String root()
    {
        return "Welcome to Weather API";
    }
}
