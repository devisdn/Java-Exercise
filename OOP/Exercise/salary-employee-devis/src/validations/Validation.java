package validations;
import java.util.*;

import crud.ReadEmployeeData;
import models.*;
import views.Menu;

public class Validation {
    public static final Scanner INPUT = new Scanner(System.in);
    public static int inputNumber(String question) {
        boolean isValid = false;
        String angka;
        do {
            System.out.print(question);
            angka = INPUT.next();
            isValid = angka.matches("[0-9]+");
            if (!isValid) {
                System.out.println("Maaf inputan hanya boleh berupa angka saja.Input kembali!");
            }
        } while (!isValid);
        INPUT.nextLine();
        return Integer.parseInt(angka);
      }
      public static int inputNumberLimit(String question, int min, int max) {
          boolean isRepeat;
          int angka;
          do {
              isRepeat = false;
              angka = inputNumber(question);
              if (angka < min || angka > max) {
                  System.out.println("Maaf, inputan hanya boleh dari "+min+" sampai "+max+". Input kembali!");
                  isRepeat = true;
              }
          } while (isRepeat);
          return angka;
      }
      public static int inputAge(String question) {
          boolean isRepeat;
          int angka;
          do {
              isRepeat = false;
              angka = inputNumber(question);
              if (angka < 18) {
                  System.out.println("Maaf usia tidak boleh dibawah 18. Input kembali!");
                  isRepeat = true;
              }
          } while (isRepeat);
          return angka;
      }
      public static int inputNumberLimit(String question) {
          boolean isRepeat;
          int angka;
          do {
              isRepeat = false;
              angka = inputNumber(question);
              if (angka < 0) {
                  System.out.println("Sorry, your input is under 0.\nPlease input again.");
                  isRepeat = true;
              }
          } while (isRepeat);
          return angka;
      }
      public static String inputLetterType(String question) {
        boolean isValid = false;
        String result;
        do {
            System.out.print(question);
            result = INPUT.nextLine();
            isValid = result.matches("[a-zA-Z\\s']+");
            if (!isValid) {
                System.out.println("Sorry, please input letter only.\nPlease input again.");
            }
        } while (!isValid);
        return result;
      }
      public static String inputLetterTypeWithNumber(String question) {
        boolean isValid = false;
        String result;
        do {
            System.out.print(question);
            result = INPUT.nextLine();
            isValid = result.matches("[0-9a-zA-Z\\s']+");
            if (!isValid) {
                System.out.println("Sorry, please input letter only.\nPlease input again.");
            }
        } while (!isValid);
        return result;
      }
      public static String inputLetterYesNo(String question) {
        boolean isRepeat = true, isFound;
        String result = "";
        String[] choices = {"ya", "tidak"};
        do {
            isFound = false;
            result = inputLetterType(question);
            for (String choice : choices) {
                if(result.equalsIgnoreCase(choice)) {
                    isFound = true;
                    isRepeat = false;
                }
            }
            if (!isFound) {
                System.out.println("Maaf, Masukkan hanya \"ya\" atau \"tidak\" saja. Input kembali!");
            }
        } while (isRepeat);
        return result;
      }
      public static String inputLetterLimit(String question, String[] choices) {
        boolean isRepeat = true, isFound;
        String result = "";
        do {
            isFound = false;
            result = inputLetterType(question);
            for (String choice : choices) {
                if(result.equalsIgnoreCase(choice)) {
                    isFound = true;
                    isRepeat = false;
                }
            }
            if (!isFound) {
                System.out.println("Sorry, your input is not match.\nPlease input again.");
            }
        } while (isRepeat);
        return result;
      }

      public static List<String> getAllId(){
        List<String> allId = new ArrayList<String>();
        for (Employee employee : ReadEmployeeData.allEmployee){
            allId.add(employee.getEmployeeId());
        }
        return allId;
      }
    public static Boolean checkDataById(String id){
        Boolean isFound = false;
        for (Employee data : ReadEmployeeData.allEmployee){
            if (((Employee)data).getEmployeeId().equalsIgnoreCase(id)) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public static String checkInputId(String question){
        boolean isValid = false;
        String id;
        do{
            System.out.print(question);
            id = INPUT.nextLine();
            isValid = checkDataById(id);
            if(isValid){
                System.out.println("Maaf Id sudah digunakan. Input kembali!");
            }
        }while(isValid);
        return id;
    }

    public static String inputTypeId(String question){
        boolean isValid = false;
        String id;
        do{
            System.out.print(question);
            id = INPUT.nextLine();
            isValid = checkDataById(id);
            if (isValid) {
                isValid = true;
            }
        } while(!isValid);
        return id;
    }
    public static void backToMainMenu(){
        int choice = Validation.inputNumberLimit("Ketik \"0\" untuk kembali ke main menu : ", 0, 0);
        if (choice == 0){
            Menu.mainMenu();
        }
    }
  
}