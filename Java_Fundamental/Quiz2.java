import java.util.Scanner;

public class Quiz2{
	public static void main(String[] args){
		//deklarasi variabel dan inisialisasi value
		int passenger;
		
		String 	rcBus60 = "\nBuses Available For You: \n\nBus With Seat 60 Rp. 2,300,000 \nBus With Seat 45 Rp. 2,000,000 \nBus With Seat 32 Rp. 1,800,000 \nBus With Seat 18 Rp. 1,500,000 \nBus With Chair 12 Rp. 1,300,000 \nBus Executive with 6 Chairs Rp. 2,000,000\n",
				rcBus45 = "\nBuses Available For You: \n\nBus With Seat 45 Rp. 2,000,000 \nBus With Seat 32 Rp. 1,800,000 \nBus With Seat 18 Rp. 1,500,000 \nBus With Chair 12 Rp. 1,300,000 \nBus Executive with 6 Chairs Rp. 2,000,000\n",
				rcBus32 = "\nBuses Available For You: \n\nBus With Seat 32 Rp. 1,800,000 \nBus With Seat 18 Rp. 1,500,000 \nBus With Chair 12 Rp. 1,300,000 \nBus Executive with 6 Chairs Rp. 2,000,000\n",
				rcBus18 = "\nBuses Available For You: \n\nBus With Seat 18 Rp. 1,500,000 \nBus With Chair 12 Rp. 1,300,000 \nBus Executive with 6 Chairs Rp. 2,000,000\n",
				rcBus12 = "\nBuses Available For You: \n\nBus With Chair 12 Rp. 1,300,000 \nBus Executive with 6 Chairs Rp. 2,000,000\n",
				rcBus6  = "\nBuses Available For You: \n\nBus Executive with 6 Chairs Rp. 2,000,000\n";
		
		int busPrice60 = 2300000,
			busPrice45 = 2000000,
			busPrice32 = 1800000,
			busPrice18 = 1500000,
			busPrice12 = 1300000,
			busExPrice6 = 2000000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nWelcome to Secret Travel");
		/*
			Bus With Seat 60 Rp. 2,300,000
			Bus With Seat 45 Rp. 2,000,000
			Bus With Seat 32 Rp. 1,800,000
			Bus With Seat 18 Rp. 1,500,000
			Bus With Chair 12 Rp. 1,300,000
			Bus Excecutive With Chair 6 Rp. 2,000,000
		*/
		System.out.print("\nEnter Number of Passengers (1-120) : ");
		passenger = input.nextInt();
		
		//menentukan bus yang sesuai dengan jumlah penumpang
		if (passenger <= 6 && passenger > 0){
			System.out.println(rcBus6);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 6 seats at a price of " + (busExPrice6));	
		}else if(passenger > 6 && passenger <= 11){
			System.out.println(rcBus6);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 6 seats at a price of " + (2 * busExPrice6));		
		}else if(passenger == 12){
			System.out.println(rcBus12);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 12 seats at a price of " + (busPrice12));
		}else if(passenger > 12 && passenger <= 17){
			System.out.println(rcBus12);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 12 seats at a price of " + (2 * busPrice12));
		}else if(passenger == 18){
			System.out.println(rcBus18);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 18 seats at a price of " + (busPrice18));
		}else if(passenger > 18 && passenger <=24){
			System.out.println(rcBus18);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 12 seats at a price of " + (2 * busPrice12));
		}else if(passenger > 24 && passenger <= 30){
			System.out.println(rcBus18);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 12 seats and 1 bus with 18 seats a price of " + (busPrice12 + busPrice18));
		}else if(passenger == 31){
			System.out.println(rcBus18);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 18 seats at a price of " + (2 * busPrice18));
		}else if(passenger == 32){
			System.out.println(rcBus32);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 32 seats at a price of " + (busPrice32));
		}else if(passenger > 32 && passenger <= 36){
			System.out.println(rcBus32);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 18 seats at a price of " + (2 * busPrice18));
		}else if(passenger > 36 && passenger <= 44){
			System.out.println(rcBus32);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 12 seats and 1 bus with 32 seats at a price of " + (busPrice12 + busPrice32));
		}else if(passenger == 45){
			System.out.println(rcBus45);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 45 seats at a price of " + (busPrice45));
		}else if(passenger > 45 && passenger <= 50){
			System.out.println(rcBus45);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 18 seats and 1 bus with 32 seats at a price of " + (busPrice18 + busPrice32));
		}else if(passenger > 50 && passenger <= 57){
			System.out.println(rcBus45);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 12 seats and 1 bus with 45 seats at a price of " + (busPrice12 + busPrice45));
		}else if(passenger > 57 && passenger <= 59){
			System.out.println(rcBus45);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 18 seats and 1 bus with 45 seats at a price of " + (busPrice18 + busPrice45));
		}else if(passenger == 60){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 60 seats at a price of " + (1 * busPrice60));
		}else if(passenger > 60 && passenger <= 63){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 18 seats and 1 bus with 45 seats at a price of " + (busPrice18 + busPrice45));
		}else if(passenger == 64){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 32 seats at a price of " + (2 * busPrice32));
		}else if(passenger > 64 && passenger <= 72){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 12 seats and 1 bus with 60 seats at a price of " + (busPrice12 + busPrice60));
		}else if(passenger > 73 && passenger <= 77){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 32 seats and 1 bus with 45 seats at a price of " + (busPrice32 + busPrice45));
		}else if(passenger == 78){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 18 seats and 1 bus with 60 seats at a price of " + (busPrice18 + busPrice60));
		}else if(passenger > 79 && passenger <= 90){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 45 seats at a price of " + (2 * busPrice45));
		}else if(passenger > 91 && passenger <= 92){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 32 seats and 1 bus with 60 seats at a price of " + (busPrice32 + busPrice60));
		}else if(passenger > 93 && passenger <= 105){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 1 bus with 45 seats and 1 bus with 60 seats at a price of " + (busPrice45 + busPrice60));
		}else if(passenger > 106 && passenger <= 120){
			System.out.println(rcBus60);
			
			System.out.println("* Recommended bus for you \n- 2 buses with 60 seats at a price of " + (2 * busPrice60));
		}else{
			System.out.println("\nSorry, Bus not Available for You");
		}
	}
} 