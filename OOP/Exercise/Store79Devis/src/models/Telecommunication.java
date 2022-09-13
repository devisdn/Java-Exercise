package models;

public class Telecommunication extends ProductServices{
    private String packetType, packetLimit;
    private Integer duration;

    
    public Telecommunication() {
        super();
    }

    public Telecommunication(String productId, String productType, String productDescription, Double costRate,
            Integer userUsage, String costCalculationType, String packetType, String packetLimit, Integer duration) {
        super(productId, productType, productDescription, costRate, userUsage, costCalculationType);
        this.packetType = packetType;
        this.packetLimit = packetLimit;
        this.duration = duration;
        calculateProductionCost();
        calculateProductPrice();
    }

    @Override
    public void calculateProductionCost() {
        // TODO Auto-generated method stub
        if (super.getCostCalculationType().equalsIgnoreCase("persecond")){
            setProductionCost(super.getCostRate() * duration);
        }else if(super.getCostCalculationType().equalsIgnoreCase("perpacket")){
            if (packetType.equalsIgnoreCase("data")){
                setProductionCost(super.getCostRate() * duration * 0.7);
            }else if (packetType.equalsIgnoreCase("default")){
                setProductionCost(super.getCostRate() * duration * 0.9);
            }
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
    
}
