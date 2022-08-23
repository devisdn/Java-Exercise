import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args){
        int jumlahBaris,i ,j ,k, n;
        Scanner input = new Scanner(System.in);

        System.out.println("Input Jumlah Baris : ");
        jumlahBaris = input.nextInt();

		for (i = 1; i <= jumlahBaris; i++) {

			for (j = i; j < jumlahBaris; j++) {
		 		System.out.print(" ");
		 	}
		 	for (j = i; j >= 1; j--) {
		 		System.out.print("* ");
		 	}
		 	System.out.println("");
        }
    }
}
