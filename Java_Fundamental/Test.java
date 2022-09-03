import java.util.Scanner;
public class Test { 
    public static void main(String[] args) { 
        String str = "978";
        System.out.println("Checking for string that has only numbers...");
        System.out.println("String: "+str);
        if(str.matches("[0-9]+") && str.length() > 2)
        System.out.println("String has only numbers!");
        else
        System.out.println("String consist of characters as well!");
    } 
}