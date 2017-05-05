package ua.ashepelsky.library.services;

import ua.ashepelsky.library.db.Loan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashepelsky on 5/3/2017.
 */
public class LoansService {

    public List<Loan> getAll() {
        return new ArrayList<Loan>();
    }

    public boolean isBookBorrowed(Integer bookId) {
        return false;
    }

    public void borrowBook(Integer bookId) {

    }

    public void unborrowBook(Integer bookId) {

    }
}