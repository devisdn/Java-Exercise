package com.example.bookstore.dtos;

public class AuthorDTO {
    private long authId;
    private String authFirstName;
    private String authLastName;
    private String gender;
    private int age;
    private String country;
    private String rating;
    
    public AuthorDTO() {
    }

    public AuthorDTO(long authId, String authFirstName, String authLastName, String gender, int age, String country,
            String rating) {
        this.authId = authId;
        this.authFirstName = authFirstName;
        this.authLastName = authLastName;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.rating = rating;
    }

    public long getAuthId() {
        return authId;
    }

    public void setAuthId(long authId) {
        this.authId = authId;
    }

    public String getAuthFirstName() {
        return authFirstName;
    }

    public void setAuthFirstName(String authFirstName) {
        this.authFirstName = authFirstName;
    }

    public String getAuthLastName() {
        return authLastName;
    }

    public void setAuthLastName(String authLastName) {
        this.authLastName = authLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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