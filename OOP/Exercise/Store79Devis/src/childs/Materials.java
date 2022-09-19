package childs;

import parents.Items;

public class Materials extends Items {
  private String expiredDate;
  private String materialsType;
  private Boolean isComsumable;

  public Materials() {
  }

  public Materials(String productID, String productType, String productDescription, Double costRate,
      Integer unitOfStock,
      String productionCode, String productionDate, String expiredDate, String materialsType, Boolean isComsumable) {
    super(productID, productType, productDescription, costRate, unitOfStock, productionCode, productionDate);
    this.expiredDate = expiredDate;
    this.materialsType = materialsType;
    this.isComsumable = isComsumable;
  }

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

  public Boolean isComsumable() {
    return isComsumable;
  }

  public void setIsComsumable(Boolean isComsumable) {
    this.isComsumable = isComsumable;
  }

}