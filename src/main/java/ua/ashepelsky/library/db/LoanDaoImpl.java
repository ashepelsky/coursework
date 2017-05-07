package ua.ashepelsky.library.db;

import org.hibernate.Session;

import java.util.List;

/**
 * Created by ashepelsky on 5/5/2017.
 */
public class LoanDaoImpl implements LoanDao {

    private Session session;

    public LoanDaoImpl() {
        session = DbConnector.getSessionFactory().openSession();
    }


    public void create(Loan loan) {
        session.beginTransaction();
        session.saveOrUpdate(loan);
        session.getTransaction().commit();
    }

    public void unborrow(Integer bookId) {
        session.beginTransaction();
        session.createQuery("UPDATE Loan l SET l.isBorrowed = false").executeUpdate();
        session.getTransaction().commit();
    }

    public List<Loan> getAll() {
        return session.createQuery("SELECT b FROM Loan b").getResultList();
    }
}
