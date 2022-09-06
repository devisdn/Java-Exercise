package childs;
import parents.Person;

public class Reviewer extends Person{
    // attributes
    private Boolean isVerified;

    // constructor
    public Reviewer() {
        super();
    }

    public Reviewer(String firstName, String lastName, String country, Boolean isVerified) {
        super(firstName, lastName, country);
        this.isVerified = isVerified;
    }

    // getter & setter
    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }
  
}
