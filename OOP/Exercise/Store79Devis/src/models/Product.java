package models;
import interfaces.*;

public abstract class Product implements ProductionCost, ProductPrice{
    private String productId, productType, productDescription;
    private Double costRate, productionCost, price;
    
    ProductionCost production;
    
    public Product() {
        super();
    }


    public Product(String productId, String productType, String productDescription, Double costRate) {
        super();
        this.productId = productId;
        this.productType = productType;
        this.productDescription = productDescription;
        this.costRate = costRate;
    }


    public String getProductId() {
        return productId;
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getProductType() {
        return productType;
    }


    public void setProductType(String productType) {
        this.productType = productType;
    }


    public String getProductDescription() {
        return productDescription;
    }


    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    public Double getCostRate() {
        return costRate;
    }


    public void setCostRate(Double costRate) {
        this.costRate = costRate;
    }


    public Double getProductionCost() {
        return productionCost;
    }


    public void setProductionCost(Double productionCost) {
        this.productionCost = productionCost;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
