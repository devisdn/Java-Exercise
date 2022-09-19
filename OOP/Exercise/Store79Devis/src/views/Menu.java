package views;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

//import models.Model;
import repositories.StoreRepository;
// import validations.Validations;

public class Menu extends StoreRepository {

  protected static final String[] WELCOME_MENU = { "Product Item", "Product Service", "Cart Shop",
      "Searching Product" },
      PRODUCT_ITEMS = { "Food And Beverage", "Material", "Garment" },
      PRODUCT_SERVICES = { "Transportation", "Telecomunication" },
      TEMPLATE_SEARCH_PRODUCT = { "By Type", "By Description", "Recommendation" };
  protected static final String TEMPLATE_HEADER_WELCOME = "  Welcome to 79 Store  ",
      TEMPLATE_HEADER_PRODUCT_ITEMS = "   Product Item Menu   ",
      TEMPLATE_HEADER_PRODUCT_SERVICES = " Product Services Menu ",
      EXIT_MENU = "Exit             ",
      EXIT_PRODUCT = "Back To Main Menu",
      TEMPLATE_HEADER_SEARCH_PRODUCT = "   Searching Product   ",
      TEMPLATE_SEARCH_BY_TYPE = "Masukan Type Product yang dicari ",
      TEMPLATE_SEARCH_BY_DESC = "Masukan Deskripsi Product yang dicari ",
      TEMPLATE_CHOICE_MENU = "Please Choice one of The menu",
      LINE_ITEM_SERVICE = "+----+----------------+----------------------------------------------+------------+--------------------+%n",
      HEADER_ITEM_SERVICE = "| No | Product ID     | Product Description                          | Quantity   |      Price         |%n",
      FOOTER_ITEM_SERVICE = "| 00 |   Back To Main Menu                                                                             |%n",
      LiNE_CART_SHOP = "+----+----------------+------------------------------------------+------------+--------------------+--------------------+%n",
      TEMPLATE_HEADER_Cart_SHOP = "| No | Product ID     | Product Description                      | Quantity   |      Price         |  Total Price       |%n",
      LEFT_ALIGN_FORMAT_CART = "| %-2d | %-14s | %-40s | %-11s| %-18s | %-18s |%n",
      LEFT_ALIGN_FORMAT_PRODUCT = "| %-2d | %-14s | %-44s | %-11s| %-18s |%n";

  public static void getMenu(String menuHeader, String[] data, String exit) {
    String leftAlignFormat = "| %d%s %-20s  |%n";
    String lineMenu = "+--------------------------+";
    System.out.println(lineMenu);
    System.out.format("|  " + menuHeader + " |%n");
    System.out.println(lineMenu);
    for (int i = 0; i < data.length; i++) {
      System.out.format(leftAlignFormat, i + 1, ".", data[i]);
    }
    System.out.println(lineMenu);

    System.out.format("| 0. " + exit + "     |%n");
    System.out.println(lineMenu);
  }

  public static void getTemplateMenuProductHeader() {
    System.out.format(LINE_ITEM_SERVICE);
    System.out.format(HEADER_ITEM_SERVICE);
    System.out.format(LINE_ITEM_SERVICE);
  }

  public static void getTemplateMenuProductFooter() {
    System.out.format(LINE_ITEM_SERVICE);
    System.out.format(FOOTER_ITEM_SERVICE);
    System.out.format(LINE_ITEM_SERVICE);

  }

  public static void getTemplateMenuProductHeaderCart() {
    System.out.format(LiNE_CART_SHOP);
    System.out.format(HEADER_ITEM_SERVICE);
    System.out.format(LiNE_CART_SHOP);
  }

  public static String convertToCurrency(double money) {
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setMonetaryDecimalSeparator(',');
    formatRp.setGroupingSeparator('.');
    kursIndonesia.setDecimalFormatSymbols(formatRp);
    return kursIndonesia.format(money);
  }
}