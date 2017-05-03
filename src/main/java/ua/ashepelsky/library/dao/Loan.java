package ua.ashepelsky.library.dao;

/**
 * Created by ashepelsky on 5/3/2017.
 */
public class Loan {
    private Integer id;
    private Integer bookId;
    private String dueBack;
    private Boolean isBorrowed;
    private String customerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getDueBack() {
        return dueBack;
    }

    public void setDueBack(String dueBack) {
        this.dueBack = dueBack;
    }

    public boolean isReturned() {
        return isBorrowed;
    }

    public void setReturned(boolean returned) {
        isBorrowed = returned;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
