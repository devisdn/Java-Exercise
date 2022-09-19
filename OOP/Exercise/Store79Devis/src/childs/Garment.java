package childs;

import parents.Items;

public class Garment extends Items {
  private String garmentsType;
  private String fabrics;
  private String color;
  private String ageGrup;
  private Integer size;

  public Garment() {
    super();
  }

  public Garment(String productID, String productType, String productDescription, Double costRate, Integer unitOfStock,
      String productionCode, String productionDate, String garmentsType, String fabrics, String color, Integer size,
      String ageGrup) {
    super(productID, productType, productDescription, costRate, unitOfStock, productionCode, productionDate);
    this.garmentsType = garmentsType;
    this.fabrics = fabrics;
    this.color = color;
    this.ageGrup = ageGrup;
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

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getAgeGrup() {
    return ageGrup;
  }

  public void setAgeGrup(String ageGrup) {
    this.ageGrup = ageGrup;
  }

}