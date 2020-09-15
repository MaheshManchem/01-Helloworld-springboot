package com.developer.helloworldspringboot.rest;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//written for testing purpose	
	@GetMapping("/sayhello")
	public String sayhello() {
		return "Hello world, This is mahesh"+LocalTime.now();
	}
}
