package com.example.bookstore.service;

import com.example.bookstore.models.Book;
import com.example.bookstore.repository.inMemory.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

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
