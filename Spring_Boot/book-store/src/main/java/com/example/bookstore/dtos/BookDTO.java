package com.example.bookstore.dtos;

import java.math.BigDecimal;
import java.util.Date;

public class BookDTO {
    private long bookId;
    private String title;
    private Date releasedDate;
    private AuthorDTO author;
    private PublisherDTO publisher;
    private BigDecimal price;
    
    public BookDTO() {
    }

    public BookDTO(long bookId, String title, Date releasedDate, AuthorDTO author, PublisherDTO publisher,
            BigDecimal price) {
        this.bookId = bookId;
        this.title = title;
        this.releasedDate = releasedDate;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public long getBookId() {
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

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public PublisherDTO getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherDTO publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}