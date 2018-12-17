package example.service;

import example.model.Book;


public class BookService {

    public Book createBook () {
        return new Book(1L, "MyNotes", 30.2);
    }
}
