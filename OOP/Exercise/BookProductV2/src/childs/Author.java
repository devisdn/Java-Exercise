package childs;

import parents.Person;

public class Author extends Person {
    // attributes
    private String gender, genre;
    private Integer age;

    //constructor
    public Author(){
        super();
    }

    public Author(String firstName, String lastName, String country, String gender, String genre, Integer age) {
        super(firstName, lastName, country);
        this.gender = gender;
        this.genre = genre;
        this.age = age;
    }

    // method
    @Override
    public String toString() {
        return  super.toString() +
                "\nGender\t\t: " + gender +
                "\nGenre\t\t: " + genre +
                "\nAge\t\t: " + age;
    }

    // getter & setter
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}