package models;

public abstract class ProductItems extends Product{
    private Integer unitOfStock;
    private String productionCode, productionDate;

    public ProductItems() {
        super();
    }

    public ProductItems(String productId, String productType, String productDescription, Double costRate,
            Integer unitOfStock, String productionCode, String productionDate) {
        super(productId, productType, productDescription, costRate);
        this.unitOfStock = unitOfStock;
        this.productionCode = productionCode;
        this.productionDate = productionDate;
        calculateProductionCost();
        calculateProductPrice();
    }
    
    @Override
    public void calculateProductionCost() {
        // TODO Auto-generated method stub
        setProductionCost(PRODUCTION_COST_ITEMS_PERCENTAGE * super.getCostRate());
    }
    @Override
    public void calculateProductPrice() {
        // TODO Auto-generated method stub
        Double price = 0.0;
        if (unitOfStock <= 100){
            price = 1.5 * super.getProductionCost();
        } else if (unitOfStock > 100 && unitOfStock <= 300){
            price = 1.3 * super.getProductionCost();
        } else {
            price = 1.2 * super.getProductionCost();
        }
        super.setPrice(price);
    }

    public Integer getUnitOfStock() {
        return unitOfStock;
    }

    public void setUnitOfStock(Integer unitOfStock) {
        this.unitOfStock = unitOfStock;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

}
