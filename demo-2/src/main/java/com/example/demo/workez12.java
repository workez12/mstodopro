package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class workez12 {
	
	@GetMapping("/")
	public String home() {
		return "workeye!!!!";
	}

}
