package com.book.BookServices.controller;

import com.book.BookServices.entity.Book;
import com.book.BookServices.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return this.bookRepo.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getABook(@PathVariable long id){
        return this.bookRepo.findById(id).get();
    }

    @PostMapping("/books")
    public Book addABook(@RequestBody Book book){
        return  this.bookRepo.save(book);
    }

}
