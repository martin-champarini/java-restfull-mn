package example.controller;


import example.model.Book;
import example.service.BookService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;


@Controller("/books")
public class BookController {

    private BookService bookService = new BookService();



    @Get("/book")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook() {
        return bookService.createBook();
    }
}
