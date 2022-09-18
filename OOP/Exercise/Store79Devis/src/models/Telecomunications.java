package Models;

public class Telecomunications extends ProductServices{
    private String packetType, packetLimit;
    private Integer duration;

    public Telecomunications(){
        super();
    }
    public Telecomunications(String productId, String productType, String productDescription, Double costRate, Integer userUsage, String costCalculationType, String packetType, String packetLimit, Integer duration){
        super(productId, productType,productDescription, costRate,userUsage,costCalculationType);
        this.packetType = packetType;
        this.packetLimit = packetLimit;
        this.duration = duration;
        calculatedProduction();
        calculatedPrice();
    }

    //getter setter
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
        if (super.getCostCalculationType().equalsIgnoreCase("Per Second")){
            setProductionCost(getCostRate() * duration);
        }else{
            if (packetType.equalsIgnoreCase("Data")) {
                setProductionCost(getCostRate() * duration * PERCENTAGE_PACKAGE_DATA);
            }else{
                setProductionCost(getCostRate() * duration * PERCENTAGE_PACKAGE_DEFAULT);
            }
        }
    }
    @Override
    public void calculatedPrice() {
        if (super.getUserUsage() <= 200){
            super.setPrice(getProductionCost()*1.2);
        } else if ((super.getUserUsage() > 200) && (super.getUserUsage() <= 500)){
            super.setPrice(getProductionCost()*1.3);
        } else{
            super.setPrice(getProductionCost()*1.5);
        }
    }

}
