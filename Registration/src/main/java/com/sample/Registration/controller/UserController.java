package com.sample.Registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.Registration.model.UserModel;
import com.sample.Registration.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public UserModel addUser(@RequestBody UserModel user) {
		return userRepository.save(user);
	}
	
	@GetMapping
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }
}
