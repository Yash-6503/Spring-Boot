package com.yw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {

	@GetMapping("/signin")
	public String login() {
		return "Login";
	}
	
	
}
