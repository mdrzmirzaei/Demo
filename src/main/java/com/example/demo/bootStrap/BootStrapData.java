package com.example.demo.bootStrap;

import com.example.demo.repositories.model.Author;
import com.example.demo.repositories.model.Book;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.BookRepository;
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

        Author Erick = new Author();
        Erick.setFirstName("Erick");
        Erick.setLastName("laursen");
        Author newaut = authorRepository.save(Erick);


        Book ddd = new Book();
        ddd.setTitle("domain driven Develop");
        ddd.setIspn("13650813");
        Book book1 = bookRepository.save(ddd);


        Book cleancode = new Book();
        cleancode.setTitle("cleancode");
        cleancode.setIspn("1547854724");
        Book ccsaved = bookRepository.save(cleancode);


        Erick.getBooks().add(book1);


        System.out.println(bookRepository.count());

        System.out.println(authorRepository.count());


//        bbb.getAuthors().add(newaut);
//
//        Author amirza=new Author();
//        amirza.setFirstName("mohammadreza");
//        amirza.setLastName("mirzaei");
//
//        Author mirzasaved=authorRepository.save(amirza);
//
//        bbb.getAuthors().add(mirzasaved);
//
//        bookRepository.save(but);
//
//        newaut.getBooks().add(bbb);
//        authorRepository.save(newaut);
//        mirzasaved.getBooks().add(bbb);
//        authorRepository.save(mirzasaved);
//        System.out.println("the book details are : ");
//        System.out.println(bbb);


    }


}
