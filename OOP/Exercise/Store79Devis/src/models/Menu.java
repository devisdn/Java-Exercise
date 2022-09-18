package Models;
import java.util.*;
import java.text.*;

public class Menu {
    public static void MainMenu(){
        int choices;

        TemplateMenu.showTitle("Welcome To 79 Store");
        TemplateMenu.showMainMenu();
        choices = Menu.choiceMenu(4);
        if (choices == 1){
            showMenuItem();
        } else if (choices == 2) {
            showMenuServices();
        } else if (choices == 3) {
            showCartShop();
        } else if (choices == 4) {
            showMenuSearch();
        }
    }
    public static void showMenuItem(){
        TemplateMenu.showTitle("Product Item Menu");
        TemplateMenu.showItemMenu();
        int choices = Menu.choiceMenu(3);
        if (choices == 0){
            MainMenu();
        } else if (choices == 1) {
            Menu.listProduct("Food and Beverage");
        } else if (choices == 2) {
            Menu.listProduct("Materials");
        } else {
            Menu.listProduct("Garment");
        }
    }
    public static void showMenuServices(){
        TemplateMenu.showTitle("Product Service Menu");
        TemplateMenu.showServiceMenu();
        int choices = Menu.choiceMenu(2);
        if (choices == 0){
            MainMenu();
        } else if (choices == 1) {
            Menu.listProduct("Telecomunications");
        } else {
            Menu.listProduct("Transportations");
        }
    }
    public static void showCartShop(){
        CartShop.viewCartShop();
    }
    public static void showMenuSearch(){
        TemplateMenu.showTitle("Searching Product");
        TemplateMenu.showSearchingMenu();
        int choices = Menu.choiceMenu(3);
        if (choices == 0){
            MainMenu();
        } else if (choices == 1) {
            Menu.searchProduct("by Type");
        } else if (choices == 2){
            Menu.searchProduct("by Description");
        } else {
            Menu.listRecommendation();
        }
    }
    public static void listProduct(String keyword){
        String choices;
        TemplateMenu.showHeadList();
        Data.showDataProductItems(keyword);
        TemplateMenu.showFooterList();
        choices = choiceMenu();
        choisingListProduct(choices);
    }
    public static void listRecommendation(){
        TemplateMenu.showHeadList();
        Data.showRecommendation();
        TemplateMenu.showFooterList();
        String choices = choiceMenu();
        choisingListProduct(choices);
    }
    public static void searchProduct(String param){
        String choice = inputWords();
        TemplateMenu.showHeadList();
        Data.showDataByKeyword(param,choice);
        TemplateMenu.showFooterList();
        String choices = choiceMenu();
        choisingListProduct(choices);
    }
    public static void updateDatasProduct() {
        Integer jenisBarang = CartShop.CART_SHOP.size();

        for (int i=0; i<jenisBarang; i++){
            for (Product data : Data.LIST_DATA) {
                String idProduct = CartShop.CART_SHOP.get(i).getProduct().getProductId();
                if (data.getProductId().equalsIgnoreCase(idProduct)){
                    if (data instanceof ProductItems){
                        Integer stockTerbaru = ((ProductItems) data).getUnitOfStock() - CartShop.CART_SHOP.get(i).getQuantity();
                        ((ProductItems) data).setUnitOfStock(stockTerbaru);
                        data.calculatedPrice();
                    }else{
                        Integer userUsage = ((ProductServices) data).getUserUsage() + CartShop.CART_SHOP.get(i).getQuantity();
                        ((ProductServices) data).setUserUsage(userUsage);
                        data.calculatedPrice();
                    }
                }
            }
        }
    }
    public static void choisingListProduct(String choices){
        if (choices.equalsIgnoreCase("00")){ // jika memilih kembali ke menu utama
            MainMenu();
        } else{ // jika memilih kode produk
            addToCart(choices);
        }
    }
    public static CartItem addToCart(String idProduct){
        CartItem item = new CartItem();
        List<Product> product = new ArrayList<>();
        Boolean isLooping = true;
        do {
            Integer stockBarang = Data.getStockByIdProduct(idProduct);
            Integer jumlahBarang = Validation.inputTypeNumber("Input jumlah barang : ");
            product = Data.getProductById(idProduct);
            int jumlahBarangdiCart = Data.getjmlBarangCartShopById(idProduct);
            for (Product data : product) {
                if (data instanceof ProductItems) {
                    if ((jumlahBarang + jumlahBarangdiCart) <= stockBarang) {
                        item = new CartItem(data, jumlahBarang);
                        isLooping = false;
                    } else {
                        System.out.println("Maaf, jumlah yang anda beli melebihi stok barang.\n");
                    }
                } else {
                    item = new CartItem(data, jumlahBarang);
                    isLooping = false;
                }

                if (!isLooping) { // jika sudah input data dengan benar
                    Integer indexBarangdiCart = Data.getindexBarangCartShopById(idProduct);
                    if (jumlahBarangdiCart != 0) {
                        int jumlahSebelumnya = CartShop.getDataCartShop().get(indexBarangdiCart).getQuantity();
                        Double hargaBarang = CartShop.getDataCartShop().get(indexBarangdiCart).getProduct().getPrice();
                        //tambah jumlah barang di cart
                        CartShop.getDataCartShop().get(indexBarangdiCart).setQuantity(jumlahSebelumnya + jumlahBarang);
                        //update total harga
                        CartShop.getDataCartShop().get(indexBarangdiCart).setTotalPrice(hargaBarang * (jumlahSebelumnya + jumlahBarang));
                    } else {
                        CartShop.addToCartShop(item);
                    }
                }
            }
        }while (isLooping);

        String shopAgain = choiceShopAgain();
        if (shopAgain.equalsIgnoreCase("Yes")){
            MainMenu();
        }else {
            showCartShop();
        }
        return item;
    }
    public static String choiceShopAgain(){
        String[] pilihan ={"Yes","No"};
        String choices;
        choices = Validation.inputTypeAlphabetLimit("Do you want to buy other product (Yes/No) : ", pilihan);
        System.out.println("");
        return choices;
    }
    public static String inputWords(){
        String words = Validation.inputTypeAlphabet("Insert keyword to search  : ");
        return words;
    }
    public static Integer choiceMenu(Integer max){
        int choices;
        choices = Validation.inputTypeNumberLimit("Please choice menu : ",0,max);
        System.out.println("");
        return choices;
    }
    public static String choiceMenu(){
        String choices;
        choices = Validation.validateProduct("Please choice menu : ");
        System.out.println("");
        return choices;
    }
    //Function untung Format Rupiah
    public static String indonesiaCurrency(double formatter){
        DecimalFormat indonesiaCurrency = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        indonesiaCurrency.setDecimalFormatSymbols(formatRp);
        return indonesiaCurrency.format(formatter);
    }


}
