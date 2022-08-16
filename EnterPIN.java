import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args){
        //define variable
        Scanner input = new Scanner(System.in);
        int pin, entry;

        pin = 12345;

        System.out.println("\nWelcome to The Bank Java.");
        System.out.println("enter your pin : ");
        entry = input.nextInt();

        while(entry != pin){
            System.out.println("\nIncorrect pin, Try again!");
            System.out.println("enter your pin : ");
            entry = input.nextInt();
        }

        System.out.println("\nPin accepted, your account balance is $456");
    }
}
