import java.util.Scanner;

public class CalculateMoneySpent{
	public static void main( String[] args ){
		//inisialisasi variabel
		String name;
		int moneySpent, total;
		double average;
		int totalDay = 7;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Your Money");
		System.out.println("====================");
		
		System.out.println("\nHey, What is your name?");
		name = input.next();
			
		System.out.println("\nHow much money did you spend at the club on Monday?");
		moneySpent = input.nextInt();
		
		System.out.println("\nHow much money did you spend at the club on Sunday?");
		moneySpent += input.nextInt();
		
		System.out.println("\nHow much money did you spend at the club on Tuesday?");
		moneySpent += input.nextInt();
			
		System.out.println("\nHow much money did you spend at the club on Wednesday?");
		moneySpent += input.nextInt();
		
		System.out.println("\nHow much money did you spend at the club on Thursday?");
		moneySpent += input.nextInt();
		
		System.out.println("\nHow much money did you spend at the club on Friday?");
		moneySpent += input.nextInt();
		
		System.out.println("\nHow much money did you spend at the club on Saturday?");
		moneySpent += input.nextInt();
		
		
		total = moneySpent;
		average = total/totalDay;
		
		System.out.println("\nHi " + name + ",");
		System.out.println("Your total expenditure at the club this week is $" + total);
		System.out.println("With an average daily expenditure of $" + average);
	}
}