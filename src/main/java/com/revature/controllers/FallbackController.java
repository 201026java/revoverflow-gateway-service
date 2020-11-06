package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

	@GetMapping
	public ResponseEntity<String> serviceDown() {
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
				.body("The service you have requested is currently unavailable. Please check back later.");
	}
	
	
}
