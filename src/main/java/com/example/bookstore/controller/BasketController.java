package com.example.bookstore.controller;

import com.example.bookstore.models.Basket;
import com.example.bookstore.service.BasketService;
import com.example.bookstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;
    private final UserService userService;


    @GetMapping("/api/users/{userId}/basket")
    public Basket getBasket(@PathVariable Long userId) {
        Long basketId = userService.getUser(userId).getBasket().getId();
        return basketService.getBasket(basketId);
    }

    @PutMapping("/api/users/{userId}/basket/{bookId}")
    public void addBookToBasket(@PathVariable Long userId, @PathVariable Long bookId) {
        Long basketId = userService.getUser(userId).getBasket().getId();
        basketService.addBookToBasket(basketId, bookId);
    }

    @DeleteMapping("/api/users/{userId}/basket/{bookId}")
    public Basket removeFromBasket(@PathVariable Long userId, @PathVariable Long bookId) {
        Long basketId = userService.getUser(userId).getBasket().getId();
        return basketService.removeFromBasket(basketId, bookId);
    }

    @DeleteMapping("/api/users/{id}/basket")
    public Basket clearBasket(@PathVariable Long id) {
        Long basketId = userService.getUser(id).getBasket().getId();
        return basketService.clearBasket(basketId);
    }


}
