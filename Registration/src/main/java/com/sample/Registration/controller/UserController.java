package com.sample.Registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/{id}")		//Endpoint will have the id of the user
	public UserModel updateUser(@PathVariable Long id, @RequestBody UserModel updatedUser) {
	    return userRepository.findById(id).map(user -> {
	        user.setName(updatedUser.getName());
	        user.setEmail(updatedUser.getEmail());
	        user.setMobile(updatedUser.getMobile());
	        return userRepository.save(user);
	    }).orElseThrow(() -> new RuntimeException("User not found with id " + id));
	}
	
	@DeleteMapping("/{id}")		//Endpoint will have the id of the user
	public String deleteUser(@PathVariable Long id) {
	    if (userRepository.existsById(id)) {
	        userRepository.deleteById(id);
	        return "User with id " + id + " deleted.";
	    } else {
	        return "User not found with id " + id;
	    }
	}

}
