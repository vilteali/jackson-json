package com.ali.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
}
