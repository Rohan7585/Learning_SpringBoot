package com.example.ConnectDB.controller;

import com.example.ConnectDB.model.UserDetails;
import com.example.ConnectDB.repository.Userepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin // allow frontend to access this
public class UserDetailsController {

    @Autowired
    private Userepo repository;

    @PostMapping
    public UserDetails addUser(@RequestBody UserDetails user) {
        return repository.save(user);
    }

    @GetMapping
    public List<UserDetails> getAllUsers() {
    	System.out.println(">>>> GET /api/users CALLED");
    	System.out.println(">>>> USERS: " + repository.findAll().size());
        return repository.findAll();
    }
}
