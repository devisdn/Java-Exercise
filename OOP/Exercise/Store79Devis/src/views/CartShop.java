package views;

import java.util.List;

import java.util.ArrayList;

import parents.CartItem;
import parents.Items;
import parents.Product;
import parents.Services;
import validations.Validations;

public class CartShop {

  public static final List<CartItem> CART_SHOP = new ArrayList<>();

  public static void addToCART_SHOP(CartItem item) {
    CART_SHOP.add(item);
  }

  public static List<CartItem> getDataCART_SHOP() {
    return CART_SHOP;
  }

  public static void choisingListProduct(String choices) {
    if (choices.equalsIgnoreCase("00")) {
      App.MainMenu();
    } else {
      addToCart(choices);
    }
  }

  public static String choiceProductId() {
    String choices;
    choices = Validations.validateProduct("Please choice menu : ");
    System.out.println("");
    return choices;
  }

  public static String choicesMenu() {
    String[] pilihan = { "Yes", "No" };
    String choices = "";
    if (CART_SHOP.size() != 0) {
      choices = Validations.inputTypeAlphabetLimit("Check out? (Yes/No) : ", pilihan);
    } else {
      choices = Validations.inputTypeAlphabetLimit("Stay here? (Yes/No) : ", pilihan);
    }
    System.out.println("");
    return choices;
  }

  public static CartItem addToCart(String idProduct) {
    CartItem item = new CartItem();
    List<Product> product = new ArrayList<>();
    Boolean isLooping = true;
    do {
      Integer stockBarang = getStockByIDProduct(idProduct);
      product = getProductByID(idProduct);
      Integer cartTotalProduct = getIndexCART_SHOPById(idProduct);
      Integer quantity;
      for (Product data : product) {
        if (data.getProductType().equalsIgnoreCase("FoodandBeverages")
            || data.getProductType().equalsIgnoreCase("Garment") || data.getProductType()
                .equalsIgnoreCase("Material")) {
          quantity = Validations.inputTypeNumberLimit("Input Total Product : ", 1, (stockBarang
              - cartTotalProduct));
        } else {
          quantity = Validations.inputTypeNumber("Input Total Product : ");
        }
        if (quantity > 0) {
          // Menu.getTemplateMenuProductHeaderCart();
          if (data instanceof Items) {
            if ((quantity + cartTotalProduct) <= stockBarang) {
              item = new CartItem(data, quantity);
              isLooping = false;
            } else {
              System.out.println("Sorry, the quantity you purchased exceeds the stock item.\n");
            }
          } else {
            item = new CartItem(data, quantity);
            isLooping = false;
          }
          if (!isLooping) {
            Integer indexProductCart = getIndexCART_SHOPById(idProduct);
            if (cartTotalProduct != 0) {
              int totalBefore = getDataCART_SHOP().get(indexProductCart).getQuantity();
              Double priceProduct = getDataCART_SHOP().get(indexProductCart).getProduct().getPrice();
              getDataCART_SHOP().get(indexProductCart).setQuantity(totalBefore + quantity);
              getDataCART_SHOP().get(indexProductCart).setTotalPrice(priceProduct * (totalBefore + quantity));
            } else {
              addToCART_SHOP(item);
            }
          }
        } else {
          System.out.println("Sorry, the number of items cannot be 0.\n");
        }
      }
    } while (isLooping);

    String buyAgain = choiceBuyAgain();
    if (buyAgain.equalsIgnoreCase("Yes")) {
      App.MainMenu();
    } else {
      viewCART_SHOP();
    }

    return item;
  }

  public static Integer getStockByIDProduct(String productId) {
    Integer jumlah = 0;
    for (Product data : repositories.Data.allData) {
      if (data instanceof Items && data.getProductID().equalsIgnoreCase(productId)) {
        jumlah = ((Items) data).getUnitOfStock();
      }
    }
    return jumlah;
  }

  public static String choiceBuyAgain() {
    String[] choice = { "Yes", "No" };
    String choices;
    choices = Validations.inputTypeAlphabetLimit("Do you want to buy another Product (Yes/No) : ", choice);
    System.out.println("");
    return choices;
  }

  public static Integer getIndexCART_SHOPById(String idProduct) {
    List<CartItem> data = new ArrayList<>();
    data = getDataCART_SHOP();
    int index = 0, i = 0;
    for (CartItem produk : data) {
      if (produk.getProduct().getProductID().equalsIgnoreCase(idProduct)) {
        index = i;
      }
      i++;
    }
    return index;
  }

  public static void viewCART_SHOP() {
    int i = 1;
    Double grandTotal = getGrandTotalCart();
    Menu.getTemplateMenuProductHeader();
    if (CART_SHOP.size() != 0) {
      for (CartItem data : CART_SHOP) {
        if (data.getProduct() instanceof Product) {
          System.out.format(Menu.LEFT_ALIGN_FORMAT_PRODUCT, i++,
              data.getProduct().getProductID(), data.getProduct().getProductDescription(), data.getQuantity(),
              Menu.convertToCurrency(data.getProduct().getPrice()), Menu.convertToCurrency(data.getTotalPrice()));
        } else if (data.getProduct() instanceof Services) {
          System.out.printf(Menu.LEFT_ALIGN_FORMAT_PRODUCT, i++, data.getProduct().getProductID(),
              data.getProduct().getProductDescription(), data.getQuantity(),
              Menu.convertToCurrency(data.getProduct().getPrice()), Menu.convertToCurrency(data.getTotalPrice()));
        }
        i++;
      }
    } else {
      System.out.printf("|%-59s %-87s|%n", " ", "Not found product at Cart!");
    }
    System.out.format(Menu.LINE_ITEM_SERVICE);
    System.out.format("| 00 |" + "Grand Total         " + Menu.convertToCurrency(grandTotal)
        + "                                                                |%n");
    System.out.format(Menu.LINE_ITEM_SERVICE);
    String choices = choicesMenu();
    if (choices.equalsIgnoreCase("Yes")) {
      updateDataProduct(CART_SHOP);
      App.MainMenu();
    } else {
      App.MainMenu();
    }
  }

  public static void updateDataProduct(List<CartItem> cartShop) {
    Integer jenisBarang = cartShop.size();

    for (int i = 0; i < jenisBarang; i++) {
      for (Product product : repositories.Data.allData) {
        String idProduct = cartShop.get(i).getProduct().getProductID();
        if (product.getProductID().equalsIgnoreCase(idProduct)) {
          if (product instanceof Items) {
            Integer stockTerbaru = ((Items) product).getUnitOfStock() - cartShop.get(i).getQuantity();
            ((Items) product).setUnitOfStock(stockTerbaru);
            product.calculatedPrice();
          }
          if (product instanceof Services) {
            Integer userUsage = ((Services) product).getUserUsage() + cartShop.get(i).getQuantity();
            ((Services) product).setUserUsage(userUsage);
            product.calculatedPrice();
          }
        }
      }
    }
  }

  public static List<Product> getProductByID(String idProduct) {
    List<Product> barang = new ArrayList<>();
    for (Product data : repositories.Data.allData) {
      if (data.getProductID().equalsIgnoreCase(idProduct)) {
        barang.add(data);
      }
    }
    return barang;
  }

  public static Integer getTotalCartShopByID(String idProduct) {
    List<CartItem> data = new ArrayList<>();
    data = getDataCART_SHOP();
    int totalProduct = 0;
    for (CartItem produk : data) {
      if (produk.getProduct().getProductID().equalsIgnoreCase(idProduct)) {
        totalProduct = produk.getQuantity();
      }
    }
    return totalProduct;
  }

  public static Integer getIndexCartShopById(String idProduct) {
    List<CartItem> data = new ArrayList<>();
    data = getDataCART_SHOP();
    int index = 0, i = 0;
    for (CartItem produk : data) {
      if (produk.getProduct().getProductID().equalsIgnoreCase(idProduct)) {
        index = i;
      }
      i++;
    }
    return index;
  }

  public static Double getGrandTotalCart() {
    List<CartItem> data = new ArrayList<>();
    data = getDataCART_SHOP();
    Double total = 0.0;

    for (CartItem product : data) {
      total += product.getTotalPrice();
    }
    return total;
  }

  public static boolean checkDataByIDProduct(String idProduct) {
    Boolean isFound = false;
    for (Product data : repositories.Data.allData) {
      if (data.getProductID().equalsIgnoreCase(idProduct)) {
        isFound = true;
      }
    }
    return isFound;
  }
}
