import java.util.Scanner;
import java.text.DecimalFormat;
public class Quiz2V2 {
    public static void main( String[] args){
        //deklarasi variabel
        int passenger;

            //Inisialisasi max kapasitas setiap bus
        int maxCapacity60 = 60,
            maxCapacity45 = 45,
            maxCapacity32 = 32,
            maxCapacity18 = 18,
            maxCapacity12 = 12,
            maxCapacity6 = 6,
            //min dan max jumlah penumpang
            minTravelPassengers = 1,
            maxTravelPassengers = 120;
        
            //Inisialisasi harga bus
        int busPrice60 = 2300000,
		    busPrice45 = 2000000,
		    busPrice32 = 1800000,
		    busPrice18 = 1500000,
		    busPrice12 = 1300000,
		    busExPrice6 = 2000000;

                //Inisialisasi list bus yang tersedia
        String  busSeat6 = "\nBus Executive with 6 seats Rp. 2,000,000",
                busSeat12 = "\nBus with 12 chairs Rp. 1,300,000",
                busSeat18 = "\nBus with 18 seats Rp. 1,500,000",
                busSeat32 = "\nBus with 32 seats Rp. 1,800,000",
                busSeat45 = "\nBus with 45 seats Rp. 2,000,000",
                busSeat60 = "\nBus with 60 seats Rp. 2,300,000";
        
        //Deklarasi variabel input dan format harga
        Scanner input = new Scanner(System.in);
        DecimalFormat rupiah = new DecimalFormat("#,###,###");

        System.out.println("\n========== Screened Results ==========");
        System.out.println("Welcome to Secret Travel\n");
        
        //Memasukkan input jumlah penumpang
        System.out.print("Enter Number of Passengers : ");
        passenger = input.nextInt();

        //Menentukan bus yang sesuai dengan jumlah penumpang 
        if(passenger <= maxTravelPassengers && passenger >= minTravelPassengers){
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

            if(passenger <= maxCapacity6 && passenger >= minTravelPassengers){
            
                System.out.println(busSeat6);
            
            }
        }else{
        
            System.out.println("Sorry, Bus Not Available for You");
        
        }

        //Menentukan rekomendasi bus yang sesuai dan murah
        System.out.println("\n\n* Recommended bus for you ");
        if (passenger <= 6 && passenger > 0){

			System.out.println("\n- 1 bus with 6 seats at a price of Rp. " + rupiah.format(busExPrice6));	
		
        }else if(passenger > 6 && passenger <= 11){

			System.out.println("\n- 2 buses with 6 seats at a price of Rp. " + rupiah.format(2 * busExPrice6));		
		
        }else if(passenger == 12){

			System.out.println("\n- 1 bus with 12 seats at a price of Rp. " + rupiah.format(busPrice12));
		
        }else if(passenger > 12 && passenger <= 17){

			System.out.println("\n- 2 buses with 12 seats at a price of Rp. " + rupiah.format(2 * busPrice12));
		
        }else if(passenger == 18){

			System.out.println("\n- 1 bus with 18 seats at a price of Rp. " + rupiah.format(busPrice18));
		
        }else if(passenger > 18 && passenger <=24){
		
            System.out.println("\n- 2 buses with 12 seats at a price of Rp. " + rupiah.format(2 * busPrice12));
		
        }else if(passenger > 24 && passenger <= 30){

			System.out.println("\n- 1 bus with 12 seats and 1 bus with 18 seats a price of Rp. " + rupiah.format(busPrice12 + busPrice18));
		
        }else if(passenger == 31){

			System.out.println("\n- 2 buses with 18 seats at a price of Rp. " + rupiah.format(2 * busPrice18));
		
        }else if(passenger == 32){

			System.out.println("\n- 1 bus with 32 seats at a price of Rp. " + rupiah.format(busPrice32));
		
        }else if(passenger > 32 && passenger <= 36){

			System.out.println("\n- 2 buses with 18 seats at a price of Rp. " + rupiah.format(2 * busPrice18));
		
        }else if(passenger > 36 && passenger <= 44){

			System.out.println("\n- 1 bus with 12 seats and 1 bus with 32 seats at a price of Rp. " + rupiah.format(busPrice12 + busPrice32));
		
        }else if(passenger == 45){

			System.out.println("\n- 1 bus with 45 seats at a price of Rp. " + rupiah.format(busPrice45));
		
        }else if(passenger > 45 && passenger <= 50){

			System.out.println("\n- 1 bus with 18 seats and 1 bus with 32 seats at a price of Rp. " + rupiah.format(busPrice18 + busPrice32));
		
        }else if(passenger > 50 && passenger <= 57){

			System.out.println("\n- 1 bus with 12 seats and 1 bus with 45 seats at a price of Rp. " + rupiah.format(busPrice12 + busPrice45));
		
        }else if(passenger > 57 && passenger <= 59){

			System.out.println("\n- 1 bus with 18 seats and 1 bus with 45 seats at a price of Rp. " + rupiah.format(busPrice18 + busPrice45));
		
        }else if(passenger == 60){

			System.out.println("\n- 1 bus with 60 seats at a price of Rp. " + rupiah.format(1 * busPrice60));
		
        }else if(passenger > 60 && passenger <= 63){
	
			System.out.println("\n- 1 bus with 18 seats and 1 bus with 45 seats at a price of Rp. " + rupiah.format(busPrice18 + busPrice45));
		
        }else if(passenger == 64){

			System.out.println("\n- 2 buses with 32 seats at a price of Rp. " + rupiah.format(2 * busPrice32));
		
        }else if(passenger > 64 && passenger <= 72){

			System.out.println("\n- 1 bus with 12 seats and 1 bus with 60 seats at a price of Rp. " + rupiah.format(busPrice12 + busPrice60));
		
        }else if(passenger > 73 && passenger <= 77){	
		
            System.out.println("\n- 1 bus with 32 seats and 1 bus with 45 seats at a price of Rp. " + rupiah.format(busPrice32 + busPrice45));
		
        }else if(passenger == 78){

			System.out.println("\n- 1 bus with 18 seats and 1 bus with 60 seats at a price of Rp. " + rupiah.format(busPrice18 + busPrice60));
		
        }else if(passenger > 79 && passenger <= 90){

            System.out.println("\n- 2 buses with 45 seats at a price of Rp. " + rupiah.format(2 * busPrice45));
		
        }else if(passenger > 91 && passenger <= 92){

			System.out.println("\n- 1 bus with 32 seats and 1 bus with 60 seats at a price of Rp. " + rupiah.format(busPrice32 + busPrice60));
		
        }else if(passenger > 93 && passenger <= 105){
		
            System.out.println("\n- 1 bus with 45 seats and 1 bus with 60 seats at a price of Rp. " + rupiah.format(busPrice45 + busPrice60));
		
        }else if(passenger > 106 && passenger <= 120){
			System.out.println("\n- 2 buses with 60 seats at a price of Rp. " + rupiah.format(2 * busPrice60));
		}
    }
}
