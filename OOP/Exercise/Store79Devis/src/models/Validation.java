package Models;
import java.util.*;

public class Validation {
    public static final Scanner INPUT = new Scanner(System.in);
    public static final String REGEX = "[0-9]+";

    public static int inputTypeNumberLimit(String question, int min, int max){
        boolean isValid = false;
        int angka = 0;
        do{
            angka = inputTypeNumber(question);
            if (!(angka >= min && angka <= max)) {
                System.out.println("Sorry, input number from "+min+" to "+max +"\nPlease input again.\n");
            }else{
                isValid = true;
            }
        } while(!isValid);
        return angka;
    }
    public static int inputTypeNumber(String question){
        boolean isValid = false;
        String angka;
        do{
            System.out.print(question);
            angka = INPUT.nextLine();
            isValid = validasiAngka(angka);
            if (!isValid) {
                System.out.println("Sorry, just input numbers only.\nPlease input again.\n");
            }
        } while(!isValid);
        return Integer.parseInt(angka);
    }
    //function boolean validasi angka
    public static boolean validasiAngka(String angka){
        boolean result;
        if (!angka.matches(REGEX)) {
            result = false;
        } else{
            result = true;
        }
        return result;
    }
    //Fungtion Hanya Text yang bisa di input
    public static String inputTypeAlphabet(String question){
        boolean isValid = false;
        String result;
        do {
            System.out.print(question);
            result = INPUT.nextLine();
            isValid = result.matches("[a-zA-Z\\s']+");
            if (!isValid) {
                System.out.println("Sorry, just input characters.\nPlease input again.");
            }
        } while(!isValid);
        return result;
    }
    public static String inputTypeAlphabetLimit(String question, String[] listWord){
        boolean isRepeat = true, isFound;
        String result = "";
        do {
            isFound = false;
            result = inputTypeAlphabet(question);
            for (String word : listWord) {
                if (result.equalsIgnoreCase(word)) {
                    isFound = true;
                    isRepeat = false;
                }
            }
            if (!isFound) {
                System.out.println("Input not match.\n");
            }
        } while(isRepeat);
        return result;
    }
    public static String validateProduct(String question){
        boolean isValid = false;
        String idProduct;
        do {
            System.out.print(question);
            idProduct = INPUT.nextLine();
            isValid = Data.checkDataByIdProduct(idProduct);
            if (idProduct.equalsIgnoreCase("00")){
                isValid = true;
            }else{
                if (Data.checkDataByIdProduct(idProduct)) {
                    isValid = true;
                }else {
                    System.out.println("Sorry, Id Product not found!\nPlease input again.\n");
                }
            }
        } while(!isValid);
        return idProduct;
    }
}
