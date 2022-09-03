import java.util.Scanner;
public class Soal6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlahBaris, i , j;

        System.out.println("Input Jumlah Baris : ");
        jumlahBaris = input.nextInt();

        for(i = jumlahBaris; i >= 1; i--){
            for(j = jumlahBaris; j > i; j--){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
