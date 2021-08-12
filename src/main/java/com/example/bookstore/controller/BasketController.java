package com.example.bookstore.controller;

import com.example.bookstore.models.Basket;
import com.example.bookstore.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    // 1. Update API
    // PUT /api/users/{userId}/basket
    // {
    //     "bookId": 213234
    // }
    // AddToBasketRequest <- in package .dto

    @PutMapping("/api/basket/{id}/basket")
    public void addBookToBasket(@PathVariable Long id, Long bookId) {
        basketService.addBookToBasket(id, bookId);
    }

    @DeleteMapping("/api/basket/{id}/basket")
    public Basket removeFromBasket(@PathVariable Long id, Long bookId) {
        return basketService.removeFromBasket(id, bookId);
    }


}
