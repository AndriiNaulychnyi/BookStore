package com.example.bookstore.service;

import com.example.bookstore.models.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public Book getBook(Long id) {
        return bookRepository.getBook(id);
    }

    public Book deleteBook(Long id) {
        return bookRepository.deleteBook(id);
    }

    public Book updateBook(Long id, Book book) {
        return bookRepository.updateBook(id, book);
    }
}
