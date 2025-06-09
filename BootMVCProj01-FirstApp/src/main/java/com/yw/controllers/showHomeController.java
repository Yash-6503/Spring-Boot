package com.yw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class showHomeController {

	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}
}
