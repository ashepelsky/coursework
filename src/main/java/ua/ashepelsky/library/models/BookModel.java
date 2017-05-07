package ua.ashepelsky.library.models;

import ua.ashepelsky.library.db.Book;

/**
 * Created by shepelsky on 06.05.2017.
 */
public class BookModel {
    private Book book;
    private boolean isBorrowed;

    public BookModel(Book book, boolean isBorrowed) {
        this.book = book;
        this.isBorrowed = isBorrowed;
    }

    public Book getBook() {
        return book;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
