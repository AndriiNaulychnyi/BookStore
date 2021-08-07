package com.example.bookstore.service;

import com.example.bookstore.models.User;
import com.example.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    public User addUser(User user) {
        return userRepository.addUser(user);
    }

    public User updateUser(Long id, User user) {
        return userRepository.updateUser(id,user);
    }

    public User deleteUser(Long id) {
        return userRepository.deleteUser(id);
    }
}
