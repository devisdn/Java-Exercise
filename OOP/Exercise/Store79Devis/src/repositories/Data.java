package repositories;

import java.util.*;
import parents.*;
import childs.*;

public class Data {

  public static List<Product> allData = StoreRepository.getAllProduct();

  public static List<Product> getFoodData() {
    List<Product> returnData = new ArrayList<Product>();
    for (Product product : allData) {
      if (product instanceof FoodAndBeverage) {
        returnData.add(product);
      }
    }
    return returnData;
  }

  public static List<Product> getGarmentData() {
    List<Product> returnData = new ArrayList<Product>();
    for (Product product : allData) {
      if (product instanceof Garment) {
        returnData.add(product);
      }
    }
    return returnData;
  }

  public static List<Product> getMaterialData() {
    List<Product> returnData = new ArrayList<Product>();
    for (Product product : allData) {
      if (product instanceof Materials) {
        returnData.add(product);
      }
    }
    return returnData;
  }

  public static List<Product> getTransportationData() {
    List<Product> returnData = new ArrayList<Product>();
    for (Product product : allData) {
      if (product instanceof Transportations) {
        returnData.add(product);
      }
    }
    return returnData;
  }

  public static List<Product> getTelecommunicationData() {
    List<Product> returnData = new ArrayList<Product>();
    for (Product product : allData) {
      if (product instanceof Telecomunications) {
        returnData.add(product);
      }
    }
    return returnData;
  }

  public static List<Product> getDataByType(String searchByType) {
    List<Product> returnData = new ArrayList<Product>(allData);
    returnData.removeIf(product -> !product.getProductType().toLowerCase().contains(searchByType.toLowerCase()));
    return returnData;
  }

  public static List<Product> getDataByDescription(String searchByDescription) {
    List<Product> returnData = new ArrayList<Product>(allData);
    returnData.removeIf(product -> !product.getProductType().toLowerCase().contains(searchByDescription.toLowerCase()));
    return returnData;
  }

  public static List<Product> getRecomendation() {
    List<Product> tempRecomd = new ArrayList<Product>(Data.allData);
    Collections.sort(tempRecomd, Comparator.comparing(Product::getPrice));
    List<Product> tempItemData = new ArrayList<>();
    List<Product> tempServiceData = new ArrayList<>();
    for (Product product : tempRecomd) {
      if (product instanceof Items) {
        tempItemData.add(product);
      } else if (product instanceof Services) {
        tempServiceData.add(product);
      }
    }
    List<Product> recomendData = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      recomendData.add(tempItemData.get(i));
    }
    for (int i = 0; i < 10; i++) {
      recomendData.add(tempServiceData.get(i));
    }
    return recomendData;
  }
}