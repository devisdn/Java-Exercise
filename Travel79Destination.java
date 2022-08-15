import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Travel79Destination {
    public static void main(String[] args) {

        //format variable indonesia format currency
        DecimalFormat indonesiaCurrency = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        indonesiaCurrency.setDecimalFormatSymbols(formatRp);

        //define variable
String  name ="", questionOfBudget, templateRecommendBangkok, templateRecommendLombok, templateRecommendSingapore, templateRecommendTokyo,targetDestination = "",
        titleApp                = "\n========WELCOME TO TRAVEL 79.com==========\nEasily determine your best destination!\n",
        questionName            = "Hey, What is your name?",
        questionNumOfTraveller  = "\nHow many people will take the Travel?",
        questionOfDayLength     = "\nHow many days will you take this Travel?";
        
        int numOfTraveller, travelDayLength, budgetOfTraveller, totalCostLombok, totalCostBangkok, totalCostSingapore, totalCostTokyo,
            //initialize cost of destination per person
            transportationCostLombok    = 2170000,
            accomodationCostLombok      = 125000,
            culinaryCostLombok          = 75000,
            snorklingCostLombok         = 250000,
            transportationCostLBangkok  = 3780000,
            accomodationCostBangkok     = 155000,
            culinaryCostBangkok         = 55000,
            shoppingCostBangkok         = 300000,
            transportationCostSingapore = 1200000,
            accomodationCostSingapore   = 170000,
            culinaryCostSingapore       = 85000,
            studioCostSingapore         = 360000,
            transportationCostTokyo     = 4760000,
            accomodationCostTokyo       = 170000,
            culinaryCostTokyo           = 105000,
            skiCostTokyo                = 3250000;
            
        System.out.println(titleApp);
        
        //input user
        Scanner input = new Scanner(System.in);

        System.out.println(questionName);
        name = input.nextLine();

        System.out.println(questionNumOfTraveller);
        numOfTraveller = input.nextInt();
        
        System.out.println(questionOfDayLength);
        travelDayLength = input.nextInt();
        
        questionOfBudget ="\nWhat is your budget, " + name + " ?";
        System.out.println(questionOfBudget);
        budgetOfTraveller = input.nextInt();

        templateRecommendLombok     = "\nOur recommended destination for you " + name + " is 'Lombok'," + "\nThe total you have to pay to go to Lombok is ";
        templateRecommendBangkok    = "\nOur recommended destination for you " + name + " is 'Bangkok'," + "\nThe total you have to pay to go to Bangkok is ";
        templateRecommendSingapore  = "\nOur recommended destination for you " + name + " is 'Singapore'," + "\nThe total you have to pay to go to Singapore is ";
        templateRecommendTokyo      = "\nOur recommended destination for you " + name + " is 'Tokyo'," + "\nThe total you have to pay to go to Tokyo is ";

        //determinate total cost based on the number of person and travel day length
        totalCostSingapore  = (transportationCostSingapore * numOfTraveller)
                                + ((accomodationCostSingapore * numOfTraveller) * travelDayLength)
                                + ((culinaryCostSingapore * numOfTraveller) * travelDayLength)
                                + (studioCostSingapore * numOfTraveller);
        totalCostTokyo      = (transportationCostTokyo * numOfTraveller)
                                + ((accomodationCostTokyo * numOfTraveller) * travelDayLength)
                                + ((culinaryCostTokyo * numOfTraveller) * travelDayLength)
                                + (skiCostTokyo * numOfTraveller);
        totalCostLombok     = (transportationCostLombok * numOfTraveller)
                                + ((accomodationCostLombok * numOfTraveller) * travelDayLength)
                                + ((culinaryCostLombok * numOfTraveller) * travelDayLength)
                                + (snorklingCostLombok * numOfTraveller);
        totalCostBangkok    = (transportationCostLBangkok * numOfTraveller)
                                + ((accomodationCostBangkok * numOfTraveller) * travelDayLength)
                                + ((culinaryCostBangkok * numOfTraveller) * travelDayLength)
                                + (shoppingCostBangkok * numOfTraveller);

        //determinate recommendation destination with total cost closest to traveller budget
        if(budgetOfTraveller >= totalCostTokyo || budgetOfTraveller >= totalCostBangkok || budgetOfTraveller >= totalCostLombok || budgetOfTraveller >= totalCostSingapore){
            if(budgetOfTraveller >= totalCostLombok){
				if(totalCostLombok > totalCostBangkok && totalCostLombok > totalCostSingapore){
					targetDestination = targetDestination + templateRecommendLombok + indonesiaCurrency.format(totalCostLombok);
				}
				if(totalCostLombok > totalCostBangkok){
					targetDestination = targetDestination + templateRecommendLombok + indonesiaCurrency.format(totalCostLombok);
				}
				if(totalCostLombok > totalCostSingapore){
					targetDestination = targetDestination + templateRecommendLombok + indonesiaCurrency.format(totalCostLombok);
				}
			}
			if(budgetOfTraveller >= totalCostBangkok ){
				if(totalCostBangkok > totalCostLombok && totalCostBangkok > totalCostSingapore){
					targetDestination = targetDestination + templateRecommendBangkok + indonesiaCurrency.format(totalCostBangkok);
				}
				if(totalCostBangkok > totalCostLombok){
					targetDestination = targetDestination + templateRecommendBangkok + indonesiaCurrency.format(totalCostBangkok);
				}
				if(totalCostBangkok > totalCostSingapore){
					targetDestination = targetDestination + templateRecommendBangkok + indonesiaCurrency.format(totalCostBangkok);
				}
			}	
			if(budgetOfTraveller >= totalCostSingapore){
				if(totalCostSingapore > totalCostLombok && totalCostSingapore > totalCostBangkok){
					targetDestination = targetDestination + templateRecommendSingapore + indonesiaCurrency.format(totalCostSingapore);
				}
				if(totalCostSingapore > totalCostLombok){
					targetDestination = targetDestination + templateRecommendSingapore + indonesiaCurrency.format(totalCostSingapore);
				}
				if(totalCostSingapore > totalCostBangkok){
					targetDestination = targetDestination + templateRecommendSingapore + indonesiaCurrency.format(totalCostSingapore);
				}
            }
			if(budgetOfTraveller >= totalCostBangkok && budgetOfTraveller >= totalCostSingapore){
				if(totalCostBangkok > totalCostSingapore){
					targetDestination = targetDestination + templateRecommendBangkok + indonesiaCurrency.format(totalCostBangkok);
				}
				if(totalCostSingapore > totalCostBangkok){
					targetDestination = targetDestination + templateRecommendSingapore + indonesiaCurrency.format(totalCostSingapore);
				}
			}
			if(budgetOfTraveller >= totalCostLombok && budgetOfTraveller < totalCostBangkok && budgetOfTraveller < totalCostSingapore){
				targetDestination = targetDestination + templateRecommendLombok + indonesiaCurrency.format(totalCostLombok);
			}
			if(budgetOfTraveller >= totalCostBangkok && budgetOfTraveller < totalCostLombok && budgetOfTraveller < totalCostSingapore){
				targetDestination = targetDestination + templateRecommendBangkok + indonesiaCurrency.format(totalCostBangkok);
			}
			if(budgetOfTraveller >= totalCostSingapore && budgetOfTraveller < totalCostLombok && budgetOfTraveller < totalCostBangkok){
				targetDestination = targetDestination + templateRecommendSingapore + indonesiaCurrency.format(totalCostSingapore);
			}
			if(budgetOfTraveller >= totalCostTokyo){
				targetDestination = targetDestination + templateRecommendTokyo + indonesiaCurrency.format(totalCostTokyo);
			}
        }else{
            System.out.println("\nSorry we could not find a recommendation destination for you " + name + ", with budget " + indonesiaCurrency.format(budgetOfTraveller));
        }
        System.out.println(targetDestination);
    }
}