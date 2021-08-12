package com.example.bookstore.repository;

import com.example.bookstore.models.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BookRepository {

    private List<Book> books = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book addBook(Book book) {
        book.setId(counter.incrementAndGet());
        books.add(book);
        return book;
    }

    public Book getBook(Long id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                return books.get(i);
            }
        }
        return null;
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
                newBook.setYear(book.getYear());
                return newBook;
            }
        }
        return null;
    }
}
