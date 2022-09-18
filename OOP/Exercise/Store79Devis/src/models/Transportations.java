package Models;

public class Transportations extends ProductServices{
    private String vehicleType, routePath;
    private Double routeMileage;

    public Transportations(){
        super();
    }
    public Transportations(String productId, String productType, String productDescription, Double costRate, Integer userUsage, String costCalculationType, String vehicleType, String routePath, Double routeMileage){
        super(productId, productType,productDescription, costRate,userUsage,costCalculationType);
        this.vehicleType = vehicleType;
        this.routePath = routePath;
        this.routeMileage = routeMileage;
        calculatedProduction();
        calculatedPrice();
    }
    public Transportations(String productId, String productType, String productDescription, Double costRate, Integer userUsage, String costCalculationType, String vehicleType, String routePath){
        super(productId, productType,productDescription, costRate,userUsage,costCalculationType);
        this.vehicleType = vehicleType;
        this.routePath = routePath;
        calculatedProduction();
        calculatedPrice();
    }
    public Transportations(String productId, String productType, String productDescription, Double costRate, Integer userUsage, String costCalculationType, String vehicleType, Double routeMileage){
        super(productId, productType,productDescription, costRate,userUsage,costCalculationType);
        this.vehicleType = vehicleType;
        this.routeMileage = routeMileage;
        calculatedProduction();
        calculatedPrice();
    }

    //getter setter


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

    @Override
    public void calculatedProduction() {
        if(super.getCostCalculationType().equalsIgnoreCase("fixperroute")){
            setProductionCost(1 * super.getCostRate());
        }else if(super.getCostCalculationType().equalsIgnoreCase("permiles")){
            setProductionCost(routeMileage * super.getCostRate() / 2);
        }
    }

    @Override
    public void calculatedPrice() {
        if (super.getUserUsage() <= 200){
            super.setPrice(getProductionCost()*1.2);
        } else if (super.getUserUsage() > 200 && super.getUserUsage() <= 500){
            super.setPrice(getProductionCost()*1.3);
        }else{
            super.setPrice(getProductionCost()*1.5);
        }
    }
}