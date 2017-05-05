package ua.ashepelsky.library.db;

import org.hibernate.Session;

import java.util.List;

/**
 * Created by ashepelsky on 5/5/2017.
 */
public class BookDaoImpl implements BookDao {

    private Session session;

    public BookDaoImpl() {
        session = DbConnector.getSessionFactory().openSession();
    }

    public void create(Book book) {
        session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

    }

    public void delete(Integer id) {

    }

    public List<Book> getAll() {
        return null;
    }
}
