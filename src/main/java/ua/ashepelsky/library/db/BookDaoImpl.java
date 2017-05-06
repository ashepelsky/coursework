package ua.ashepelsky.library.db;

import org.hibernate.Session;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;
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
        session.saveOrUpdate(book);
        session.getTransaction().commit();


    }

    public void delete(Integer id) {
        session.beginTransaction();
        session.createQuery("DELETE FROM Book b WHERE b.id = :id").setParameter("id",id).executeUpdate();
        session.getTransaction().commit();
    }

    public List getAll() {
        return session.createQuery("SELECT b FROM Book b").getResultList();
    }
}
