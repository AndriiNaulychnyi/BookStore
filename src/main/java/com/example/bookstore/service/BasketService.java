package com.example.bookstore.service;

import com.example.bookstore.models.Basket;
import com.example.bookstore.models.Book;
import com.example.bookstore.repository.inMemory.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BasketService {

    private final BasketRepository basketRepository;
    private final BookService bookService;

    public Basket newBasket() {
        return basketRepository.newBasket();
    }

    public Book addBookToBasket(Long basketId, Long bookId) {
        Book book = bookService.getBook(bookId);
        return basketRepository.addBookToBasket(basketId, book);
    }

    public Basket removeFromBasket(Long basketId, Long bookId) {
        return basketRepository.removeFromBasket(basketId, bookId);
    }

    public Basket getBasket(Long basketId) {
        return basketRepository.getBasket(basketId);
    }

    public Basket clearBasket(Long basketId) {
        return basketRepository.clearBasket(basketId);
    }
}
