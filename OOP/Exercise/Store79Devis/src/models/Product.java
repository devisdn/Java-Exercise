package Models;

import Interface.ProductPrice;
import Interface.ProductionCost;

public abstract class Product implements ProductPrice, ProductionCost {
    private String productId;
    private String productType;
    private String productDescription;
    private Double productionCost;
    private Double price;
    private Double costRate;

    public Product(){
        super();
    }

    public Product(String productId, String productType, String productDescription, Double costRate){
        super();
        this.productId = productId;
        this.productType = productType;
        this.productDescription = productDescription;
        this.costRate = costRate;
    }

    //getter setter
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
    public Double getProductionCost() {
        return productionCost;
    }
    public void setProductionCost(Double productionCost) {
        this.productionCost = productionCost;
    }
    public Double getCostRate() {
        return costRate;
    }
    public void setCostRate(Double costRate) {
        this.costRate = costRate;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
