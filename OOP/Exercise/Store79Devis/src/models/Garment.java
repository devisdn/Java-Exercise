package models;

public class Garment extends ProductItems{
    private String garmentsType, fabrics, color, ageGroup;
    private Integer size;
    
    public Garment() {
        super();
    }

    public Garment(String productId, String productType, String productDescription, Double costRate,
            Integer unitOfStock, String productionCode, String productionDate, String garmentsType, String fabrics,
            String color, String ageGroup, Integer size) {
        super(productId, productType, productDescription, costRate, unitOfStock, productionCode, productionDate);
        this.garmentsType = garmentsType;
        this.fabrics = fabrics;
        this.color = color;
        this.ageGroup = ageGroup;
        this.size = size;
    }

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

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
