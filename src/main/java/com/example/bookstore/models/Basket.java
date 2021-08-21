package com.example.bookstore.models;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Basket {

    // remove allPrice field

    private Long id;
    private final Map<Long, Book> products = new HashMap<>();

    public double getTotalPrice() {
        int basketTotalPrice = 0;
        for (Book book: products.values()) {
            basketTotalPrice += book.getPrice();
        }
        return basketTotalPrice;
    }
}
