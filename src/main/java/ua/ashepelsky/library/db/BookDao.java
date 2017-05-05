package ua.ashepelsky.library.db;

import java.util.List;

/**
 * Created by ashepelsky on 5/5/2017.
 */
public interface BookDao {

    void create(Book book);

    void delete(Integer id);

    List<Book> getAll();

}
