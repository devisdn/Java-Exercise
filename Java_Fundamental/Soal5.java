import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i, j, jumlahBaris;

        System.out.println("Input Jumlah Baris Mirroring : ");
        jumlahBaris = input.nextInt();

        for(i = 1; i <= jumlahBaris - 1; i++){
            for(j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(j = i; j <= jumlahBaris; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i = 1; i <= jumlahBaris; i++){
            for(j = i; j < jumlahBaris; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
