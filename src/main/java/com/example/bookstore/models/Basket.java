package com.example.bookstore.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Basket {

    private final List<Book> basket = new ArrayList<>();
    private int allPrice;

}
