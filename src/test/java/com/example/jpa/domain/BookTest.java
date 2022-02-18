package com.example.jpa.domain;

import com.example.jpa.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    void bookTest(){
        Book book = new Book();
        book.setName("jpa 초격차 패키지");
        book.setAuthor("한빛미디어");

        bookRepository.save(book);
        System.out.println(bookRepository.findAll());
    }


}