import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RpsGame {
    public static void main(String[] argrs){
        Scanner input = new Scanner(System.in);

        float totalDamageComputer, totalDamagePlayer, playerHealtPoint = 100, computerHealthPoint = 100;
        int defenseBreak = 2, minCriticalDamage = 6, healtPointOut = 0, minAttack = 2, maxAttack = 10, randomChoice, power = 10, criticalBonusDamage = 2, healtPointRegeneration = 2, battleRound = 1, playerAttack, computerAttack, playerDefense, computerDefense;
        boolean isCheckingValid = true, nextRound = true;
        String  playerAttackCheck = "",soutPlayerDefense = "", gameWinner = "", soutTitleGame = "" , computerTypeAttack = "", playerTypeAttack = "", player = "Player", computer = "Computer",
                titleGame = "\n\t\s\s\sRPS Battle Game",
                roundDescription = "\t\tRound ",
                battleStart = "\n\t\s\s\s\s\s\sBattle Start !",
                templateLine = "\n======================================",
                battleEnd = templateLine + "\n\t\s\s\s\s\s\sBattle End !" + templateLine,
                criticalDamageDescription = " Deal Critical Attack, Damage Increase +2",
                templateDraw = " There is no winner in this round",
                templateWin = " wins with ",
                templateGameWinner = "\nThe Winner is ",
                templateTotalDamage = " has total damage = ",
                templateWrongInputChoice = "\nWrong input, Enter Type Attack between \nR = Rock / P = Paper / S = Scissors",
                templateWrongTypeDataAttack = "\nWrong input, just insert Attack using number",
                templateWrongInputAttack = "\nWrong input, Enter Attack between 2-10!!",
                templateComputerChoiceTypeAttack = " Computer choose type attack...",
                templatePlayerSetAttack = " Set attack (2-10) = ",
                templatePlayerChoiceTypeAttack = " Choose your type attack (R/P/S) = ",
                templateHpRegen = " HP increase +2, HP = ",
                computerAttackDescription = "\n Attack = ",
                computerDefenseDescription = "\n Defense = ",
                playerDefenseDescription = " Defense = ",
                DefenseDamageBlockDescription = " use defense (";


        soutTitleGame = soutTitleGame + templateLine + titleGame + templateLine;
        System.out.println(soutTitleGame);

        do{

            System.out.println(roundDescription + battleRound + templateLine );

            //get computer set move using random class
            do{
                randomChoice = 1 + (int)(Math.random() * 3);
                if(randomChoice == 1){
                    computerTypeAttack = "Rock";
                }else if(randomChoice == 2){
                    computerTypeAttack = "Paper";
                }else{
                    computerTypeAttack = "Scissors";
                }
                computerAttack = minAttack + (int)(Math.random() * maxAttack);
                if((computerTypeAttack.equals("Rock") || computerTypeAttack.equals("Paper") || computerTypeAttack.equals("Scissors")) && (computerAttack >= minAttack || computerAttack <= maxAttack)){
                    isCheckingValid = false;
                }    
            }while(isCheckingValid);
            
            computerDefense = power - computerAttack;
            System.out.println(templateComputerChoiceTypeAttack + "(" + computerTypeAttack + ")"+ computerAttackDescription + computerAttack + computerDefenseDescription + computerDefense);

            //get player set move using Scanner class
            isCheckingValid = true;
            do{
                System.out.println(templateComputerChoiceTypeAttack);

                playerTypeAttack = input.nextLine();
                char[] data = playerTypeAttack.toCharArray();

                boolean isValid = true;
                for (char c : data){
                    if (Character.isDigit(c)){
                        isValid = false;
                        break;
                    }
                }

                if(isValid){
                }
            }while(isCheckingValid);
             do{
                System.out.print(templatePlayerChoiceTypeAttack);
                playerTypeAttack = input.next();

                if(playerTypeAttack.equalsIgnoreCase("R")
                || playerTypeAttack.equalsIgnoreCase("P")
                || playerTypeAttack.equalsIgnoreCase("S")){
                    isCheckingValid = false;
                }else{
                    System.out.println(templateWrongInputChoice + "\n");
                }
            }while(isCheckingValid);
            
            isCheckingValid = true;
            do{
                System.out.print(templatePlayerSetAttack);
                playerAttackCheck = input.next();
                playerAttack = 0;
                if(!playerAttackCheck.matches("[0-9]+")){
                    System.out.println(templateWrongTypeDataAttack + "\n");
                }else{
                    playerAttack = Integer.parseInt(playerAttackCheck);
                    if (playerAttack >= minAttack && playerAttack <= maxAttack){
                        isCheckingValid = false;
                    }else{
                        System.out.println(templateWrongInputAttack + "\n");
                    }
                }
            }while(isCheckingValid);

            playerDefense = power - playerAttack;
            soutPlayerDefense = soutPlayerDefense + playerDefenseDescription + playerDefense + "\n" + templateLine + battleStart + templateLine + "\n";
            System.out.println(soutPlayerDefense);

            if(playerTypeAttack.equalsIgnoreCase("R")){
                playerTypeAttack = "Rock";
            }else if(playerTypeAttack.equalsIgnoreCase("P")){
                playerTypeAttack = "Paper";
            }else if(playerTypeAttack.equalsIgnoreCase("S")){
                playerTypeAttack = "Scissors";
            }

            //determine the round winner
            System.out.println("\t\s\s" + computerTypeAttack + " VS " + playerTypeAttack + "\n");
            boolean playerWin = false, computerWin = false;

            if((computerTypeAttack.equals("Rock") && playerTypeAttack.equals("Scissors")
            || computerTypeAttack.equals("Paper") && playerTypeAttack.equals("Rock")
            || computerTypeAttack.equals("Scissors") && playerTypeAttack.equals("Paper"))){
                computerWin = true;
            }else{
                playerWin = true;
            }
            
            //condition if computer win
            if(computerWin){
                System.out.println(computer + templateWin + computerTypeAttack + "\n");
                System.out.println(computer + " deals a "+ computerAttack + " Damage\n");
                System.out.println(player + DefenseDamageBlockDescription + ((float)playerDefense / defenseBreak)+")");

                if (computerAttack > minCriticalDamage){
                    System.out.println(computer + criticalDamageDescription);
                    computerAttack += criticalBonusDamage;
                }

                if(computerAttack > ((float)playerDefense)){
                    totalDamageComputer = computerAttack - ((float)playerDefense / 2);
                    playerHealtPoint = playerHealtPoint - totalDamageComputer;
                    System.out.println(computer + templateTotalDamage + totalDamageComputer);
                }else{
                    playerHealtPoint += healtPointRegeneration;
                    System.out.println(player + templateHpRegen + playerHealtPoint);
                }
                System.out.println(player + " HP " + playerHealtPoint);

            //condition if player win
            }else if(playerWin){
                System.out.println(player + templateWin + playerTypeAttack + "\n");
                System.out.println(player + " deal a "+ playerAttack + " Damage\n");
                System.out.println(computer + DefenseDamageBlockDescription + ((float)computerDefense / defenseBreak)+")");

                if(playerAttack > minCriticalDamage){
                    System.out.println(player + criticalDamageDescription);
                    playerAttack += criticalBonusDamage;
                }

                if(playerAttack > ((float)computerDefense)){
                    totalDamagePlayer = playerAttack - ((float)computerDefense /2);
                    computerHealthPoint = computerHealthPoint - totalDamagePlayer;
                    System.out.println(player + templateTotalDamage + totalDamagePlayer);
                }else{
                    computerHealthPoint += healtPointRegeneration;
                    System.out.println(computer + templateHpRegen + computerHealthPoint);
                }
                System.out.println(computer + " HP " + computerHealthPoint);
            }else{
                System.out.println((templateDraw)); //if both playerMove and computerMove produces the same formation, then draw
            }

            //battle end, move on to the next round
            System.out.println(templateLine + battleEnd + templateLine);
            battleRound++;

            //condition if player or computer hp runs out
            if(playerHealtPoint <= healtPointOut || computerHealthPoint <= healtPointOut){
                nextRound = false;
            }
        }while(nextRound);
        //determine the game winner
        if(computerHealthPoint <= healtPointOut){
            gameWinner = player;
            
        }else{
            gameWinner = computer;
        }
        
        System.out.println(battleEnd);
        System.out.println(templateGameWinner + gameWinner);
    }
}