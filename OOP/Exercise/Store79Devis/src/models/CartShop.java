package Models;
import java.util.*;

public class CartShop {
    public static final List<CartItem> CART_SHOP = new ArrayList<>();

    public static void addToCartShop(CartItem item){
        CART_SHOP.add(item);
    }
    public static List<CartItem> getDataCartShop(){
        return CART_SHOP;
    }

    public static void viewCartShop() {
        int i=1;
        Double grandTotal = Data.getGrandTotalCart();
        TemplateMenu.showHeadListCartShop();
        if (CART_SHOP.size() != 0) {
            for (CartItem data : CART_SHOP) {
                if (data.getProduct() instanceof Product) {
                    System.out.printf("| %-3s | %-14s | %-53s | %-12s | %-21s | %-27s |%n", i + ".", data.getProduct().getProductId(), data.getProduct().getProductDescription(), data.getQuantity(), Menu.indonesiaCurrency(data.getProduct().getPrice()), Menu.indonesiaCurrency(data.getTotalPrice()));
                } else {
                    System.out.printf("| %-3s | %-14s | %-53s | %-12s | %-21s | %-27s |%n", i + ".", data.getProduct().getProductId(), data.getProduct().getProductDescription(), data.getQuantity(), Menu.indonesiaCurrency(data.getProduct().getPrice()), Menu.indonesiaCurrency(data.getTotalPrice()));
                }
                i++;
            }
        }else{
            System.out.printf("|%-59s %-87s|%n"," ","Not found product at Cart!");
        }
        TemplateMenu.listCartShop();
        System.out.printf("| %-20s : %-122s |%n","Grand Total",Menu.indonesiaCurrency(grandTotal));
        TemplateMenu.listCartShop();

        String choices = choicesMenu();
        if (choices.equalsIgnoreCase("Yes")){
            Menu.updateDatasProduct();
            clearCartShop();
            Menu.MainMenu();
        }else {
            Menu.MainMenu();
        }
    }
    public static String choicesMenu(){
        String[] pilihan ={"Yes","No"};
        String choices = "";
        if (CART_SHOP.size() != 0) {
            choices = Validation.inputTypeAlphabetLimit("Check out? (Yes/No) : ", pilihan);
        }else{
            choices = Validation.inputTypeAlphabetLimit("Stay here? (Yes/No) : ", pilihan);
        }
        System.out.println("");
        return choices;
    }
    public static void clearCartShop(){
        CartShop.CART_SHOP.clear();
    }
}
