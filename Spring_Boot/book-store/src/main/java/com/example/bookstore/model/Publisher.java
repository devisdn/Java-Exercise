package com.example.bookstore.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PublisherId")
    private long publisherId;

    @Column(name = "CompanyName", nullable = false)
    private String companyName;

    @Column(name = "country", nullable = false)
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paper")
    private Paper paper;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher", cascade = CascadeType.ALL)
    // mapped by diambil dari entity Book
    private List<Book> book;

    public Publisher() {
    }

    public Publisher(String companyName, String country, Paper paper) {
        this.companyName = companyName;
        this.country = country;
        this.paper = paper;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    } 
}
