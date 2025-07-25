package com.yw.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpotifyUserOprController {
	
	@GetMapping("/home")
	public String showHome() {
		return "HELLO!! Welcome to Home page of Spotify.com";
	}
	
	@GetMapping("/after")
	public String afterLoginPage() {
		return "Welcome!! Successfully Logged into Spotify.com";
	}
	
	
	@GetMapping("/user")
	public Authentication showUserDetails(Principal principle) {
		System.out.println("Logged in Details: "+principle.getName());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth;
	}
}
