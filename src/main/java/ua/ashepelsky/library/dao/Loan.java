package ua.ashepelsky.library.dao;

/**
 * Created by ashepelsky on 5/3/2017.
 */
public class Loan {
    private Integer id;
    private Integer bookId;
    private String dueBack;

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
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    boolean isReturned;

}
