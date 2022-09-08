package childs;

import parents.Person;

public class Customer extends Person{
    // attributes
    private String gender, address, phoneNumber, postalCode, email;

    // constructor
    public Customer(){
        super();
    }

    public Customer(String firstName, String lastName, String country, String gender, String address, String phoneNumber, String postalCode, String email){
        super(firstName, lastName, country);
        this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.postalCode = postalCode;
		this.email = email;
    }

    // method
    @Override
    public String toString() {
        return  super.toString() + 
                "\nGender\t\t: " + gender + 
                "\nAddress\t\t: " + address + 
                "\nPostal Code\t: " + postalCode +
                "\nPhone Number\t: " + phoneNumber +
                "\nEmail\t\t: " + email ;
    }

    // getter & setter
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}