package com.example.bookstore.repository.inMemory;

import com.example.bookstore.models.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BookRepository {

    private final Map<Long, Book> books = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }

    public Book addBook(Book book) {
        book.setId(counter.incrementAndGet());
        books.put(book.getId(), book);
        return book;
    }

    public Book getBook(Long id) {
        return books.get(id);
    }

    public Book deleteBook(Long id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                return books.remove(i);
            }
        }
        return null;
    }

    public Book updateBook(Long id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                Book newBook = books.get(i);
                newBook.setName(book.getName());
                newBook.setYearOfPublication(book.getYearOfPublication());
                return newBook;
            }
        }
        return null;
    }
}
