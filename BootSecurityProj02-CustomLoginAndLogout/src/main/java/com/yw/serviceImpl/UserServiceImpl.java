package com.yw.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entity.User;
import com.yw.repository.UserRepository;
import com.yw.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> allUsers() {
		return userRepo.findAll();
	}

	@Override
	public String saveUser(User user) {
		if(user != null) {
			userRepo.save(user);
			return "User Registered Successfully....";
		}
		return "User not Registered...";
	}

	@Override
	public User getUserById(Integer id) {
		return userRepo.findById(id).get();
	}

}
