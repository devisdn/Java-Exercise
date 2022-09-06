package publisher;

public class Publisher {
    // attributes
    private String name, country;
    private Double productionCost;
    
    // constructor
    public Publisher() {

    }

    public Publisher(String name, String country, Double productionCost){
        this.name = name;
        this.country = country;
        this.productionCost = productionCost;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setProductionCost(Double productionCost){
        this.productionCost = productionCost;
    }
    
    // getter
    public String getName(){
        return name;
    }

    public String getCountry(){
        return country;
    }

    public Double getProductioncost(){
        return productionCost;
    }


    
}
