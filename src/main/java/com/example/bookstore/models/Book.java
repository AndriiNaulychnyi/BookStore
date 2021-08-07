package com.example.bookstore.models;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String name;
    private int year;

    public Book() {
    }

    public Book(Book book) {
        this.setId(book.getId());
        this.setName(book.getName());
        this.setYear(book.getYear());
    }
}
