package com.example.coop.controller;

import com.example.coop.exception.ResourceNotFoundException;
import com.example.coop.model.UserModel;
import com.example.coop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserModel> getUser() {return userRepository.findAll();}

    @PostMapping
    public UserModel addUser(@RequestBody UserModel userModel) {
        return userRepository.save((userModel));
    }
}
