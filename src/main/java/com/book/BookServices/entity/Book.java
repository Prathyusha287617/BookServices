package com.book.BookServices.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book_entity")
public class Book {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="book_name")
    private String name;

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
