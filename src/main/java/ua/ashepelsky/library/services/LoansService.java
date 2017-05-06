package ua.ashepelsky.library.services;

import ua.ashepelsky.library.db.Loan;
import ua.ashepelsky.library.db.LoanDaoImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashepelsky on 5/3/2017.
 */
public class LoansService {

    LoanDaoImpl loanDao = new LoanDaoImpl();

    public List<Loan> getAll() {
        return new ArrayList<Loan>();
    }

    public void borrowBook(Loan loan) {
        loanDao.create(loan);
    }

    public void unborrowBook(Integer bookId) {

    }
}