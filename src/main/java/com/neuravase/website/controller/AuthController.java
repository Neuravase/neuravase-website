package com.neuravase.website.controller;

import com.neuravase.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        userService.register(username, password);
        return "Benutzer registriert!";
    }
}