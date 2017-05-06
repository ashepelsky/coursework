package ua.ashepelsky.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ashepelsky.library.db.Book;
import ua.ashepelsky.library.db.BookDaoImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashepelsky on 5/3/2017.
 */
@Service
public class BooksService {

    private BookDaoImpl bookDao = new BookDaoImpl();

    public List<Book> getAll() {
        return bookDao.getAll();
    }

    public void addBook(Book book) {
        bookDao.create(book);
    }

    public void deleteBook(Integer id) {
        bookDao.delete(id);

    }

}
