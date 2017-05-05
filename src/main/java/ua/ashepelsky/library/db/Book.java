package ua.ashepelsky.library.db;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ashepelsky on 5/3/2017.
 */

@Entity
@Table(name = "books")
public class Book implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookId")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
