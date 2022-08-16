import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //define variable
        int jumlahBaris, i, j;
        System.out.println("Input jumlah baris : ");
        jumlahBaris = input.nextInt();

        System.out.println();

        for(i = 1; i <= jumlahBaris; i++){
            for(j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
