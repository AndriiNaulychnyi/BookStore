package com.example.bookstore.models;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private List<Book> basket;

    public User() {
    }

}
