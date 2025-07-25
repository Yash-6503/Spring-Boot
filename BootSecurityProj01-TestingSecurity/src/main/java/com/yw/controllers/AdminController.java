package com.yw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yw.entity.User;
import com.yw.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "This is Home Page";
	}
	
	@GetMapping("/allusers")
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<>(userService.allUsers(), HttpStatus.OK);
	}
}
