package com.example.ConnectDB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;

import com.example.ConnectDB.service.ConnectDBService;

@RestController
public class ConnectDBController {
	
	private final ConnectDBService connectDBService;
	private static final Logger logger = LoggerFactory.getLogger(ConnectDBController.class);

	
	public ConnectDBController(ConnectDBService connectDBService) {
		this.connectDBService = connectDBService;
	}
	@GetMapping("/")
    public String home() {
		logger.info("This is an info log");
        logger.debug("This is a debug log");
        logger.error("This is an error log");
        return "Welcome to Spring Boot!";
    }
	@GetMapping("/greet")
	public String greet() {
		logger.info("Greet endpoint was called");
		return connectDBService.greeting();
	}
}
