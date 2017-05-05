package ua.ashepelsky.library;

import ua.ashepelsky.library.db.Book;
import ua.ashepelsky.library.db.BookDaoImpl;

import java.util.List;

/**
 * Created by ashepelsky on 5/5/2017.
 */
public class TestDrive {

    public static void main(String[] args) {
//        Book book = new Book();
//        book.setAuthor("aa");
//        book.setTitle("t");


        System.out.println(new BookDaoImpl().getAll());
        System.out.println("as");



    }
}
