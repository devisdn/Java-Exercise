import java.util.*;

public class FamilySavings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean isCheckingTotalFamilyMember = true, isCheckingSavingPeriod = true;

        int i = 0, j = 0, totalSavings = 0, totalFamilyMember = 0, savingPeriod = 0, minMember = 2, maxMember = 6, minSavingPeriod = 1, maxSavingPeriod = 12,
        savingPerMonth, totalSavingPerMonth[], totalDayPerMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String tempInputSavingPeriod, tempInputTotalFamilyMember, headerProgram = "\nTabungan Keluarga.", templateMin = "kurang", templateMax = "lebih",
        inputTotalFamilyMember = "\nMasukkan Jumlah Keluarga : ",
        inputSavingPeriod = "\nMasukkan Lama Tabungan : ",
        templateTotalFamilyMember = "Jumlah keluarga",
        templateTotalSavingsPeriod = "Lama tabungan",
        errorInputOutOfRange = "\nMaaf, %s tidak boleh %s dari %d. Silahkan masukkan kembali!\n",
        errorInputStrDetected = "\nMaaf, Input %s hanya dapat berupa angka saja. Silahkan masukkan kembali!\n",
        outputSavingPerMonth = "\nTabungan pada bulan ke - %d sebesar : %d",
        outputTotalSavings = "\n\nTotal Tabungan Selama %d Bulan dengan %d anggota keluarga adalah %d";

        System.out.println(headerProgram);
        //input total family member
        do{
            System.out.print(inputTotalFamilyMember);
            tempInputTotalFamilyMember = input.nextLine();
            //validation input total family member
            if(!tempInputTotalFamilyMember.matches("[0-9]+")){
                System.out.printf(errorInputStrDetected, tempInputTotalFamilyMember);
            }else{
                totalFamilyMember = Integer.parseInt(tempInputTotalFamilyMember);
                if (totalFamilyMember < minMember){
                    System.out.printf(errorInputOutOfRange, templateTotalFamilyMember, templateMin, minMember);
                }else if(totalFamilyMember > maxMember){
                    System.out.printf(errorInputOutOfRange, templateTotalFamilyMember, templateMax, maxMember);
                }else{
                    isCheckingTotalFamilyMember = false;
                }
            }
        }while(isCheckingTotalFamilyMember);
        //input saving period
        do{
            System.out.print(inputSavingPeriod);
            tempInputSavingPeriod = input.nextLine();
            //validation input saving periods
            if(!tempInputSavingPeriod.matches("[0-9]+")){
                System.out.printf(errorInputStrDetected, templateTotalSavingsPeriod);
            }else{
                savingPeriod = Integer.parseInt(tempInputSavingPeriod);
                if(savingPeriod < minSavingPeriod){
                    System.out.printf(errorInputOutOfRange, templateTotalSavingsPeriod, templateMin, minSavingPeriod);
                }else if(savingPeriod > maxSavingPeriod){
                    System.out.printf(errorInputOutOfRange, templateTotalSavingsPeriod, templateMax, maxSavingPeriod);
                }else{
                    isCheckingSavingPeriod = false;
                }
            }
        }while(isCheckingSavingPeriod);
        
        totalSavingPerMonth = new int[savingPeriod];
        //looping for count saving per month
        for(i = 0; i < savingPeriod; i++){
            savingPerMonth = 0;
            for(j = totalDayPerMonth[i]; j >= 1; j-- ){
                savingPerMonth += (j * 1000);
            }
            totalSavingPerMonth[i] = savingPerMonth * totalFamilyMember; //total saving permonth * total member
            totalSavings += totalSavingPerMonth[i];
        }
        for(i = 0; i < savingPeriod; i++){
            System.out.printf(outputSavingPerMonth, i+1, totalSavingPerMonth[i]); 
        }
        System.out.printf(outputTotalSavings, savingPeriod, totalFamilyMember, totalSavings);
    }
}