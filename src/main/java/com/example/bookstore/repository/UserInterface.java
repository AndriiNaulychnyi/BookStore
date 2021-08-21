package com.example.bookstore.repository;

import com.example.bookstore.models.User;

import java.util.List;

public interface UserInterface {
    List<User> getAll();
    User getUser(Long id);
    User addUser(User user);
    User updateUser(Long id, User user);
    User deleteUser(Long id);

}
