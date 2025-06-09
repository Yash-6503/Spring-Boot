package com.yw.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowAboutController {

	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}
}
