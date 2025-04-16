package com.cts.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	public String name() {
		return "Vijay";
	}

}
