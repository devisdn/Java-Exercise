package classes;
public class Publisher {
    // attributes
    private String companyName, country;
    private Paper paper;
    
    // constructor
    public Publisher() {
        super();
    }

    public Publisher(String companyName, String country, Paper paper) {
        super();
        this.companyName = companyName;
        this.country = country;
        this.paper = paper;
    }

    // getter & setter
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

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
