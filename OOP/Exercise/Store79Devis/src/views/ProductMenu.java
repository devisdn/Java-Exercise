package views;

import repositories.*;
import validations.Validations;

public class ProductMenu {
    public static void itemMenu() {
        Menu.getMenu(Menu.TEMPLATE_HEADER_PRODUCT_ITEMS, Menu.PRODUCT_ITEMS, Menu.EXIT_PRODUCT);
        int choiseMenu = Validations.inputTypeNumberLimit(Menu.TEMPLATE_CHOICE_MENU, 0, 3);
        switch (choiseMenu) {
            case 1:
                ItemsAndServicesProduct.displayProduct(Data.getFoodData());
                break;
            case 2:
                ItemsAndServicesProduct.displayProduct(Data.getGarmentData());
                break;
            case 3:
                ItemsAndServicesProduct.displayProduct(Data.getMaterialData());
                break;
            default:
                App.MainMenu();
        }
    }

    public static void serviceMenu() {
        Menu.getMenu(Menu.TEMPLATE_HEADER_PRODUCT_SERVICES, Menu.PRODUCT_SERVICES, Menu.EXIT_PRODUCT);
        int choiseMenu = Validations.inputTypeNumberLimit(Menu.TEMPLATE_CHOICE_MENU, 0, 2);
        switch (choiseMenu) {
            case 1:
                ItemsAndServicesProduct.displayProduct(Data.getTransportationData());
                break;
            case 2:
                ItemsAndServicesProduct.displayProduct(Data.getTelecommunicationData());
                break;
            default:
                App.MainMenu();
        }
    }

    public static void searchMenu() {
        Menu.getMenu(Menu.TEMPLATE_HEADER_SEARCH_PRODUCT, Menu.TEMPLATE_SEARCH_PRODUCT, Menu.EXIT_PRODUCT);
        int choiseMenu = Validations.inputTypeNumberLimit(Menu.TEMPLATE_CHOICE_MENU, 0, 3);
        switch (choiseMenu) {
            case 1:
                String type = Validations.inputTypeAlphabet(Menu.TEMPLATE_SEARCH_BY_TYPE);
                ItemsAndServicesProduct.displayProduct(Data.getDataByType(type));
                break;
            case 2:
                String description = Validations.inputTypeAlphabet(Menu.TEMPLATE_SEARCH_BY_DESC);
                ItemsAndServicesProduct.displayProduct(Data.getDataByDescription(description));
                break;
            case 3:
                ItemsAndServicesProduct.displayProduct(Data.getRecomendation());
                break;
            default:
                App.MainMenu();
        }
    }
}