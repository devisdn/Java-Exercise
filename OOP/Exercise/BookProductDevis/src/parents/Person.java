package parents;

public class Person {
    private String firstName, lastName, country;
    private int age;

    // constructor
    public Person(){ 
        super();
    }

    public Person(String firstName, String lastName, String country, int age){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    // method
    public String getFullName(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public String toString(){
        return  "\nAuthor\t\t: " + getFullName() +
                "\nAge\t\t: " + age +
                "\nCountry\t\t: " + country;
    }

    // getter
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getCountry(){
        return this.country;
    }

    public int getAge(){
        return this.age;
    }

    // setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setAge(int age){
        this.age = age;
    }
}