import java.util.*;

public class KGBBattle{

    public static final String Kertas = "K";
    public static final String Gunting = "G";
    public static final String Batu = "B";
    public static final int power = 10;

    //Main Method
    public static void main(String [] args){
      int computerHP = 100, playerHP = 100, HealtPointOut = 0, battleRound = 1;
      String battleDraw = "", titleGame = "", roundDescription = "",
            templateRound = "\n\s\s\s\s\s" + battleRound++,
            templateTitleGame = "\n==========\n\s\s\s\s\sKGB BATTLE\s\s\s\s\s\n==========",
            templateOutputDraw = "\nBattle Draw!!" ,
            computerMove = getComputerMove(),
            playerMove  = getPlayerMove();

      do{
        titleGame = titleGame + templateTitleGame;
        roundDescription = roundDescription + templateRound;
        
        if(playerMove.equals(computerMove)){

          battleDraw = battleDraw + templateOutputDraw;
        }
      }while(computerHP > HealtPointOut || playerHP > HealtPointOut);

      if(playerMove.equals(computerMove)){
        System.out.println("\nGame is Tie!!");
      }else if(playerMove.equals(KGBBattle.Batu)){
        System.out.println(computerMove.equals(KGBBattle.Kertas) ? "\nComputer Wins" : "\nPlayer Wins");
      }else if(playerMove.equals(KGBBattle.Kertas)){
        System.out.println(computerMove.equals(KGBBattle.Gunting) ? "\nComputer Wins" : "\nPlayer Wins");
      }else{
        System.out.println(computerMove.equals(KGBBattle.Batu) ? "\nComputer Wins" : "\nPlayer Wins");
      }
    }
    
    public static String getComputerMove(){ //get computer move using Random Class nextInt() method
      String computerMove;
      Random random = new Random();
      int computerDef = 0, computerAtk = 2;
      int input = random.nextInt(3)+1;
      
      if(input == 1){
        computerMove = KGBBattle.Kertas;
      }else if(input == 2){
        computerMove = KGBBattle.Gunting;
      }else{
        computerMove = KGBBattle.Batu;
      }

      System.out.println("Computer memilih tipe serangan..." + "(" + computerMove + ")");
      
      computerAtk = (int)(Math.random() * 10);
      System.out.printf("Attack = %d" , computerAtk);
      
      computerDef = KGBBattle.power - computerAtk;
      System.out.printf("\nDefense = %d", computerDef);

        return computerMove;
      
    }

    public static String getPlayerMove(){ //get player move using Scanner Class next() method
      int playerAtk = 0, playerDef = 0;

      Scanner in = new Scanner(System.in);
      
      System.out.print("\nPilih Tipe Serangan Anda (K/G/B) : ");
      String input = in.next();
      String playerMove = input.toUpperCase();
      
      System.out.print("\nTentukan Attack = ");
      playerAtk = in.nextInt();
      System.out.println("\nPlayer memilih tipe serangan..." + "(" + playerMove + ")");
      
      System.out.printf("Attack = %d", playerAtk);
      
      playerDef = KGBBattle.power - playerAtk;
      System.out.printf("\nDefense = %d", playerDef);
      return playerMove;
    }
}