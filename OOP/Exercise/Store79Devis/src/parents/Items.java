package parents;

public abstract class Items extends Product {

  private Integer unitOfStock;
  private String productionCode;
  private String productionDate;

  public Items() {
  }

  public Items(String productID, String productType, String productDescription, Double costRate, Integer unitOfStock,
      String productionCode, String productionDate) {
    super(productID, productType, productDescription, costRate);
    this.unitOfStock = unitOfStock;
    this.productionCode = productionCode;
    this.productionDate = productionDate;
    calculatedProduction();
    calculatedPrice();
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

  public void calculatedProduction() {
    setProductionCost(RATE_CALCULATE_PRODUCT_ITEM * getCostRate());
  }

  public void calculatedPrice() {
    Double price = 0.0;
    if (unitOfStock <= 100) {
      price = 1.5 * getProductionCost();
    } else if (unitOfStock > 100 && unitOfStock <= 300) {
      price = 1.3 * getProductionCost();
    } else {
      price = 1.2 * getProductionCost();
    }
    setPrice(price);
  }

}