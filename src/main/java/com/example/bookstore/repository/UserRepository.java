package com.example.bookstore.repository;

import com.example.bookstore.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    public User getUser(Long id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                return users.get(i);
            }
        }
        return null;
    }

    public User addUser(User user) {
        user.setId(counter.incrementAndGet());
        users.add(user);
        return user;
    }

    public User updateUser(Long id, User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                User updateUser = users.get(i);
                updateUser.setName(user.getName());
                updateUser.setSurname(user.getSurname());
                updateUser.setEmail(user.getEmail());
                return updateUser;
            }
        }
        return null;
    }

    public User deleteUser(Long id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                return users.remove(i);
            }
        }
        return null;
    }
}
