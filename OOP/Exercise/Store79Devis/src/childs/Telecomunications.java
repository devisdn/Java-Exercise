package childs;

import parents.Services;

public class Telecomunications extends Services {
  private String packetType;
  private String packetLimit;
  private Integer duration;

  public Telecomunications() {

  }

  public Telecomunications(String productID, String productType, String productDescription, Double costRate,
      Integer userUsage, String constCalculationType, String packetType, String packetLimit, Integer duration) {
    super(productID, productType, productDescription, costRate, userUsage, constCalculationType);
    this.packetType = packetType;
    this.packetLimit = packetLimit;
    this.duration = duration;
    calculatedProduction();
    calculatedPrice();
  }

  public String getPacketType() {
    return packetType;
  }

  public void setPacketType(String packetType) {
    this.packetType = packetType;
  }

  public String getPacketLimit() {
    return packetLimit;
  }

  public void setPacketLimit(String packetLimit) {
    this.packetLimit = packetLimit;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  @Override
  public void calculatedProduction() {
    double productionCost = 0.0;
    if (getConstCalculationType().equalsIgnoreCase("PerSecond")) {
      productionCost = getCostRate() * duration;
    } else {
      if (packetType.equalsIgnoreCase("data")) {
        productionCost = getCostRate() * duration * PERCENTAGE_PACKAGE_DATA;
      } else {
        productionCost = getCostRate() * duration * PERCENTAGE_PACKAGE_DEFAULT;
      }
    }
    setProductionCost(productionCost);
  }

  @Override
  public void calculatedPrice() {
    Double price = 0.0;
    if (getUserUsage() <= 200) {
      price = 1.2 * getProductionCost();
    } else if (getUserUsage() > 200 && getUserUsage() <= 500) {
      price = 1.3 * getProductionCost();
    } else {
      price = 1.5 * getProductionCost();
    }
    setPrice(price);
  }

}