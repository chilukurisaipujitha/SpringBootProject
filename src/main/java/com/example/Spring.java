package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Spring {
	@GetMapping("/second")
	public String getData() {
		return "Welcome to Amdocs Family";
	}

	
}
