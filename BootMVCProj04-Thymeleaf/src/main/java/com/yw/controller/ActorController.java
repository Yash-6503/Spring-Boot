package com.yw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yw.service.ActorService;

@Controller
@RequestMapping("/actor")
public class ActorController {
		
	@Autowired
	private ActorService actorService;
	
	@GetMapping("/home")
	public String getHome() {
		return "Home";
	}
	
	@GetMapping("/all")
	public String getActors() {
		return "Actors";
	}
}
