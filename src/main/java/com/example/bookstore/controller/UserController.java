package com.example.bookstore.controller;

import com.example.bookstore.models.User;
import com.example.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/users")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/api/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/api/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/api/users/{id}")
    public User updateUser(@PathVariable Long id,
                           @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/api/users/{id}")
    public User deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

}
