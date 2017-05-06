package ua.ashepelsky.library.db;

import java.util.List;

/**
 * Created by ashepelsky on 5/5/2017.
 */
public interface LoanDao {

    void create(Loan loan);

    void unborrow(Integer bookId);

    List<Loan> getAll();
}
