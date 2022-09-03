import java.util.*;

public class RSPGame{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		String  setOfTypeAtk = "RSP", setTag ="", soutTitleGame ="", soutWinner = "",soutBattleEnd = "", soutVersus="", soutSetPlayerAtk, soutBattleRound = "", changeCharacterComputer = "", changeCharacterPlayer = "", winner = "",
                player = " Devis",
                computer = "Computer", 
                line = "\n======================================",
				templateTitleGame = "\n\s\s\s\s\s\sRSP Game Battle",
				templateRound = "\s\s\s\s\sRound ",
                templatePlayerSetAtk = " Tentukan attack (2-10) = ",
                templateWinner = " .\n" + " .\n Battle berakhir," + winner + " Win!",
                templateBattleEnd = line + "\n\s\s\s\s\sBattle End !" + line,
                templatePlayerHp = "\n Player HP : ",
                templateComputerHp = "\n Computer HP : ",
				battleStart = "\n\s\s\s\s\sBattle Start !",
				templateComputerTypeAtk = " Computer choose type attack...\n Attack = %d \n Deffense = %d\n",
				userSetTypeAttack = " Choose your type attack (R/S/P) = ",
				deffenseDamage = " use defense (Damage -",
				criticalAttack = " Deal Critical Attack, Damage Increase +2";
		float 	playerHp = 100, computerHp = 100, totalDamageComputer, totalDamagePlayer; 
		Character playerTypeAtk, computerTypeAtk; 
		int 	healthPointOut = 1, power = 10, playerAtk = 0, computerAtk = 2, playerDef = 0, computerDef = 0, battleRound = 1, regenerationHp = 2, criticalBonusDamage = 2, defenseBreak = 2;
        boolean checkInput = true, roundAgain = true; 

		soutTitleGame = soutTitleGame + line + templateTitleGame + line;

		do{	
			boolean playerWin = false, computerWin = false;

			soutBattleRound = soutBattleRound + templateRound + battleRound + line;

			//initialize computer type attack, attack and defense
        	int charLength = random.nextInt(setOfTypeAtk.length());

				computerTypeAtk 	= setOfTypeAtk.charAt(charLength);
				do {
					computerAtk 	= random.nextInt(10) + 1;
					if (computerAtk > 1) {
						checkInput = false;
					}
				}while(checkInput);	
				
				computerDef	= power - computerAtk;
				System.out.printf(computerTypeAtk+"\n", computerAtk, computerDef);

			//initialize player type attack, attack and defense
				checkInput = true;
				do{
					System.out.print(userSetTypeAttack);
					playerTypeAtk = input.next().charAt(0);
					if (playerTypeAtk.equals('R') || playerTypeAtk.equals('S') || playerTypeAtk.equals('P')) {
						checkInput = false;
					}
				}while(checkInput);

				checkInput = true; // return value checkInput to true
				do{ // looping if user enter wrong value
					soutSetPlayerAtk = soutBattleRound + templatePlayerSetAtk;
					playerAtk 	 = input.nextInt();
					if (playerAtk > 1 && playerAtk <= 10) {
						checkInput = false;
					}
				}while(checkInput);

				playerDef = power - playerAtk;
				System.out.println(" Defense = "+ playerDef + "\n"+ line + battleStart + line + "\n");

			// change computer and player type attack, char into str
				if (computerTypeAtk.equals('R')){ 
                    changeCharacterComputer = " Rock";
                }else if (computerTypeAtk.equals('S')){
                    changeCharacterComputer = " Scissors";
                }else if (computerTypeAtk.equals('P')){
                    changeCharacterComputer = " Paper";	
                }
				
				if (playerTypeAtk.equals('R')){
                    changeCharacterPlayer = "Rock";
                }else if (playerTypeAtk.equals('S')){
                    changeCharacterPlayer = "Scissors";	
                }else if (playerTypeAtk.equals('P')){
                    changeCharacterPlayer = "Paper";
                }
				
			// =====Searching a round winner=====
				soutVersus = soutVersus + changeCharacterComputer + " VS " + changeCharacterPlayer;

				if ((computerTypeAtk.equals('P') && (playerTypeAtk.equals('R') 
                    || playerTypeAtk.equals('b'))) || (computerTypeAtk.equals('G') && (playerTypeAtk.equals('K') || playerTypeAtk.equals('k'))) || (computerTypeAtk.equals('B') && (playerTypeAtk.equals('G') || playerTypeAtk.equals('g')))) {
					computerWin = true;
				}
				else if ((computerTypeAtk.equals('B') && (playerTypeAtk.equals('K') || playerTypeAtk.equals('k'))) || (computerTypeAtk.equals('K') && (playerTypeAtk.equals('G') || playerTypeAtk.equals('g'))) || (computerTypeAtk.equals('G') && (playerTypeAtk.equals('B') || playerTypeAtk.equals('b')))) {
					playerWin = true;
				}

			// =====if computer win=====
				float hp;
				if (computerWin) {
					System.out.println(computer +" wins with " + changeCharacterComputer + "\n" +computer+ " deal a "+ computerAtk + " Damage\n" + player + deffenseDamage+ ((float)playerDef / defenseBreak) + ")" );
					if (computerAtk > 6) {
						System.out.println(computer + criticalAttack);
						computerAtk += criticalBonusDamage;
					}

					if (computerAtk > ((float)playerDef/2) ) {
						hp = ((float)playerDef/2)-(float)computerAtk;
					}
					else{
						hp = regenerationHp;
						setTag = "+";
					}
					playerHp += hp; 
					System.out.print(player+ " HP "+ setTag + hp);
				}
			// =====if user win=====
				else if (playerWin) {
					System.out.println(" You wins with " + changeCharacterPlayer + "\n" + player + " give a " + playerAtk + " Damage\n" + computer + deffenseDamage + ((float)computerDef / defenseBreak) + ")" );
					if (playerAtk > 6) {
						System.out.println(player + criticalAttack);
						playerAtk += 2;
					}
					
					if (playerAtk > ((float)computerDef/2) ) {
						hp = ((float)computerDef/2)-(float)playerAtk;
					}
					else{
						hp = 2;
						setTag = "+";
					}
					computerHp += hp; 
					System.out.print(computer+ " HP "+ setTag + hp);
				}
				else {
					System.out.println(" There is no winner in this round");
				}

				soutBattleEnd = soutBattleEnd + templateBattleEnd + templatePlayerHp + playerHp + templateComputerHp + computerHp + line + "\n";
				battleRound++;

				if (playerHp <= healthPointOut || computerHp <= healthPointOut) {
					roundAgain = false;
				}
		}while(roundAgain);

			if (playerHp <= healthPointOut) {
					winner = computer;
				}else{
					winner = player;
				}
			soutWinner = soutWinner + templateWinner;
	}
}