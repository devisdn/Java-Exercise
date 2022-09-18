package Models;

public class Materials extends ProductItems{
    private String expiredDate, materialsType;
    private Boolean isConsumable;

    public Materials(){
        super();
    }

    public Materials(String productId, String productType, String productDescription, Double costRate, Integer unitOfStock, String productionCode, String productionDate, String expireDate, String materialsType, Boolean isConsumable){
        super(productId, productType, productDescription, costRate, unitOfStock, productionCode, productionDate);
        this.expiredDate = expireDate;
        this.materialsType = materialsType;
        this.isConsumable = isConsumable;
    }

    // getter setter
    public String getExpiredDate() {
        return expiredDate;
    }
    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
    public String getMaterialsType() {
        return materialsType;
    }
    public void setMaterialsType(String materialsType) {
        this.materialsType = materialsType;
    }
    public Boolean IsConsumable(){
        return isConsumable;
    }
    public void setConsumable(Boolean consumable) {
        isConsumable = consumable;
    }
}
