package com.example.bookstore.models;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private int year;
    private int price;

    public Book() {
    }

}
