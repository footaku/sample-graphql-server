package com.example.graphqlserver;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {
    private final BooksJpaRepository booksRepository;

    public BookController(BooksJpaRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    @QueryMapping
    public List<Book> bookByName(@Argument String name) {
        return booksRepository.findByName(name);
    }

}
