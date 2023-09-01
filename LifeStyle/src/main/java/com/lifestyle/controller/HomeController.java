package com.lifestyle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/LifeStyle")
    public String home() {
        return "home"; // Returning the name of the Thymeleaf template for the homepage
    }
}
