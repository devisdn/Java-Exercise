package models;

public class Transportation extends ProductServices{
    private String vehicleType, routePath;
    private Double routeMileage;
    
    public Transportation() {
        super();
    }
    
    public Transportation(String productId, String productType, String productDescription, Double costRate,
            Integer userUsage, String costCalculationType, String vehicleType, String routePath) {
        super(productId, productType, productDescription, costRate, userUsage, costCalculationType);
        this.vehicleType = vehicleType;
        this.routePath = routePath;
        calculateProductionCost();
        calculateProductPrice();
    }

    public Transportation(String productId, String productType, String productDescription, Double costRate,
            Integer userUsage, String costCalculationType, String vehicleType, Double routeMileage) {
        super(productId, productType, productDescription, costRate, userUsage, costCalculationType);
        this.vehicleType = vehicleType;
        this.routeMileage = routeMileage;
        calculateProductionCost();
        calculateProductPrice();
    }

    public Transportation(String productId, String productType, String productDescription, Double costRate,
            Integer userUsage, String costCalculationType, String vehicleType, String routePath, Double routeMileage) {
        super(productId, productType, productDescription, costRate, userUsage, costCalculationType);
        this.vehicleType = vehicleType;
        this.routePath = routePath;
        this.routeMileage = routeMileage;
        calculateProductionCost();
        calculateProductPrice();
    }

    @Override
    public void calculateProductionCost() {
        // TODO Auto-generated method stub
        if(super.getCostCalculationType().equalsIgnoreCase("fixperroute")){
            setProductionCost(1 * super.getCostRate());
        }else if(super.getCostCalculationType().equalsIgnoreCase("permiles")){
            setProductionCost(routeMileage * super.getCostRate() / 2);
        }
    }
    @Override
    public void calculateProductPrice() {
        // TODO Auto-generated method stub
        Double price = 0.0;
        if (super.getUserUsage() <= 200){
            price = 1.2 * super.getProductionCost();
        } else if (super.getUserUsage() > 200 && super.getUserUsage() <= 500){
            price = 1.3 * super.getProductionCost();
        } else {
            price = 1.5 * super.getProductionCost();
        }
        super.setPrice(price);
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
    
}
