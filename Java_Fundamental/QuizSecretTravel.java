import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class QuizSecretTravel {
    public static void main(String[]args){
        //define variable
        int numOfPassenger,
            maxCapacityBus6 = 6,
            maxCapacityBus12 = 12,
            maxCapacityBus18 = 18,
            maxCapacityBus32 = 32,
            maxCapacityBus45 = 45,
            maxCapacityBus60 = 60,
            minNumOfPassenger = 1,
            maxTravelCapacity = 120,
            priceBusSeat6 = 2000000,
            priceBusSeat12 = 1300000,
            priceBusSeat18 = 1500000,
            priceBusSeat32 = 1800000,
            priceBusSeat45 = 2000000,
            priceBusSeat60 = 2300000;

    String  listBus = "",
            recommendBus = "",
            busSeatDescription6 = "Bus Executive with 6 Chairs",
            busSeatDescription12 = "Bus with 12 Chairs",
            busSeatDescription18 = "Bus with 18 Seats",
            busSeatDescription32 = "Bus with 32 Seats",
            busSeatDescription45 = "Bus with 45 Seats",
            busSeatDescription60 = "Bus with 60 Seats",
            templateMessageTotalPrice = " With a price of ";
            

        //define variable input
        Scanner input = new Scanner(System.in);
        
        //define variable format currency
        DecimalFormat indonesiaCurrency = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        indonesiaCurrency.setDecimalFormatSymbols(formatRp);

        System.out.println("\n========== Screened Results ==========");
        System.out.println("Welcome to Secret Travel\n");

        //input user
        System.out.print("Enter Number of Passengers : ");
        numOfPassenger = input.nextInt();

        //Determinate the appropriate bus
        if(numOfPassenger <= maxTravelCapacity && numOfPassenger >= minNumOfPassenger){
            if(numOfPassenger >= maxCapacityBus60){
                listBus = listBus + busSeatDescription60 + " " + indonesiaCurrency.format(priceBusSeat60) + "\n";
            }

            if(numOfPassenger >= maxCapacityBus45){
                listBus = listBus + busSeatDescription45 + " " + indonesiaCurrency.format(priceBusSeat45) + "\n";
            }

            if(numOfPassenger >= maxCapacityBus32){
                listBus = listBus + busSeatDescription32 + " " + indonesiaCurrency.format(priceBusSeat32) + "\n";
            }

            if(numOfPassenger >= maxCapacityBus18){ 
                listBus = listBus + busSeatDescription18 + " " + indonesiaCurrency.format(priceBusSeat18) + "\n";
            }

            if(numOfPassenger >= maxCapacityBus12){
            
                listBus = listBus + busSeatDescription12 + " " + indonesiaCurrency.format(priceBusSeat12) + "\n";
            
            }

            if(numOfPassenger >= maxCapacityBus6 || (numOfPassenger < maxCapacityBus6 && numOfPassenger >= minNumOfPassenger)){
            
                listBus = listBus + busSeatDescription6 + " " + indonesiaCurrency.format(priceBusSeat6) + "\n";
            
            }
        }else{
        
            System.out.println("Sorry, Bus Not Available for You");
        }
        
        //Determinate cheap bus recommendations
        if(numOfPassenger <= maxTravelCapacity && numOfPassenger >= minNumOfPassenger){

            if(numOfPassenger >= minNumOfPassenger && numOfPassenger <= maxCapacityBus6){
                recommendBus = recommendBus + " - 1 " + busSeatDescription6 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat6);
            }
            else if(numOfPassenger >= 7 && numOfPassenger <= 11){
                recommendBus = recommendBus + " - 2 " + busSeatDescription6 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat6);
            }
            else if(numOfPassenger == maxCapacityBus12){
                recommendBus = recommendBus + " - 1 " + busSeatDescription12 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat12);
            }
            else if(numOfPassenger >= 13 && numOfPassenger <= 17){
                recommendBus = recommendBus + " - 2 " + busSeatDescription12 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat12);
            }
            else if(numOfPassenger == maxCapacityBus18){
                recommendBus = recommendBus + " - 1 " + busSeatDescription18 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat18);
            }
            else if(numOfPassenger >= 19 && numOfPassenger <= 24){
                recommendBus = recommendBus + " - 2 " + busSeatDescription12 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat12);
            }
            else if(numOfPassenger >= 25 && numOfPassenger <= 30){
                recommendBus = recommendBus + " - 1 " + busSeatDescription12 + " and 1 " + busSeatDescription18 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat12 + priceBusSeat18);
            }
            else if(numOfPassenger == 31){
                recommendBus = recommendBus + " - 2 " + busSeatDescription18 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat18);
            }
            else if(numOfPassenger == 32){
                recommendBus = recommendBus + " - 1 " + busSeatDescription32 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat32);
            }
            else if(numOfPassenger >= 33 && numOfPassenger <= 36){
                recommendBus = recommendBus + " - 2 " + busSeatDescription18 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat18);
            }
            else if(numOfPassenger >= 37 && numOfPassenger <= 44){
                recommendBus = recommendBus + " - 1 " + busSeatDescription12 + " and 1 " + busSeatDescription32 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat12 + priceBusSeat32);
            }
            else if(numOfPassenger == maxCapacityBus45){
                recommendBus = recommendBus + " - 1 " + busSeatDescription45 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat45);
            }
            else if(numOfPassenger >= 46 && numOfPassenger <= 50){
                recommendBus = recommendBus + " - 1 " + busSeatDescription18 + " and 1 " + busSeatDescription32 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat18 + priceBusSeat32);
            }
            else if(numOfPassenger >= 51 && numOfPassenger <= 57){
                recommendBus = recommendBus + " - 1 " + busSeatDescription12 + " and 1 " + busSeatDescription45 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat12 + priceBusSeat45);
            }
            else if(numOfPassenger >= 58 && numOfPassenger <= 59){
                recommendBus = recommendBus + " - 1 " + busSeatDescription18 + " and 1 " + busSeatDescription45 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat18 + priceBusSeat45);
            }
            else if(numOfPassenger == maxCapacityBus60){
                recommendBus = recommendBus + " - 1 " + busSeatDescription60 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat60);
            }
            else if(numOfPassenger >= 61 && numOfPassenger <= 63){
                recommendBus = recommendBus + " - 1 " + busSeatDescription18 + " and 1 " + busSeatDescription45 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat18 + priceBusSeat45);
            }
            else if(numOfPassenger == 64){
                recommendBus = recommendBus + " - 2 " + busSeatDescription32 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat32);
            }
            else if(numOfPassenger >= 65 && numOfPassenger <= 72){
                recommendBus = recommendBus + " - 1 " + busSeatDescription12 + " and 1 " + busSeatDescription60 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat12 + priceBusSeat60);             
            }
            else if(numOfPassenger >= 73 && numOfPassenger <= 77){               
                recommendBus = recommendBus + " - 1 " + busSeatDescription32 + " and 1 " + busSeatDescription45 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat32 + priceBusSeat45);
            }
            else if(numOfPassenger == 78){ 
                recommendBus = recommendBus + " - 1 " + busSeatDescription18 + " and 1 " + busSeatDescription60 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat18 + priceBusSeat60);
            }
            else if(numOfPassenger >= 79 && numOfPassenger <= 90){
                recommendBus = recommendBus + " - 2 " + busSeatDescription45 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat45);
            }
            else if(numOfPassenger >= 91 && numOfPassenger <= 92){
                recommendBus = recommendBus + " - 1 " + busSeatDescription32 + " and 1 " + busSeatDescription60 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat32 + priceBusSeat60);
            }
            else if(numOfPassenger >= 93 && numOfPassenger <= 105){
                recommendBus = recommendBus + " - 1 " + busSeatDescription45 + " and 1 " + busSeatDescription60 + templateMessageTotalPrice + " " + indonesiaCurrency.format(priceBusSeat45 + priceBusSeat60);
            }
            else if(numOfPassenger >= 106 && numOfPassenger <=  maxTravelCapacity){
                recommendBus = recommendBus + " - 2 " + busSeatDescription60 + templateMessageTotalPrice + " " + indonesiaCurrency.format(2 * priceBusSeat60);
            }

        } 
        System.out.println("\nBuses Available for You  : ");
        System.out.println(listBus);

        System.out.println("\n* Recommendation bus for you : \n");
        System.out.println(recommendBus);
        System.out.println("\n\n=========== End of Results ===========");

    }
}
