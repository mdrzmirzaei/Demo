package com.example.demo.repositories;

import com.example.demo.repositories.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
