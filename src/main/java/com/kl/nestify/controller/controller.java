package com.kl.nestify.controller;

import com.kl.nestify.model.User;
import com.kl.nestify.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class controller {

    @Autowired
    private repository userRepository;

    @PostMapping
    public User registerUser(@RequestBody User user) {
        // Optionally, hash the password before saving
        // String hashedPassword = passwordEncoder.encode(user.getPassword());
        // user.setPassword(hashedPassword);

        return userRepository.save(user);
    }
}
