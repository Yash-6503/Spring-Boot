package com.yw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yw.entity.User;
import com.yw.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String getHome() {
		return "Welcome to Users home";
	}
	
	@GetMapping("/log")
	public String login() {
		return "This is Login page...";
	}
	
	@GetMapping("/allusers")
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(userService.allUsers(), HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user){
		return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable Integer id){
		return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
	}
}