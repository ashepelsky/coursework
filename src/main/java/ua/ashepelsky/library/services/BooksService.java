package ua.ashepelsky.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.ashepelsky.library.db.Book;
import ua.ashepelsky.library.db.BookDaoImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashepelsky on 5/3/2017.
 */
public class BooksService {

    @Autowired
    BookDaoImpl bookDao;

    public List<Book> getAll() {
        return new ArrayList<Book>();
    }

    public void addBook(Book book) {
//        bookDao.create();
    }

    public void deleteBook(Integer id) {

    }

}
