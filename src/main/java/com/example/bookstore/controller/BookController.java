package com.example.bookstore.controller;

import com.example.bookstore.models.Book;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    // GET    /api/books
    // POST   /api/books
    // GET    /api/books/{id}   <-
    // PUT    /api/books/{id}   <- 
    // DELETE /api/books/{id}   <-

    @GetMapping("/api/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/api/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/api/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @DeleteMapping("/api/books/{id}")
    public Book deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
    
    @PutMapping("/api/books/{id}")
    public Book updateBook(@PathVariable Long id,
                            @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }


}
