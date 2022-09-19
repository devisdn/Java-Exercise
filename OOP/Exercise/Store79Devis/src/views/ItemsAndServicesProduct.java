package views;

import java.util.*;
//import models.Model;
import parents.*;
import repositories.StoreRepository;

public class ItemsAndServicesProduct extends StoreRepository {

  public static void displayProduct(List<Product> listProduct) {
    Menu.getTemplateMenuProductHeader();
    String leftAlignFormat = "| %-2d | %-14s | %-44s | %-11s| %-18s |%n";
    if (listProduct.isEmpty()) {
      System.out.printf("| %-100s |", "Tidak ada data.");
    } else {
      for (int i = 0; i < listProduct.size(); i++) {
        if (listProduct.get(i) instanceof Items) {
          Items item = ((Items) listProduct.get(i));
          System.out.printf(leftAlignFormat, (i + 1), item.getProductID(),
              item.getProductDescription(), item.getUnitOfStock(),
              item.getPrice());
        } else if (listProduct.get(i) instanceof Services) {
          Services service = ((Services) listProduct.get(i));
          System.out.printf(leftAlignFormat, (i + 1), service.getProductID(),
              service.getProductDescription(), service.getUserUsage(),
              service.getPrice());
        }
      }
    }
    Menu.getTemplateMenuProductFooter();
  }
}