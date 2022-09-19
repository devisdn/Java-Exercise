package childs;

import parents.Services;

public class Transportations extends Services {
  private String vehicleType;
  private String routePath;
  private Double routeMileage;

  public Transportations() {
  }

  public Transportations(String productID, String productType, String productDescription, Double costRate,
      Integer userUsage, String constCalculationType, String vehicleType, String routePath) {
    super(productID, productType, productDescription, costRate, userUsage, constCalculationType);
    this.vehicleType = vehicleType;
    this.routePath = routePath;
    calculatedProduction();
    calculatedPrice();

  }

  public Transportations(String productID, String productType, String productDescription, Double costRate,
      Integer userUsage, String constCalculationType, String vehicleType, Double routeMileage) {
    super(productID, productType, productDescription, costRate, userUsage, constCalculationType);
    this.vehicleType = vehicleType;
    this.routeMileage = routeMileage;
    calculatedProduction();
    calculatedPrice();
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getRoutePath() {
    return routePath;
  }

  public void setRoutePath(String routePath) {
    this.routePath = routePath;
  }

  public Double getRouteMileage() {
    return routeMileage;
  }

  public void setRouteMileage(Double routeMileage) {
    this.routeMileage = routeMileage;
  }

  public void calculatedProduction() {
    double productionCost = 0.0;
    if (getConstCalculationType().equalsIgnoreCase("permiles")) {
      productionCost = getRouteMileage() * getCostRate() / 2;
    } else {
      productionCost = getCostRate() * 1.0;
    }
    setProductionCost(productionCost);
  }

  public void calculatedPrice() {
    double price = 0.0;
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