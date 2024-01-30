package com.example.demo.bootStrap;

import com.example.demo.model.Book;
import com.example.demo.model.repositories.AuthorRepository;
import com.example.demo.model.repositories.BookRepository;
import com.example.demo.service.BookService;
import org.aspectj.weaver.ast.Instanceof;
import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book bb = new Book();
        bb.setTitle("helllo");
        bb.setIspn("13650813");
        Book bbb = bookRepository.save(bb);

        System.out.println(bbb.toString());

    }


}
