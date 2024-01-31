package com.example.demo.repositories.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    @Column
    private String title;
    @Column
    private String ispn;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="author_book",joinColumns = @JoinColumn(name="book_id"),inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors= new HashSet<>();

    }
