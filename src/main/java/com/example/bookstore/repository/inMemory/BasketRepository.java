package com.example.bookstore.repository.inMemory;

import com.example.bookstore.models.Basket;
import com.example.bookstore.models.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BasketRepository {

    private final Map<Long, Basket> baskets = new HashMap();
    private final AtomicLong counter = new AtomicLong();


    public Book addBookToBasket(Long basketId, Book book) {
        baskets.get(basketId).getProducts().put(book.getId(), book);

        return null;
    }

    public Basket newBasket() {
        Basket basket = new Basket();
        basket.setId(counter.incrementAndGet());
        baskets.put(basket.getId(), basket);
        return basket;
    }

    public Basket removeFromBasket(Long basketId, Long bookId) {
        Basket basket = baskets.get(basketId);
        basket.getProducts().remove(bookId);
        return basket;
    }

    public Basket getBasket(Long id) {
        return baskets.get(id);
    }

    public Basket clearBasket(Long id) {
        baskets.get(id).getProducts().clear();
        return baskets.get(id);
    }
}
