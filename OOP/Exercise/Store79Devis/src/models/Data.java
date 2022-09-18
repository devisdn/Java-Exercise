package Models;
import java.util.*;
import Repositories.*;

public class Data {
    public static final ProductRepository PRODUCT_REPOSITORY = new ProductRepository();
    public static final List<Product> LIST_DATA = ProductRepository.getAllProduct();

    public static List<Product> getProductById(String idProduct){
        List<Product> barang = new ArrayList<>();
        for (Product data : LIST_DATA) {
            if (data.getProductId().equalsIgnoreCase(idProduct)) {
                barang.add(data);
            }
        }
        return barang;
    }
    public static Double getGrandTotalCart(){
        List<CartItem> data = new ArrayList<>();
        data = CartShop.getDataCartShop();
        Double total = 0.0;

        for (CartItem product : data) {
            total += product.getTotalPrice();
        }
        return total;
    }
    public static Integer getjmlBarangCartShopById(String idProduct){
        List<CartItem> data = new ArrayList<>();
        data = CartShop.getDataCartShop();
        int jumlahBarang=0;

        for (CartItem produk : data) {
            if (produk.getProduct().getProductId().equalsIgnoreCase(idProduct)){
                jumlahBarang = produk.getQuantity();
            }
        }
        return jumlahBarang;
    }
    public static Integer getindexBarangCartShopById(String idProduct){
        List<CartItem> data = new ArrayList<>();
        data = CartShop.getDataCartShop();
        int index=0, i=0;

        for (CartItem produk : data) {
            if (produk.getProduct().getProductId().equalsIgnoreCase(idProduct)){
                index = i;
            }
            i++;
        }
        return index;
    }
    public static Integer getStockByIdProduct(String productId){
        Integer jumlah = 0;
        for (Product data : LIST_DATA) {
            if (data instanceof ProductItems && data.getProductId().equalsIgnoreCase(productId)){
                jumlah = ((ProductItems) data).getUnitOfStock();
            }
        }
     return jumlah;
    }
    public static Boolean checkDataByIdProduct(String productId){
        Boolean isFound = false;
        for (Product data : LIST_DATA) {
            if (data.getProductId().equalsIgnoreCase(productId)){
                isFound = true;
            }
        }
        return isFound;
    }
    public static void showRecommendation(){
        Collections.sort(LIST_DATA, Comparator.comparing(Product :: getPrice));
        List<Product> tempItemData = new ArrayList<>();
        List<Product> tempServiceData = new ArrayList<>();

        for (Product data : LIST_DATA) {
           if (data instanceof ProductItems){
              tempItemData.add(data);
           }else {
              tempServiceData.add(data);
           }
        }
        List<Product> dataRecommendation = new ArrayList<>();
        for (int i=0; i<10; i++){
            dataRecommendation.add(tempItemData.get(i));
        }
        for (int i=0; i<10; i++){
            dataRecommendation.add(tempServiceData.get(i));
        }
        int i=1;
        for (Product data : dataRecommendation) {
            if (data instanceof ProductItems){
                System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((ProductItems) data).getUnitOfStock(),Menu.indonesiaCurrency(data.getPrice()));
            }else {
                System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((ProductServices) data).getUserUsage(),Menu.indonesiaCurrency(data.getPrice()));
            }
            i++;
        }
    }
    public static void showDataByKeyword(String param, String keyword){
        if (param.equalsIgnoreCase("by Type")){
            showDataByTypeProduct(LIST_DATA, keyword);
        } else{
            showDataByDescription(LIST_DATA, keyword);
        }
    }
    public static void showDataByDescription(List<Product> listData, String keyword){
        int i=1;
        for (Product data : listData) {
            if (data.getProductDescription().contains(keyword)){
                if (data.getProductType().equalsIgnoreCase("product")){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((ProductItems) data).getUnitOfStock(),Menu.indonesiaCurrency(data.getPrice()));
                }else if (data.getProductType().equalsIgnoreCase("services")){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((ProductServices) data).getUserUsage(),Menu.indonesiaCurrency(data.getPrice()));
                }
                i++;
            }
        }
    }
    public static void showDataByTypeProduct(List<Product> listData, String keyword){
        int i=1;
        for (Product data : listData) {
            if (data.getProductType().equalsIgnoreCase(keyword)){
                if (keyword.equalsIgnoreCase("product")){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((ProductItems) data).getUnitOfStock(),Menu.indonesiaCurrency(data.getPrice()));
                }else if (keyword.equalsIgnoreCase("services")){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((ProductServices) data).getUserUsage(),Menu.indonesiaCurrency(data.getPrice()));
                }
                i++;
            }
        }
    }
    public static void showDataProductItems(String keyword) {
        int i=1;
        for (Product data : LIST_DATA) {
            if (keyword.equalsIgnoreCase("food and beverage")){
                if (data instanceof FoodAndBeverage){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((FoodAndBeverage) data).getUnitOfStock(),Menu.indonesiaCurrency(data.getPrice()));
                    i++;
                }
            } else if (keyword.equalsIgnoreCase("Materials")){
                if (data instanceof Materials){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((Materials) data).getUnitOfStock(),Menu.indonesiaCurrency(data.getPrice()));
                    i++;
                }
            } else if (keyword.equalsIgnoreCase("garment")){
                if (data instanceof Garment){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((Garment) data).getUnitOfStock(),Menu.indonesiaCurrency(data.getPrice()));
                    i++;
                }
            } else if (keyword.equalsIgnoreCase("Telecomunications")){
                if (data instanceof Telecomunications){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((Telecomunications) data).getUserUsage(),Menu.indonesiaCurrency(data.getPrice()));
                    i++;
                }
            } else{
                if (data instanceof Transportations){
                    System.out.printf("| %-3s |  %-12s  | %-53s | %-12s | %-21s | %n",i+".",data.getProductId(),data.getProductDescription(),((Transportations) data).getUserUsage(),Menu.indonesiaCurrency(data.getPrice()));
                    i++;
                }
            }
        }
    }

}