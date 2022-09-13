package models;

public class FoodAndBeverage extends ProductItems{
    private String expireDate, ingredients, certification;

    public FoodAndBeverage() {
        super();
    }

    public FoodAndBeverage(String productId, String productType, String productDescription, Double costRate,
            Integer unitOfStock, String productionCode, String productionDate, String expireDate, String ingredients,
            String certification) {
        super(productId, productType, productDescription, costRate, unitOfStock, productionCode, productionDate);
        this.expireDate = expireDate;
        this.ingredients = ingredients;
        this.certification = certification;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    } 
}
