import java.util.*;
public class GajiPNSDevis { //javac GajiPNSDevis.java
    public static void main(String[] args){
        String  name, workspaceGroup, maritalStatus;
        int     classRank, workPeriods, totalChild = 0;
        double  nettSalary = 0, basicSalary = 0, familyAllowance, childAllowance, riceAllowance, generalAllowance, grossSalary = 0, pphDeduction, taxPayerDues, houseSavingDeduction;
        
        getHeader(); //menampikan header program
        name        = inputTypeAlphabet(INPUT_NAME); //input nama
        classRank   = inputTypeNumberLimit(INPUT_CLASS_RANK, MIN_CLASS_RANK, MAX_CLASS_RANK); //input golongan pangkat

        if(classRank != CLASS_RANK[3]){ //kondisi dimana jika inputan golongan bukan 4, maka golongan ruang kerja dibatas sampai D saja
            workspaceGroup = inputTypeAlphabetLimit(INPUT_WORKSPACE_GROUP, WORKSPACE_GROUP);
        }else{
            workspaceGroup = inputTypeAlphabetLimit(INPUT_WORKSPACE_GROUP4, WORKSPACE_GROUP4);
        }
        
        workPeriods             = inputWorkPeriodLimit(INPUT_WORK_PERIODS, classRank, workspaceGroup);                                      //input masa kerja
        maritalStatus           = inputTypeAlphabetLimit(INPUT_MARITAL_STATUS, MARITAL_STATUS);                                             //input status pernikahan
        
        if(!maritalStatus.equalsIgnoreCase(MARITAL_STATUS[1])){ //kondisi jika input status perkawinan "belum menikah", maka input jumlah anak
            totalChild          = inputTypeNumberLimit(INPUT_TOTAL_CHILDRENS, MIN, MAX_TOTAL_CHILD);                                        //input jumlah anak
        }
                
        basicSalary             = getBasicSalary(classRank, workspaceGroup, workPeriods);                                                   //gaji pokok
        familyAllowance         = getFamilyAllowance(maritalStatus, basicSalary, totalChild);                                               //tunjangan keluarga
        childAllowance          = getChildAllowance(totalChild, basicSalary);                                                               //tunjangan anak
        riceAllowance           = getRiceAllowance(maritalStatus, totalChild);                                                              //tunjangan beras
        generalAllowance        = getGeneralAllowance(classRank);                                                                           //tunjangan jabatan
        grossSalary             = getGrossSalary(basicSalary, familyAllowance, childAllowance, riceAllowance, generalAllowance);            //gaji kotor
        pphDeduction            = getPphDeduction(basicSalary, grossSalary, maritalStatus, totalChild, familyAllowance, childAllowance);    //potongan pph21
        taxPayerDues            = getTaxPayerDuesDeduction(basicSalary, familyAllowance, childAllowance);                                   //potongan iwp
        houseSavingDeduction    = getHouseSavingDeduction(classRank);                                                                       //potongan taperum
        nettSalary              = getNettSalary(grossSalary, pphDeduction, taxPayerDues, houseSavingDeduction);                             //gaji bersih
        
        //output
        getResult(name, classRank, workspaceGroup, workPeriods, maritalStatus, totalChild, basicSalary, nettSalary, familyAllowance, 
        childAllowance, riceAllowance, generalAllowance, grossSalary, pphDeduction, taxPayerDues, houseSavingDeduction);
    }

// ===== FUNGSI UNTUK OUTPUT ====== //
    //fungsi untuk menampilkan header program
    public static void getHeader(){
        System.out.println(LINE + "\tSelamat Datang di Aplikasi\n\t\s\s\sPerhitungan Gaji PNS\n\tGolongan I s.d IV tahun 2019" + LINE);
    }
    //fungsi untuk menampilkan hasil akhir
    public static void getResult(String name, int classRank, String workspaceGroup, int workPeriods, String maritalStatus, int totalChild, double basicSalary, double nettSalary,
    double familyAllowance, double childAllowance, double riceAllowance, double generalAllowance, double grossSalary, double pphDeduction, double taxPayerDues, double houseSavingDeduction){
        System.out.println(LINE + "\t\s\s\s\s\sSlip Gaji PNS" + LINE);
        System.out.println("Nama\t\t\t: " + name);
        System.out.println("\nGolongan\t\t: " + classRank + "-" + workspaceGroup);
        System.out.println("\nMasa Kerja\t\t: " + workPeriods + " tahun");
        System.out.println("\nStatus Pernikahan\t: " + maritalStatus);
        System.out.println("\nJumlah Anak\t\t: " + totalChild);
        System.out.printf(LINE + "Gaji Pokok\t\t: Rp. %.1f" + LINE, basicSalary);
        System.out.printf("Tunjangan Keluarga\t: Rp. %.1f", familyAllowance);
        System.out.printf("\nTunjangan Anak\t\t: Rp. %.1f", childAllowance);
        System.out.printf("\nTunjangan Beras\t\t: Rp. %.1f", riceAllowance);
        System.out.printf("\nTunjangan Jabatan\t: Rp. %.1f", generalAllowance);
        System.out.printf(LINE + "Gaji Kotor\t\t: Rp. %.1f" + LINE, grossSalary);
        System.out.printf("Potongan PPH 21\t\t: Rp. %.1f", pphDeduction);
        System.out.printf("\nPotongan IWP\t\t: Rp. %.1f", taxPayerDues);
        System.out.printf("\nPotongan Taperum\t: Rp. %.1f", houseSavingDeduction);
        System.out.printf(LINE + "Take Home Pay\t\t: Rp. %.1f" + LINE, nettSalary);
    }

// ===== FUNGSI UNTUK VALIDASI ===== //
    //fungsi untuk validasi inputan berupa huruf
    public static String inputTypeAlphabet(String question){
        boolean isValid = false;
        String result;
        do {
            System.out.print(question);
            result = INPUT.nextLine();
            isValid = result.matches("[a-zA-Z\\s']+");
            if (!isValid) {
                System.out.printf(ERROR_INPUT_TYPE_DATA, TEMPLATE_LETTER);
            } 
        } while(!isValid);
        return result;
    }
    public static String inputTypeAlphabetLimit(String question, String[] listLimit){
        boolean isRepeat = true, isFound;
        String result;
        do{
            isFound=false;
            result = inputTypeAlphabet(question);
            for (String word : listLimit ) {
                if (result.equalsIgnoreCase(word)) {
                    isFound = true;
                    isRepeat = false;
                }
            }
            if (!isFound) {
                System.out.println(ERROR_INPUT_OUT_OF_CONDITION);
            }
        }while(isRepeat);
        return result;		
    }
    
    //fungsi untuk validasi type data dan range number
    public static int inputTypeNumberLimit(String question, int min, int max){
		boolean isValid = false;
		int number = 0;
		do{
			number = inputTypeNumber(question);
			if (number < min || number > max) {
                System.out.println (ERROR_INPUT_RANGE_DATA);
            }else{
				isValid = true;
            }
		} while(!isValid);
		return number;
	}
    public static int inputTypeNumber(String question){
		String number;
		boolean isValid = false;
		do{
			System.out.print(question);
			number = INPUT.nextLine();
			isValid = validateNumber(number);

			if (!isValid) {
				System.out.printf(ERROR_INPUT_TYPE_DATA, TEMPLATE_NUMBER);
			}
		} while(!isValid);
		return Integer.parseInt(number);
	}
    public static boolean validateNumber(String number){
		boolean result;
		if (!number.matches("[0-9]+")) {
			result = false;
		} else{
			result = true;
		}
        return result;
	}
    
    //fungsi untuk validasi masa kerja golongan 1 & 2 b,c,d tidak dibawah 3 tahun
    public static int inputWorkPeriodLimit(String question, int classRank, String workspaceGroup){
        boolean isValid = false;
        int number = 0;
        do{
            number = inputTypeNumber(question);
            if((classRank == CLASS_RANK[0] || classRank == CLASS_RANK[1]) && 
            (!workspaceGroup.equalsIgnoreCase(WORKSPACE_GROUP[0])) &&
            (number >= 0 && number < 3)){
                System.out.println(ERROR_INPUT_RANGE_WORK_PERIOD);
            }else{
                isValid = true;
            }
        }while(!isValid);
        return number;
    }

// ===== FUNGSI UNTUK KALKULASI ===== //
    //fungsi untuk mendapatkan index dari array gaji pokok
    public static int getIndex(String workspaceGroup) {
        int result = -1;
        for (int i = 0; i < WORKSPACE_GROUP4.length; i++) {
            if (workspaceGroup.equalsIgnoreCase(WORKSPACE_GROUP4[i])) {
                result = i;
            }
        }
        return result;
      }
    
    //fungsi untuk menentukan gaji pokok
    public static double getBasicSalary(int classRank, String workspaceGroup, int workPeriods){
        double result = 0;
        int index = getIndex(workspaceGroup);
        if (workPeriods > BASIC_SALARY[classRank - 1].length-1) {
            result = BASIC_SALARY[classRank - 1][BASIC_SALARY[classRank - 1].length-1][index];
        } else {
            result = BASIC_SALARY[classRank - 1][workPeriods][index];
        }
        return result;
      }

    //fungsi untuk mendapatkan tunjangan keluarga
    public static double getFamilyAllowance(String maritalStatus, double basicSalary, int totalChild){
        double familyAllowance = 0;

        if(maritalStatus.equalsIgnoreCase(MARITAL_STATUS[0])){
            familyAllowance = basicSalary * FAMILY_ALLOWANCE_PERCENT;
        }
        return familyAllowance;
    }
    
    //fungsi untuk mendapatkan tunjangan anak
    public static double getChildAllowance(int totalChild, double basicSalary){
        double childAllowance = 0;

        if(totalChild <= MAX_CHILD_ALLOWANCE){
            childAllowance = basicSalary * (totalChild * CHILD_ALLOWANCE_PERCENT );
        }else{
            childAllowance = basicSalary * (2 * CHILD_ALLOWANCE_PERCENT);
        }

        return childAllowance;
    }
    
    //fungsi untuk mendapatkan tunjangan beras
    public static double getRiceAllowance(String maritalStatus, int totalChild){
        double totalRiceAllowance = 0, riceAllowancePerPerson = 150000;

        if(maritalStatus.equalsIgnoreCase(MARITAL_STATUS[0])){
            if(totalChild <= MAX_CHILD_ALLOWANCE){
                totalRiceAllowance = riceAllowancePerPerson * (2 + totalChild);
            }else{
                totalRiceAllowance = riceAllowancePerPerson * 4;
            }   
        }else if(maritalStatus.equalsIgnoreCase(MARITAL_STATUS[1])){
                totalRiceAllowance = riceAllowancePerPerson;
        }else if(maritalStatus.equalsIgnoreCase(MARITAL_STATUS[2])){
            if(totalChild <= MAX_CHILD_ALLOWANCE){
                totalRiceAllowance = riceAllowancePerPerson * (1 + totalChild);
            }else{
                totalRiceAllowance = riceAllowancePerPerson * 4;
            }
        }
        return totalRiceAllowance;
    }   
    
    //fungsi untuk mendpatkan tunjangan jabatan
    public static double getGeneralAllowance(int classRank){
        double totalGeneralAllowance = 0;
        for(int i = 0; i < CLASS_RANK.length; i++){
            if(CLASS_RANK[i] == classRank){
                totalGeneralAllowance = GENERAL_AND_TAPERUM_ARRAY[i][2];
            }
        }
        return totalGeneralAllowance;
    } 
    
    //fungsi untuk mendapatkan gaji kotor
    public static double getGrossSalary(double basicSalary, double familyAllowance, double childAllowance, double riceAllowance, double generalAllowance){
        double grossSalary = basicSalary + familyAllowance + childAllowance + riceAllowance + generalAllowance;
        return grossSalary;
    } 
    
    //fungsi untuk mendapatkan potongan pph21
    public static double getPphDeduction(double basicSalary, double grossSalary, String maritalStatus, int totalChild, double familyAllowance, double childAllowance){
        double nettSalaryPerYear, nettSalaryPerMonth, pphDeduction = 0, generalFee, pensionFee, minimalGrossSalary = 4500000, selfTax = 36000000, wifeTax = 3000000, childTax = 3000000;

        if(grossSalary > minimalGrossSalary){
            pensionFee = (basicSalary + familyAllowance + childAllowance ) * PENSION_FEE_PERCENT;
            generalFee = grossSalary * GENERAL_FEE_PERCENT;
            nettSalaryPerMonth = grossSalary - (pensionFee + generalFee);
            nettSalaryPerYear = nettSalaryPerMonth * 12;
            
            if(maritalStatus.equalsIgnoreCase(MARITAL_STATUS[0])){
                if(totalChild <= 3){
                    pphDeduction = (nettSalaryPerYear - (selfTax + wifeTax + (totalChild * childTax)));
                }else{
                    pphDeduction = (nettSalaryPerYear - (selfTax + wifeTax + (3 * childTax)));
                }
            }else if(maritalStatus.equalsIgnoreCase(MARITAL_STATUS[1])){
                pphDeduction = (nettSalaryPerYear - selfTax);
            }else if(maritalStatus.equalsIgnoreCase(MARITAL_STATUS[2])){
                if(totalChild <= 3){
                    pphDeduction = (nettSalaryPerYear - (selfTax + (totalChild * childTax)));
                }else{
                    pphDeduction = (nettSalaryPerYear - (selfTax + (3 * childTax)));
                }
            }
        }
        pphDeduction = (pphDeduction * PPH_PERCENT) /12;
        return pphDeduction;
    }
    
    //fungsi untuk mendapatkan potongan IWP
    public static double getTaxPayerDuesDeduction(double basicSalary, double familyAllowance, double childAllowance){
        double taxPayerDues = (basicSalary + familyAllowance + childAllowance) * TAX_PAYER_DUES_PERCENT;
        return taxPayerDues;
    } 
    
    //fungsi untuk mendapatkan potongan tabungan perumahan
    public static double getHouseSavingDeduction(int classRank){
        double totalHouseSavingDeduction = 0; 
        for(int i = 0; i < CLASS_RANK.length; i++){
            if(CLASS_RANK[i] == classRank){
                totalHouseSavingDeduction = GENERAL_AND_TAPERUM_ARRAY[i][1];
            }
        }
        return totalHouseSavingDeduction;
    }  

    //fungsi untuk mendapatkan take home pay
    public static double getNettSalary(double grossSalary, double pphDeduction, double taxPayerDues, double houseSavingDeduction){
        double nettSalary = grossSalary - (pphDeduction + taxPayerDues + houseSavingDeduction);
        return nettSalary;
    }
    
    //fungsi untuk menampung variable konstanta
    public static final Scanner INPUT = new Scanner(System.in);
    
    public static final double PPH_PERCENT = 0.05, TAX_PAYER_DUES_PERCENT = 0.1, GENERAL_FEE_PERCENT = 0.05, PENSION_FEE_PERCENT = 0.0475, FAMILY_ALLOWANCE_PERCENT = 0.1, CHILD_ALLOWANCE_PERCENT = 0.02,
    GENERAL_AND_TAPERUM_ARRAY [][] = {{1, 3000, 175000}, {2, 5000, 180000}, {3, 7000, 185000}, {4, 10000, 190000}},
    BASIC_SALARY [][][] = {{{1560800, 0, 0, 0}, {1560800, 0, 0, 0}, {1610000, 0, 0, 0}, {1610000, 1704500, 1776600, 1851800}, {1660700, 1704500, 1776600, 1851800}, {1660700, 1758200, 1832600, 1910100}, {1713000, 1758200, 1832600, 1910100}, {1713000, 1813600, 1890300, 1970200}, {1766900, 1813600, 1890300, 1970200}, {1766900, 1870700, 1949800, 2032300}, {1822600, 1870700, 1949800, 2032300}, {1822600, 1929600, 2011200, 2096300}, {1880000, 1929600, 2011200, 2096300}, {1880000, 1990400, 2074600, 2162300}, {1939200, 1990400, 2074600, 2162300}, {1939200, 2053100, 2139900, 2230400}, {2000300, 2053100, 2139900, 2230400}, {2000300, 2117700, 2207300, 2300700}, {2063300, 2117700, 2207300, 2300700}, {2063300, 2184400, 2276800, 2373100}, {2128300, 2184400, 2276800, 2373100}, {2128300, 2253200, 2348500, 2447900}, {2195300, 2253200, 2348500, 2447900}, {2195300, 2324200, 2422500, 2525000}, {2264400, 2324200, 2422500, 2525000}, {2264400, 2397400, 2498800, 2604500}, {2335800, 2397400, 2498800, 2604500}, {2335800, 2472900, 2557500, 2686500}},
                           {{2022200, 0, 0, 0}, {2054100, 0, 0, 0}, {2054100, 0, 0, 0}, {2118800, 2208400, 2301800, 2399200},{2118800, 2208400, 2301800, 2399200}, {2185500, 2277900, 2374300, 2474700}, {2185500, 2277900, 2374300, 2474700},{2254300, 2349700, 2449100, 2552700}, {2254300, 2349700, 2449100, 2552700}, {2325300, 2423700, 2526200, 2633100},{2325300, 2423700, 2526200, 2633100}, {2398600, 2500000, 2605800, 2716000}, {2398600, 2500000, 2605800, 2716000}, {2474100, 2578800, 2687800, 2801500}, {2474100, 2578800, 2687800, 2801500}, {2552000, 2660000, 2772500, 2889800}, {2552000, 2660000, 2772500, 2889800}, {2632400, 2743800, 2859800, 2980800}, {2632400, 2743800, 2859800, 2980800}, {2715300, 2830200, 2949900, 3074700}, {2715300, 2830200, 2949900, 3074700}, {2800800, 2919300, 3042800, 3171500}, {2800800, 2919300, 3042800, 3171500}, {2889100, 3011200, 3138600, 3271400}, {2889100, 3011200, 3138600, 3271400}, {2980000, 3106100, 3237500, 3374400}, {2980000, 3106100, 3237500, 3374400}, {3073900, 3203900, 3339400, 3480700}, {3073900, 3203900, 3339400, 3480700}, {3170700, 3304800, 3444600, 3590300}, {3170700, 3304800, 3444600, 3590300},{3270600, 3408900, 3553100, 3703400}, {3270600, 3408900, 3553100, 3703400}, {3373600, 3516300, 3665000, 3820000}},
                           {{2579400, 2688500, 2802300, 2920800}, {2579400, 2688500, 2802300, 2920800}, {2660700, 2773200, 2890500, 3012800}, {2660700, 2773200, 2890500, 3012800}, {2744500, 2860500, 2981500, 3107700}, {2744500, 2860500, 2981500, 3107700}, {2830900, 2950600, 3075500, 3205500}, {2830900, 2950600, 3075500, 3205500}, {2920100, 3043600, 3172300, 3306500}, {2920100, 3043600, 3172300, 3306500}, {3012000, 3139400, 3272200, 3410600}, {3012000, 3139400, 3272200, 3410600}, {3106900, 3238300, 3375300, 3518100}, {3106900, 3238300, 3375300, 3518100}, {3204700, 3340300, 3481600, 3628900}, {3204700, 3340300, 3481600, 3628900}, {3305700, 3445500, 3591200, 3743100}, {3305700, 3445500, 3591200, 3743100}, {3409800, 3554000, 3704300, 3861000}, {3409800, 3554000, 3704300, 3861000}, {3517200, 3665900, 3821000, 3982600}, {3517200, 3665900, 3821000, 3982600}, {3627900, 3781400, 3941400, 4108100}, {3627900, 3781400, 3941400, 4108100}, {3742200, 3900500, 4065500, 4237500}, {3742200, 3900500, 4065500, 4237500}, {3860100, 4023300, 4193500, 4370900}, {3860100, 4023300, 4193500, 4370900}, {3981600, 4150100, 4325600, 4508600}, {3981600, 4150100, 4325600, 4508600}, {4107000, 4280800, 4461800, 4650600}, {4107000, 4280800, 4461800, 4650600}, {4236400, 4415600, 4602400, 4797000}},
                           {{3044300, 3173100, 3307300, 3447200, 3593100}, {3044300, 3173100, 3307300, 3447200, 3593100}, {3140200, 3272100, 3411500, 3555800, 3706200}, {3140200, 3272100, 3411500, 3555800, 3706200}, {3239100, 3376100, 3518900, 3667800, 3822900}, {3239100, 3376100, 3518900, 3667800, 3822900}, {3341100, 3482500, 3629800, 3783300, 3943300}, {3341100, 3482500, 3629800, 3783300, 3943300}, {3446400, 3592100, 3744100, 3902500, 4067500}, {3446400, 3592100, 3744100, 3902500, 4067500}, {3554900, 3705300, 3382000, 4025400, 4195700}, {3554900, 3705300, 3382000, 4025400, 4195700}, {3666900, 3822000, 3983600, 4152200, 4327800}, {3666900, 3822000, 3983600, 4152200, 4327800}, {3782400, 3942400, 4109100, 4282900, 4462100}, {3782400, 3942400, 4109100, 4282900, 4462100}, {3901500, 4066500, 4238500, 4417800, 4604700}, {3901500, 4066500, 4238500, 4417800, 4604700}, {4024400, 4194600, 4372000, 4557000, 4749700}, {4024400, 4194600, 4372000, 4557000, 4749700}, {4151100, 4326700, 4509700, 4700500, 4899300}, {4151100, 4326700, 4509700, 4700500, 4899300}, {4281800, 4463000, 4651800, 4848500, 5053600}, {4281800, 4463000, 4651800, 4848500, 5053600}, {4416700, 4603500, 4798300, 5001200, 5212800}, {4416700, 4603500, 4798300, 5001200, 5212800}, {4555800, 4748500, 4949400, 5158700, 5377000}, {4555800, 4748500, 4949400, 5158700, 5377000}, {4699300, 4898100, 5105300, 5321200, 5546300}, {4699300, 4898100, 5105300, 5321200, 5546300}, {4847300, 5052300, 5266100, 5488800, 5721000}, {4847300, 5052300, 5266100, 5488800, 5721000}, {5000000, 5211500, 5431900, 5661700, 5901200}},
                           {{3044300, 3173100, 3307300, 3447200, 3593100}, {3044300, 3173100, 3307300, 3447200, 3593100}, {3140200, 3272100, 3411500, 3555800, 3706200}, {3140200, 3272100, 3411500, 3555800, 3706200}, {3239100, 3376100, 3518900, 3667800, 3822900}, {3239100, 3376100, 3518900, 3667800, 3822900}, {3341100, 3482500, 3629800, 3783300, 3943300}, {3341100, 3482500, 3629800, 3783300, 3943300}, {3446400, 3592100, 3744100, 3902500, 4067500}, {3446400, 3592100, 3744100, 3902500, 4067500}, {3554900, 3705300, 3382000, 4025400, 4195700}, {3554900, 3705300, 3382000, 4025400, 4195700}, {3666900, 3822000, 3983600, 4152200, 4327800}, {3666900, 3822000, 3983600, 4152200, 4327800}, {3782400, 3942400, 4109100, 4282900, 4462100}, {3782400, 3942400, 4109100, 4282900, 4462100}, {3901500, 4066500, 4238500, 4417800, 4604700}, {3901500, 4066500, 4238500, 4417800, 4604700}, {4024400, 4194600, 4372000, 4557000, 4749700}, {4024400, 4194600, 4372000, 4557000, 4749700}, {4151100, 4326700, 4509700, 4700500, 4899300}, {4151100, 4326700, 4509700, 4700500, 4899300}, {4281800, 4463000, 4651800, 4848500, 5053600}, {4281800, 4463000, 4651800, 4848500, 5053600}, {4416700, 4603500, 4798300, 5001200, 5212800}, {4416700, 4603500, 4798300, 5001200, 5212800}, {4555800, 4748500, 4949400, 5158700, 5377000}, {4555800, 4748500, 4949400, 5158700, 5377000}, {4699300, 4898100, 5105300, 5321200, 5546300}, {4699300, 4898100, 5105300, 5321200, 5546300}, {4847300, 5052300, 5266100, 5488800, 5721000}, {4847300, 5052300, 5266100, 5488800, 5721000}, {5000000, 5211500, 5431900, 5661700, 5901200}}};

    public static final int CLASS_RANK [] = {1, 2, 3, 4}, MIN_CLASS_RANK = 1, MAX_CLASS_RANK = 4, MIN = 0, MAX_WORK_PERIOD = 60, MAX_TOTAL_CHILD = 100, MAX_CHILD_ALLOWANCE = 2;
    
    public static final String TEMPLATE_LETTER = "huruf", TEMPLATE_NUMBER = "angka", LINE = "\n=========================================\n",
    WORKSPACE_GROUP [] = {"A", "B", "C", "D"}, WORKSPACE_GROUP4 [] = {"A", "B", "C", "D", "E"}, MARITAL_STATUS [] = {"kawin", "belum kawin", "cerai"},
    INPUT_NAME = "\nMasukkan Nama : ", INPUT_CLASS_RANK = "\nMasukkan Golongan Pangkat (1-4) : ", INPUT_WORKSPACE_GROUP = "\nMasukkan Golongan Ruang Kerja (A/B/C/D) : ", INPUT_WORKSPACE_GROUP4 = "\nMasukkan Golongan Ruang Kerja (A/B/C/D/E) : ", 
    INPUT_WORK_PERIODS = "\nMasukkan Masa Kerja (tahun) : ", INPUT_MARITAL_STATUS = "\nMasukkan Status Pernikahan (Kawin/Belum Kawin/Cerai) : ", INPUT_TOTAL_CHILDRENS = "\nMasukkan Jumlah Anak : ",
    ERROR_INPUT_TYPE_DATA = "\nMaaf, hanya menerima inputan berupa %s saja.\nSilahkan input kembali!\n", ERROR_INPUT_OUT_OF_CONDITION = "\nMaaf, input yang kamu masukkan diluar syarat.\nSilahkan input kembali",
    ERROR_INPUT_RANGE_DATA = "\nMaaf, Input tidak boleh diluar batas yang ditentukan.\nSilahkan input kembali!\n", ERROR_INPUT_RANGE_WORK_PERIOD = "\nMaaf, Golongan 1 & 2 B, C, D tidak ada masa kerja dibawah 3 tahun.\nSilahkan input kembali.";
}