package com.example.bookstore.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BookId")
    private long bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "releaseDate", nullable = false)
    private Date releasedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_author")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_publisher")
    private Publisher publisher;

    @Column(name = "Price", nullable = false)
    private BigDecimal price;

    public Book() {
    }

    public Book(String title, Date releasedDate, Author author, Publisher publisher, BigDecimal price) {
        this.title = title;
        this.releasedDate = releasedDate;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public long getBooktId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}