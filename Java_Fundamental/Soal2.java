import java.util.Scanner;

public class Soal2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int jumlahBintang, jumlahBaris, i, j;

        System.out.println("\nInput Jumlah Bintang : ");
        jumlahBintang = input.nextInt();

        System.out.println("\nInput Jumlah Baris : ");
        jumlahBaris = input.nextInt();

        for(i = 0; i <= jumlahBaris; i++){
            for(j = 0; j <= jumlahBintang; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}