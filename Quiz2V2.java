import java.util.Scanner;
public class Quiz2V2 {
    public static void main( String[] args){
        //deklarasi variabel
        int passenger;
        int maxCapacity60 = 60,
            maxCapacity45 = 45,
            maxCapacity32 = 32,
            maxCapacity18 = 18,
            maxCapacity12 = 12,
            maxCapacity6 = 6,
            minTravelPassengers = 1,
            maxTravelPassengers = 120;

        //Inisialisasi list bus yang tersedia
        String busSeat6 = "Bus Executive with 6 seats Rp. 2,000,000",
            busSeat12 = "Bus Executive with 12 chairs Rp. 1,300,00",
            busSeat18 = "Bus Executive with 18 seats Rp. 1,500,00",
            busSeat32 = "Bus Executive with 32 seats Rp. 1,800,00",
            busSeat45 = "Bus Executive with 45 seats Rp. 2,000,00",
            busSeat60 = "Bus Executive with 60 seats Rp. 2,300,00";
        
        Scanner input = new Scanner(System.in);

        System.out.println("\n========== Screened Results ==========");
        System.out.println("Welcome to Secret Travel\n");
        
        //Memasukkan input jumlah penumpang
        System.out.print("Enter Number of Passengers : ");
        passenger = input.nextInt();

        //Menentukan bus yang sesuai dengan jumlah penumpang 
        if(passenger <= maxTravelCapacity && passenger >= minTravelPassengers){
            if(passenger >= maxCapacity60){
                System.out.println(busSeat60);
            }

            if(passenger >= maxCapacity45){
                System.out.println(busSeat45);
            }

            if(passenger >= maxCapacity32){
                System.out.println(busSeat32);
            }

            if(passenger >= maxCapacity18){
                System.out.println(busSeat18);
            }

            if(passenger >= maxCapacity12){
                System.out.println(busSeat12);
            }

            if(passenger >= maxCapacity6){
                System.out.println(busSeat6);
            }
        }else{
            System.out.println("Sorry, Bus Not Available for You");
        }
    }
}
