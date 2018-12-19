package com.esynched.application.controller;

import com.esynched.application.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable String userId) {
        return new User("lizzieJ", "password1");
    }
}