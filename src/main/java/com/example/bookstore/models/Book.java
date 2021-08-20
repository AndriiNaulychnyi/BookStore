package com.example.bookstore.models;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private int yearOfPublication;
    private int price;

}
