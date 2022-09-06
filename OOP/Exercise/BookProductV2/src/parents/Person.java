package parents;
public class Person {
    // attributes
    private String firstName, lastName, country;

    // constructor
    public Person() {
    }

    public Person(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    // method
    @Override
    public String toString() {
        return  "\nName\t: " + firstName + " " + lastName +
                "\nCountry\t: " + country;
    }

    // getter & setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
