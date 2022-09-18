package Models;

public class TemplateMenu {
    public static void showMainMenu(){
        System.out.printf("| 1. %-19s |%n","Product Item");
        System.out.printf("| 2. %-19s |%n","Product Service");
        System.out.printf("| 3. %-19s |%n","Cart Shop");
        System.out.printf("| 4. %-19s |%n","Searching Product");
        System.out.printf("| 0. %-19s |%n","Exit");
        miniList();
    }
    public static void showItemMenu(){
        System.out.printf("| 1. %-19s |%n","Food and Beverage");
        System.out.printf("| 2. %-19s |%n","Material");
        System.out.printf("| 3. %-19s |%n","Garment");
        System.out.printf("| 0. %-19s |%n","Back to Main Menu");
        miniList();
    }
    public static void showServiceMenu(){
        System.out.printf("| 1. %-19s |%n","Telecommunication");
        System.out.printf("| 2. %-19s |%n","Transportation");
        System.out.printf("| 0. %-19s |%n","Back to Main Menu");
        miniList();
    }
    public static void showSearchingMenu(){
        System.out.printf("| 1. %-19s |%n","by Type");
        System.out.printf("| 2. %-19s |%n","by Description");
        System.out.printf("| 3. %-19s |%n","Recommendation");
        System.out.printf("| 0. %-19s |%n","Back to Main Menu");
        miniList();
    }
    public static void showFooterList(){
        largeList();
        System.out.printf("| %-3s | %-109s |%n","00 ","Back to Main Menu");
        largeList();
    }
    public static void showHeadList(){
        largeList();
        System.out.printf("| %-3s |   %-10s   |                  %-19s                  |  %-10s  |         %-5s         | %n","No.","Product ID","Product Description","Stock/User","Price");
        largeList();
    }
    public static void showHeadListCartShop(){
        listCartShop();
        System.out.printf("| %-3s |   %-10s   |                  %-19s                  |  %-10s  |         %-5s         |         %-11s         |%n","No.","Product ID","Product Description"," Quantity ","Price","Total Price");
        listCartShop();
    }
    public static void showTitle(String title){
        miniList();
        System.out.printf("|  %-20s  |%n",title);
        miniList();
    }
    public static void listCartShop(){
        System.out.println("+---------------------------------------------------------------------------------------------------------------------------------------------------+");
    }
    public static void largeList(){
        System.out.println("+---------------------------------------------------------------------------------------------------------------------+");
    }
    public static void miniList(){
        System.out.printf("+%-23s+%n","------------------------");
    }
}
