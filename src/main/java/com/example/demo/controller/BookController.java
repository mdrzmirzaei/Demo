package com.example.demo.controller;

import com.example.demo.repositories.model.Book;
import com.example.demo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping(value="/book")
public class BookController {
    private final BookService bookService;

    @PostMapping(value="/list") Iterable<Book> listBook()
    {
        return bookService.findAll();
    }

}
