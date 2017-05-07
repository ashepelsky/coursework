package ua.ashepelsky.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.ashepelsky.library.db.Book;
import ua.ashepelsky.library.services.BooksService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shepelsky on 06.05.2017.
 */
@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @RequestMapping("/api/books")
    public Map<String, Object> getBooks() {
        Map<String, Object> model = new HashMap<>();
        model.put("books", booksService.getAll());

        return model;
    }

    @RequestMapping(value = "/api/books", method = RequestMethod.POST)
    public void createBook(@RequestBody Book book) {
        booksService.addBook(book);
    }

    @RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable() Integer id) {
        booksService.deleteBook(id);
    }
}
