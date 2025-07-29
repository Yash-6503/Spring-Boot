package com.yw.service;

import java.util.List;

import com.yw.entity.User;

public interface UserService {
	public List<User> allUsers();
	public String saveUser(User user);
	public User getUserById(Integer id);
}
