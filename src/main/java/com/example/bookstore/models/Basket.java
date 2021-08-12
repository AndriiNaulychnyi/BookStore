package com.example.bookstore.models;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Basket {

    // remove allPrice field

    private Long id;
    private final Map<Long, Book> product = new HashMap<>();
    private int totalPrice;

}
