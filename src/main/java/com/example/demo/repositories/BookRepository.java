package com.example.demo.repositories;

import com.example.demo.repositories.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {


}
