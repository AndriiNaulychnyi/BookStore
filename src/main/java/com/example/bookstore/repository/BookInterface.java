package com.example.bookstore.repository;

import com.example.bookstore.models.Book;

import java.util.List;

public interface BookInterface {
    List<Book> getBooks();
    Book addBook(Book book);
    Book getBook(Long id);
    Book deleteBook(Long id);
    Book updateBook(Long id, Book book);
}
