package Models;

public class Garment extends ProductItems{
    private String garmentsType, fabrics, color;
    private Integer size;
    private String ageGroup;

    public Garment(){
        super();
    }
    public Garment(String productId, String productType, String productDescription, Double costRate, Integer unitOfStock, String productionCode, String productionDate, String garmentsType, String fabrics, String color, Integer size, String ageGroup) {
        super(productId, productType, productDescription, costRate, unitOfStock, productionCode, productionDate);
        this.garmentsType = garmentsType;
        this.fabrics = fabrics;
        this.color = color;
        this.size = size;
        this.ageGroup = ageGroup;
    }

    // getter setter
    public String getGarmentsType() {
        return garmentsType;
    }
    public void setGarmentsType(String garmentsType) {
        this.garmentsType = garmentsType;
    }
    public String getFabrics() {
        return fabrics;
    }
    public void setFabrics(String fabrics) {
        this.fabrics = fabrics;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    public String getAgeGroup() {
        return ageGroup;
    }    
}
