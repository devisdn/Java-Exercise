package Models;

public abstract class ProductServices extends Product {
    private Integer userUsage;
    private String costCalculationType;

    public ProductServices(){
        super();
    }
    public ProductServices(String productId, String productType, String productDescription, Double costRate, Integer userUsage, String costCalculationType){
        super(productId, productType,productDescription, costRate);
        this.userUsage = userUsage;
        this.costCalculationType = costCalculationType;
    }

    //getter setter
    public Integer getUserUsage() {
        return userUsage;
    }
    public void setUserUsage(Integer userUsage) {
        this.userUsage = userUsage;
    }
    public String getCostCalculationType() {
        return costCalculationType;
    }
    public void setCostCalculationType(String costCalculationType) {
        this.costCalculationType = costCalculationType;
    }
}
