import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int jumlahBaris, i, j;

        System.out.println("\nInput Jumlah Baris : ");
        jumlahBaris = input.nextInt();

        for(i = 1; i <= jumlahBaris; i++ ){
            for(j = 1; j <= jumlahBaris - i; j++){
                System.out.print(" ");
            }
            for(int n = 1; n <= i -1; n++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println("\n");
    }    
}
