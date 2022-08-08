import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main( String[] args){
        String nama;
        int moneySpent;
        int total;
        int totalDay = 7;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda : ");
        nama = input.nextLine();
        System.out.println("Nama saya "+nama);

        System.out.print("Masukkan pengeluaran "+nama+" di hari Senin = ");
        moneySpent = input.nextInt();
        total = moneySpent;
        System.out.println("Pengeluaran Anda di hari senin adalah = "+ total);

        System.out.print("Masukkan pengeluaran "+nama+" di hari Selasa = ");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.print("Pengeluaran Anda di hari selasa adalah = "+ total);

        System.out.print("Masukkan pengeluaran "+nama+" di hari Rabu = ");
        moneySpent = input.nextInt();
        total = total + moneySpent;
        System.out.print("Pengeluaran Anda di hari Rabu adalah = "+ total);

        average = (double) total/totalDay;
        System.out.println(average);
    }
}
