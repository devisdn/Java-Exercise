package childs;

public class Mangaka extends Author {
    // attributes
    String rating;

    // constructor
    public Mangaka() {
        super();
    }

    public Mangaka(String firstName, String lastName, String country, String gender, String genre, Integer age,
            String rating) {
        super(firstName, lastName, country, gender, genre, age);
        this.rating = rating;
    }

    // getter & setter
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}