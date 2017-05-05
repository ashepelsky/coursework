package ua.ashepelsky.library;

import ua.ashepelsky.library.db.Book;
import ua.ashepelsky.library.db.BookDaoImpl;

/**
 * Created by ashepelsky on 5/5/2017.
 */
public class TestDrive {

    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("a");
        book.setTitle("t");
        new BookDaoImpl().create(book);

    }
}
