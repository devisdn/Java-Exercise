import java.util.Scanner;

public class CoinFlip {
    public static void main(String[]args){
        Scanner keyboard =  new Scanner(System.in);
        String coin,again;
        int streak = 0;
        boolean gotHeads;
        
        do{
            gotHeads = Math.random() < 0.5;
            
            if(gotHeads)
                coin = "HEAD";
            else
                coin = "TAILS";
            
            System.out.println("You flip a coin and it is ..."+  coin);
            
            if(gotHeads){
                streak++;
                System.out.println("\tThat's" + streak + " in a row ...");
                System.out.print("\tWould you like to flip again(y/n)? ");
                again = keyboard.next();
            }
            else{
                System.out.println("\tYou lose everything!");
                System.out.println("\tShould've quit while you were a HEAD ....");
                streak = 0 ;
                again = "n";
            }
        }while(again.equals("y"));
        
        System.out.println("Final score = " + streak); 
    }
}