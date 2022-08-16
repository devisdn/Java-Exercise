import java.util.Scanner;

public class Soal4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int jumlahBaris, i, j;

		System.out.println("Input jumlah baris mirroring");
		jumlahBaris = input.nextInt();

		for (i = jumlahBaris; i >= 1; i--) {

		 	for (j = 1; j <= i; j++) {
		 		System.out.print("*");
		 	}
		 	System.out.println("\n");
		} 
		for (i = 1; i <= jumlahBaris; i++) {

		 	for (j = 1; j <= i; j++) {
		 		System.out.print("*");
		 	}
		 	System.out.println("\n");
		} 


	}
}