package com.example.bookstore.controller;

import com.example.bookstore.models.Book;
import com.example.bookstore.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @GetMapping("/api/basket?userId={userId}&bookId={bookId}")
    public Book addBookToBasket(@RequestParam Long userId,
                                @RequestParam Long bookId) {
        return basketService.addBookToBasket(userId, bookId);
    }
}
