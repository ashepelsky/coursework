package ua.ashepelsky.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ashepelsky.library.db.Book;
import ua.ashepelsky.library.db.BookDaoImpl;
import ua.ashepelsky.library.db.Loan;
import ua.ashepelsky.library.db.LoanDaoImpl;
import ua.ashepelsky.library.models.BookModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashepelsky on 5/3/2017.
 */
@Service
public class BooksService {

    private BookDaoImpl bookDao = new BookDaoImpl();
    private LoanDaoImpl loanDao = new LoanDaoImpl();

    public List<BookModel> getAll() {
        ArrayList<BookModel> bookModels = new ArrayList<>();
        ArrayList<Loan> loans = (ArrayList<Loan>) loanDao.getAll();
        ArrayList<Book> books = (ArrayList<Book>) bookDao.getAll();
        boolean isCurrentBookBorrowed = false;

        for (Book book: books) {
            for (Loan loan: loans) {
                if(book.getId().equals(loan.getBookId()) && loan.getBorrowed() ) {
                    bookModels.add(new BookModel(book, true));
                    isCurrentBookBorrowed = true;
                    break;
                }
            }
            if(!isCurrentBookBorrowed)
                bookModels.add(new BookModel(book, false));
            isCurrentBookBorrowed = false;
        }


        return bookModels;
    }

    public void addBook(Book book) {
        bookDao.create(book);
    }

    public void deleteBook(Integer id) {
        bookDao.delete(id);

    }

}
