package ua.ashepelsky.library.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by ashepelsky on 5/3/2017.
 */

@Entity
@Table(name = "loans")
public class Loan implements Serializable {
    @Id
    @Column(name = "bookId")
    private Integer id;
    @Column(insertable = false, updatable = false)
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
