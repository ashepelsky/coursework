package ua.ashepelsky.library.services;

import org.springframework.stereotype.Service;
import ua.ashepelsky.library.db.Loan;
import ua.ashepelsky.library.db.LoanDaoImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashepelsky on 5/3/2017.
 */
@Service
public class LoansService {

    private LoanDaoImpl loanDao = new LoanDaoImpl();

    public List<Loan> getAll() {
        return loanDao.getAll();
    }

    public void borrowBook(Loan loan) {
        loanDao.create(loan);
    }

    public void unborrowBook(Integer bookId) {
        loanDao.unborrow(bookId);
    }
}