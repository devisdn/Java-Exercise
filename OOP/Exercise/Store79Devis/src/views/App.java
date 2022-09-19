package views;

import validations.*;

public class App {
    public static void main(String[] args) {
        MainMenu();
    }

    public static void MainMenu() {
        Menu.getMenu(Menu.TEMPLATE_HEADER_WELCOME, Menu.WELCOME_MENU, Menu.EXIT_MENU);
        int choiseMenu = Validations.inputTypeNumberLimit(Menu.TEMPLATE_CHOICE_MENU, 0, 4);
        switch (choiseMenu) {
            case 1:
                // Menu.getMenu(Menu.TEMPLATE_HEADER_PRODUCT_ITEMS, Menu.PRODUCT_ITEMS,
                // Menu.EXIT_PRODUCT);
                ProductMenu.itemMenu();
                break;
            case 2:
                // Menu.getMenu(Menu.TEMPLATE_HEADER_PRODUCT_SERVICES, Menu.PRODUCT_SERVICES,
                // Menu.EXIT_PRODUCT);
                ProductMenu.serviceMenu();
                break;
            case 3:
                // Model.viewCartShop();
                break;
            case 4:
                ProductMenu.searchMenu();
                break;
            default:
                break;
        }
    }

}