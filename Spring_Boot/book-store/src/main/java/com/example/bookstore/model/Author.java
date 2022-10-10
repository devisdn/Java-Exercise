package com.example.bookstore.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    
    @Column(name = "author_fname", nullable = false)
    private String authorFirstName;
    
    @Column(name = "author_lname", nullable = false)
    private String authorLastName;
    
    @Column(name = "gender", nullable = false)
    private String gender;
    
    @Column(name = "age", nullable = false)
    private Integer age;
    
    @Column(name = "country", nullable = false)
    private String country;
    
    @Column(name = "rating")
    private String rating;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author", cascade = CascadeType.ALL)
    // mapped by diambil dari entity Book
    private List<Book> book;
    
    public Author(){}
    
    public Author(String authorFirstName, String authorLastName, String gender, Integer age, String country,
      String rating) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.rating = rating;
    }

    public Long getId() {
        return authorId;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}