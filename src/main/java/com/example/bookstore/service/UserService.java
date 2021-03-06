package com.example.bookstore.service;

import com.example.bookstore.models.User;
import com.example.bookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BasketService basketService;

    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    public User addUser(User user) {
        User newUser = new User(user, basketService.newBasket());
        return userRepository.addUser(newUser);
    }

    public User updateUser(Long id, User user) {
        return userRepository.updateUser(id,user);
    }

    public User deleteUser(Long id) {
        return userRepository.deleteUser(id);
    }
}
