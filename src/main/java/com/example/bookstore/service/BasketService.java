package com.example.bookstore.service;

import com.example.bookstore.models.Basket;
import com.example.bookstore.models.Book;
import com.example.bookstore.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;
    private final UserService userService;
    private final BookService bookService;

    // TODO: why this var is dramatically bad approach?
    double discount;

    public Basket newBasket() {
        return basketRepository.newBasket();
    }

    public Book addBookToBasket(Long userId, Long bookId) {
        if (bookId % 3 == 0) {
            discount = 0.1;
        }
        Long basketId = userService.getUser(userId).getBasket().getId();
        Book book = bookService.getBook(bookId);
        return basketRepository.addBookToBasket(basketId, book);
    }

    public void createOrder(Long userId) {
        Basket basket = userService.getUser(userId).getBasket();
        double resultPrice = basket.getTotalPrice() * discount;
    }

    public Basket removeFromBasket(Long id, Long bookId) {
        Basket basket = userService.getUser(id).getBasket();
        return basketRepository.removeFromBasket(basket.getId(), bookId);
    }

    public void getTotalPrice(Basket basket) {
        if (basket.getProduct().isEmpty()) {
            basket.setTotalPrice(0);
            return;
        }
        int basketTotalPrice = 0;
        for (Book book: basket.getProduct().values()) {
            basketTotalPrice += book.getPrice();
        }
        basket.setTotalPrice(basketTotalPrice);
    }
}
