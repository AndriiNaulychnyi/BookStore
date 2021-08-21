package com.example.bookstore.models;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private final Basket basket;

    public User() {
        basket = null;
    }
    public User(User user, Basket basket) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.basket = basket;
    }

}
