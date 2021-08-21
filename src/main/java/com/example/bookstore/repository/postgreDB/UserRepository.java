package com.example.bookstore.repository.postgreDB;

import com.example.bookstore.models.User;
import com.example.bookstore.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserRepository implements UserInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public User deleteUser(Long id) {
        return null;
    }
}
