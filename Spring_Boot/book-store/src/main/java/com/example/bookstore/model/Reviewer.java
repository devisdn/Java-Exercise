package com.example.bookstore.model;

import javax.persistence.*;

@Entity
@Table(name = "reviewer")
public class Reviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ReviewerId")
    private long revId;

    @Column(name = "ReviewerName", nullable = false)
    private String reviewerName;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "verified", nullable = false)
    private Boolean verified;

    public Reviewer() {
    }

    public Reviewer(String reviewerName, String country, Boolean verified) {
        this.reviewerName = reviewerName;
        this.country = country;
        this.verified = verified;
    }

    public long getRevId() {
        return revId;
    }

    public void setRevId(long revId) {
        this.revId = revId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }  
}