package com.example.springbootdemo.api.controller;


import com.example.springbootdemo.api.model.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Optional getUser(@RequestParam int id) {
        Optional user= userService.getUser(id);

        if(user.isPresent()) {
            System.out.println(""+user.get());
        }

        return userService.getUser(id);
    }

}
