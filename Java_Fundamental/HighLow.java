import java.util.Scanner;

public class HighLow{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int secret, guess;
        
        secret = 1 + (int)(100 * Math.random());
        
        System.out.println("I'm thinking of a number between 1-100.");
        System.out.println("Try to guess it!");
        System.out.print("> ");
        guess = keyboard.nextInt();

        while(secret != guess){
            if(guess < secret ){
                System.out.println("Sorry, your guess is too low.");
                System.out.print("Try again.\n");
                guess = keyboard.nextInt();
            }
            if( guess > secret){
                System.out.println("Sorry, your guess is too high.");
                System.out.println("Try again.\n");
                guess = keyboard.nextInt();
            }
        }
    }
}