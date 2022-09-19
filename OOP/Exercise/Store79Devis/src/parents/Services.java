package parents;

public abstract class Services extends Product {
  private Integer userUsage;
  private String constCalculationType;

  public Services() {
  }

  public Services(String productID, String productType, String productDescription, Double costRate,
      Integer userUsage,
      String constCalculationType) {
    super(productID, productType, productDescription, costRate);
    this.userUsage = userUsage;
    this.constCalculationType = constCalculationType;
  }

  public Integer getUserUsage() {
    return userUsage;
  }

  public void setUserUsage(Integer userUsage) {
    this.userUsage = userUsage;
  }

  public String getConstCalculationType() {
    return constCalculationType;
  }

  public void setConstCalculationType(String constCalculationType) {
    this.constCalculationType = constCalculationType;
  }

}