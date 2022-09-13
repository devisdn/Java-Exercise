package models;

public class Material extends ProductItems {
    private String expireDate, materialsType;
    private Boolean isconsumable;
    
    public Material() {
        super();
    }

    public Material(String productId, String productType, String productDescription, Double costRate,
            Integer unitOfStock, String productionCode, String productionDate, String expireDate, String materialsType,
            Boolean isconsumable) {
        super(productId, productType, productDescription, costRate, unitOfStock, productionCode, productionDate);
        this.expireDate = expireDate;
        this.materialsType = materialsType;
        this.isconsumable = isconsumable;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getMaterialsType() {
        return materialsType;
    }

    public void setMaterialsType(String materialsType) {
        this.materialsType = materialsType;
    }

    public Boolean Isconsumable() {
        return isconsumable;
    }

    public void setIsconsumable(Boolean isconsumable) {
        this.isconsumable = isconsumable;
    }  
}
