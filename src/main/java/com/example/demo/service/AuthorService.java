package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.demo.model.repositories.AuthorRepository;

import java.util.Optional;

public class AuthorService implements AuthorRepository {
    @Override
    public <S extends Author> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Author> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Author> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Author> findAll() {
        return null;
    }

    @Override
    public Iterable<Author> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Author entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Author> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
