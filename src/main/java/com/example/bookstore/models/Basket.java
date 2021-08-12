package com.example.bookstore.models;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Basket {

    private Long id;
    private final Map<Long, Book> product = new HashMap<>();
    private int totalPrice;

}
