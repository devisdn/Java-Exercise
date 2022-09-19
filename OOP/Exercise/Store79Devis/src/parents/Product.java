package parents;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import interfaces.*;

public abstract class Product implements ProductionCost, Price {
  private String productID;
  private String productType;
  private String productDescription;
  private Double costRate;
  private Double productionCost;
  private Double price;

  public Product() {
  }

  public Product(String productID, String productType, String productDescription, Double costRate) {
    this.productID = productID;
    this.productType = productType;
    this.productDescription = productDescription;
    this.costRate = costRate;
  }

  public String getProductID() {
    return productID;
  }

  public void setProductID(String productID) {
    this.productID = productID;
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

  public String price() {
    DecimalFormat indonesiaCurrency = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setMonetaryDecimalSeparator(',');
    formatRp.setGroupingSeparator('.');
    indonesiaCurrency.setDecimalFormatSymbols(formatRp);
    return indonesiaCurrency.format(getPrice());
  }

}