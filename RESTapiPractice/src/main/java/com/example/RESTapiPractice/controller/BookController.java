package com.example.RESTapiPractice.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.example.RESTapiPractice.model.BookModel;
import com.example.RESTapiPractice.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    // Constructor Injection
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET: Fetch all books
    @GetMapping
    public List<BookModel> getAllBooks() {
        return bookService.allBooks();
    }

    // POST: Add a new book
    @PostMapping
    public String addBook(@RequestBody BookModel bookModel) {
        bookService.addBooks(bookModel);
        return "Book added successfully!";
    }
}
