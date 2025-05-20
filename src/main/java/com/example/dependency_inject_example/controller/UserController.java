package com.example.dependency_inject_example.controller;


import com.example.dependency_inject_example.model.User;
import com.example.dependency_inject_example.service.UserService;
import com.example.dependency_inject_example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

@Autowired
  private UserServiceImpl userService;

    @GetMapping("/users/")
    public List<User> getAllUsers() {
       return userService.getUsers();
    }
}
