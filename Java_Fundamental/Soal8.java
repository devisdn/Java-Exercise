import java.util.Scanner;

public class Soal8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int jumlahBaris, i, j;

		System.out.println("Input Jumlah Baris :");
		jumlahBaris = input.nextInt();

		for (i = 1; i <= jumlahBaris; i++) {

			for (j = 1; j < i; j++) {
		 		System.out.print("0");
		 	}
		 	System.out.print("*");
		 	for (j = jumlahBaris; j > i; j--) {
		 		System.out.print("0");
		 	}
		 	System.out.println("");
		}

	}
}