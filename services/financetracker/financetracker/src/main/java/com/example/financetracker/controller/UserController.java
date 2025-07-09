package com.example.financetracker.controller;

import com.example.financetracker.User;
import com.example.financetracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create") // Clearer endpoint for creation
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/all") // Clearer endpoint for getting all users
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/id/{id}") // Clearer and consistent path variable
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}") // Explicit delete path
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
