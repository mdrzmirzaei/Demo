package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @ManyToMany
    private Set<Book> books;

}
