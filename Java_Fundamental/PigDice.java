import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //define variable
        int roll = 0, playerTotal, computerTotal, totalTurn = 0;
        String choice = "";

        //initialize score
        computerTotal  = 0;
        playerTotal    = 0;

        do{
            if(playerTotal < 100){
                totalTurn = 0;
                System.out.println("\nComputer has " + computerTotal + " points.");

                do{
                    roll = 1 + (int)(Math.random() * 6);
                    System.out.println("\nComputer rolled a " + roll + ".");

                    if(roll == 1){
                    
                        System.out.println("\tThat ends its turn.");
                        totalTurn = 0;
                    
                    }else{

                        totalTurn += roll;
                        System.out.println("\tComputer has " + totalTurn);
                        System.out.println(" points so far this round.\n");
                        
                        if(totalTurn < 10){
                            System.out.println("\tComputer will roll again");
                        }                       
                    }
                }while(roll != 1 && totalTurn < 10);

                computerTotal += totalTurn;
                System.out.println("\tComputer ends the round with ");
                System.out.println(computerTotal + " points.\n");
            }

            totalTurn = 0;
            System.out.println("\nPlayer has " + playerTotal + " points.");

            do{
                roll = 1 + (int)(Math.random() * 6);
                System.out.println("\nPlayer rolled a " + roll + ".");

                if(roll == 1){
                   
                    System.out.println("\tThat ends its turn.");
                    totalTurn = 0;
                
                }else{

                    totalTurn += roll;
                    System.out.println("\tYou have " + totalTurn + " points.");
                    System.out.println(" points so far this round.\n");
                    System.out.println("\tWould you like to \"roll\" again");
                    System.out.println(" or \"hold\"? ");
                    choice = input.next();
                }
            }while(roll != 1 && choice.equals("roll"));

            playerTotal += totalTurn;
            System.out.println("\tYou ends the round with " + playerTotal + " points.\n");
            
        }while(playerTotal < 50 && computerTotal < 50);

        if(playerTotal > computerTotal){
            System.out.println("Humanity wins!!");
        }else{
            System.out.println("The computer wins!!");
        }
    }
}