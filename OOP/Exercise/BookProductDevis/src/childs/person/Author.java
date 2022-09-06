package childs.person;
import parents.Person;

public class Author extends Person{
    // attributes
    private int totalBook;

    // constructor
    public Author(String firstName, String lastName, String country, int age){

    }

    // method
    public String toString(){
        return  super.toString() +
                "\nTotal Book\t: " + totalBook;
    }

    // getter
    public int getTotalBook(){
        return this.totalBook;
    }

    // setter
    public void setTotalBook(){
        this.totalBook += 1;
    }
}