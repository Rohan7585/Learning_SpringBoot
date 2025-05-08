package com.example.ConnectDB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ConnectDB.service.ConnectDBService;

@RestController
public class ConnectDBController {
	
	private final ConnectDBService connectDBService;
	
	public ConnectDBController(ConnectDBService connectDBService) {
		this.connectDBService = connectDBService;
	}
	@GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot!";
    }
	@GetMapping("/greet")
	public String greet() {
		return connectDBService.greeting();
	}
}
