package com.example.bookstore.dtos;

public class PublisherDTO {
    private long publisherId;
    private String companyName;
    private String country;
    private PaperDTO paper;
    
    public PublisherDTO() {
    }

    public PublisherDTO(long publisherId, String companyName, String country, PaperDTO paper) {
        this.publisherId = publisherId;
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

    public PaperDTO getPaper() {
        return paper;
    }

    public void setPaper(PaperDTO paper) {
        this.paper = paper;
    }  
}