package com.example.demo.service;

import com.example.demo.repositories.model.Book;
import com.example.demo.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BookService extends BookRepository {

}
