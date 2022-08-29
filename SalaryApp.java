import java.util.*;

public class SalaryApp {
    public static void main(String[] args){
        String name, role, branchOffice, maritalStatus;
        double pensionDeduction, bpjsDeduction, pphDeduction, transportAllowance, workPeriods, grossSalary, nettSalary, roleAllowance, basicSalary, familyAllowance, employeeAllowance;
        
        getHeader();
        getListRole();
        getListBranchOffice();

        name = inputTypeAlphabet(INPUT_NAME);
        role = inputTypeAlphabet(INPUT_ROLE);
        branchOffice = getValidateBranchOffice(inputTypeAlphabet(INPUT_BRANCH_OFFICE));
        workPeriods = inputTypeNumberLimit(INPUT_WORK_PERIOD, MIN_WORK_PERIOD);
        maritalStatus = getValidateMaritalStatus(inputTypeAlphabet(INPUT_MARITAL_STATUS));

        basicSalary = getBasicSalary(workPeriods, branchOffice, role);
        transportAllowance = getTransportAllowance(branchOffice);
        roleAllowance = getRoleAllowance(workPeriods, basicSalary);
        familyAllowance = getFamilyAllowance(maritalStatus, basicSalary);
        employeeAllowance = getEmployeeAllowance(role);
        grossSalary = getGrossSalary(basicSalary, roleAllowance, familyAllowance, employeeAllowance);
        pensionDeduction = getPensionDeduction(grossSalary);
        bpjsDeduction = getBpjsDeduction(grossSalary);
        pphDeduction = getPphDeduction(grossSalary);
        nettSalary = getNettSalary(grossSalary, pensionDeduction, bpjsDeduction, pphDeduction);

        getResult(name, pensionDeduction, bpjsDeduction, pphDeduction, transportAllowance, basicSalary, roleAllowance, familyAllowance, employeeAllowance, grossSalary, nettSalary);

    }

    //fungsi untuk menampilkan header program
    public static void getHeader(){
        System.out.println(LINE + HEADER_PROGRAM + LINE);
    }
    
    //fungsi untuk menampilkan list posisi jabatan
    public static void getListRole(){
        System.out.println(TEMPLATE_LIST_ROLE + LINE);
    }
    
    //fungsi untuk menampilkan list cabang kantor
    public static void getListBranchOffice(){
        System.out.println(TEMPLATE_LIST_BRANCH_OFFICE + LINE);
    }

    //fungsi untuk menampilkan hasil akhir
    public static void getResult(String name, double pensionDeduction, double bpjsDeduction, double pphDeduction, double transportAllowance, double basicSalary, double roleAllowance, double familyAllowance, double employeeAllowance, double grossSalary, double nettSalary){
        System.out.println(LINE + TEMPLATE_SALARY_SLIP + LINE);
        System.out.println("\t\t\s\s" + name + LINE);
        System.out.printf(OUTPUT_BASIC_SALARY, basicSalary);
        System.out.printf(OUTPUT_TRANSPORT_ALLOWANCE, transportAllowance);
        System.out.printf(OUTPUT_FAMILY_ALLOWANCE, familyAllowance);
        System.out.printf(OUTPUT_ROLE_ALLOWANCE, roleAllowance);
        System.out.printf(OUTPUT_EMPLOYEE_ALLOWANCE, employeeAllowance);
        System.out.printf(LINE + OUTPUT_GROSS_SALARY + LINE, grossSalary);
        System.out.printf(OUTPUT_PENSION_DEDUCTION, pensionDeduction);
        System.out.printf(OUTPUT_BPJS_DEDUCTION, bpjsDeduction);
        System.out.printf(OUTPUT_PPH_DEDUCTION, pphDeduction);
        System.out.printf(LINE + OUTPUT_NETT_SALARY + LINE, nettSalary);
    }
// ===== FUNGSI UNTUK VALIDASI ===== //

    //fungsi untuk validasi type data dan range string
    public static String inputTypeAlphabetLimit(String question, String[] listWord){
		boolean isRepeat = true, isFound;
		String result = "";
		do {
			isFound = false;
			result = inputTypeAlphabet(question);
			for (String word : listWord) {
				if (result.equalsIgnoreCase(word)) {
					isFound = true;
					isRepeat = false;
				}
			}
			if (!isFound) {
				System.out.println("Input tidak sesuai.");
			}
		} while(isRepeat);
		return result;
	}
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
    
    //fungsi untuk validasi type data dan range number
    public static int inputTypeNumberLimit(String question, int min){
		boolean isValid = false;
		int number = 0;
		do{
			number = inputTypeNumber(question);
			if (number < min) {
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
			return result = false;
		} else{
			return result = true;
		}
	}
    
    //fungsi untuk validasi batasan input cabang kantor
    public static String getValidateBranchOffice(String branchOffice){
        boolean isRepeat = true;

        while(isRepeat == true){
            if(!(branchOffice.equalsIgnoreCase("bandung")
            || branchOffice.equalsIgnoreCase("garut")
            || branchOffice.equalsIgnoreCase("jakarta")
            || branchOffice.equalsIgnoreCase("bekasi")
            || branchOffice.equalsIgnoreCase("bogor")
            || branchOffice.equalsIgnoreCase("palembang"))){
                System.out.println(ERROR_INPUT_OUT_OF_CONDITION);
                branchOffice = inputTypeAlphabet(INPUT_BRANCH_OFFICE);
            }else{
                isRepeat = false;
            }
        }

        return branchOffice;
    }
 
    //fungsi untuk validasi batasan input status pernikahan
    public static String getValidateMaritalStatus(String maritalStatus){
        boolean isRepeat = true;

        while(isRepeat == true){
            if(!(maritalStatus.equalsIgnoreCase("ya") || maritalStatus.equalsIgnoreCase("tidak"))){
                System.out.println(ERROR_INPUT_OUT_OF_CONDITION);
                maritalStatus = inputTypeAlphabet(INPUT_MARITAL_STATUS);
            }else{
                isRepeat = false;
            }
        }
        return maritalStatus;
    }

// ===== FUNGSI UNTUK KALKULASI ==== //

    //fungsi untuk perhitungan gaji kotor
    public static double getGrossSalary(double basicSalary, double roleAllowance, double familyAllowance, double employeeAllowance){
        double grossSalary = 0;

        grossSalary = basicSalary + familyAllowance + roleAllowance + employeeAllowance;

        return grossSalary;
    }
    
    //fungsi untuk perhitungan potongan pensiun
    public static double getPensionDeduction(double grossSalary){
        double pensionDeduction;
        
        pensionDeduction = grossSalary * PENSION_DEDUCTION;

        return pensionDeduction;
    }

    //fungsi untuk perhitungan potongan bpjs
    public static double getBpjsDeduction(double grossSalary){
        double bpjsDeduction;
            
        bpjsDeduction = grossSalary * BPJS_DEDUCTION;
    
        return bpjsDeduction;
    }

    //fungsi untuk perhitungan potongan pph
    public static double getPphDeduction(double grossSalary){
       double pphDeduction;
            
        pphDeduction = grossSalary * PPH_DEDUCTION;
    
        return pphDeduction;
    }
    
    //fungsi untuk perhitungan gaji bersih
    public static double getNettSalary(double grossSalary, double pensionDeduction, double bpjsDeduction, double pphDeduction){
        double nettSalary = 0;

        nettSalary = grossSalary - pensionDeduction - bpjsDeduction - pphDeduction;

        return nettSalary;
    }
    
    //fungsi untuk menentukan umk
    public static double getbranchOfficeSalary(String branchOffice){
        double branchOfficeSalary = 0;

        branchOffice = getValidateBranchOffice(branchOffice);
        if(branchOffice.equalsIgnoreCase("bandung")){
            branchOfficeSalary = 3742276;
        }else if(branchOffice.equalsIgnoreCase("garut")){
            branchOfficeSalary = 1961085 ;
        }else if(branchOffice.equalsIgnoreCase("jakarta")){
            branchOfficeSalary = 4453935 ;
        }else if(branchOffice.equalsIgnoreCase("bekasi")){
            branchOfficeSalary = 4782935 ;
        }else if(branchOffice.equalsIgnoreCase("bogor")){
            branchOfficeSalary = 4330249 ;
        }else if(branchOffice.equalsIgnoreCase("palembang")){
            branchOfficeSalary = 3289409 ;
        }
        
        return branchOfficeSalary;
  
    }

    //fungsi untuk menentukan gaji dan tunjangan sesuai role dan lama bekerja
    public static double getBasicSalary(double workPeriods, String branchOffice, String role ){
        double basicSalary = 0;
        double branchOfficeSalary = getbranchOfficeSalary(branchOffice);

        if(role.equalsIgnoreCase("admin")){
            if(workPeriods < 2){
                basicSalary = branchOfficeSalary;
            }else if(workPeriods >= 2){
                basicSalary = branchOfficeSalary * 1.2;
            }
        }else if(role.equalsIgnoreCase("coordinator")){
            if(workPeriods < 3){
                basicSalary = branchOfficeSalary * 1.1;
            }else if(workPeriods >= 3){
                basicSalary = branchOfficeSalary * 1.3;
            }
        }else if(role.equalsIgnoreCase("spv")){
            if(workPeriods < 2){
                basicSalary = branchOfficeSalary * 1.25;
            }else if(workPeriods >= 2 && workPeriods <=4){
                basicSalary = branchOfficeSalary * 1.4;
            }else if(workPeriods >= 5){
                basicSalary = branchOfficeSalary * 1.5;
            }
        }else if(role.equalsIgnoreCase("manager")){
            if(workPeriods < 3){
                basicSalary = branchOfficeSalary * 1.5;
            }else if(workPeriods >= 3){
                basicSalary = branchOfficeSalary * 2;
            }
        }else if(role.equalsIgnoreCase("sprinter")){
            basicSalary = branchOfficeSalary * 0.9;
        }else if(role.equalsIgnoreCase("officer")){
            basicSalary = branchOfficeSalary;
        }
        return basicSalary;
    }
    
    //fungsi untuk menentukan tunjangan pegawai sesuai posisi jabatan
    public static double getEmployeeAllowance(String role){
        double employeAllowance = 0;

        if(role.equalsIgnoreCase("admin")){
            employeAllowance  = 200000;
        }else if(role.equalsIgnoreCase("coordinator")){
            employeAllowance = 500000;
        }else if(role.equalsIgnoreCase("spv")){
            employeAllowance = 700000;
        }else if(role.equalsIgnoreCase("manager")){
            employeAllowance = 1000000;
        }else if(role.equalsIgnoreCase("sprinter")){
            employeAllowance = 200000;
        }else if(role.equalsIgnoreCase("officer")){
            employeAllowance = 200000;
        }

        return employeAllowance;
    }
    
    //fungsi untuk menentukan tunjangan keluarga
    public static double getFamilyAllowance(String maritalStatus, double basicSalary){
        double familyAllowance;

        if(maritalStatus.equalsIgnoreCase("ya")){
            familyAllowance = basicSalary * 0.1;
        }else{
            familyAllowance = 0;
        }

        return familyAllowance;
    }
    
    //fungsi untuk menentukan tunjangan jabatan
    public static double getRoleAllowance(double workPeriods, double basicSalary){
        double roleAllowance = 0;

        if(workPeriods > 4){
            roleAllowance = basicSalary * 0.05;
        }else{
            roleAllowance = 0;
        }

        return roleAllowance;
    }

    //fungsi untuk menentukan tunjangan transportasi
    public static double getTransportAllowance(String branchOffice){
        double transportAllowance = 0;
        if(branchOffice.equalsIgnoreCase("jakarta")){
            transportAllowance = 500000;
        }else{
            transportAllowance = 0;
        }
        return transportAllowance;
    }

    //fungsi untuk menampung variable konstanta
    public static final Scanner INPUT = new Scanner(System.in);
    public static final int MIN_WORK_PERIOD = 0, TRANSPORT_ALLOWANCE = 500000;
    public static final double PENSION_DEDUCTION = 0.02, BPJS_DEDUCTION = 0.02, PPH_DEDUCTION = 0.05;
    public static final String TEMPLATE_LETTER = "huruf", TEMPLATE_NUMBER = "angka",
        TEMPLATE_SALARY_SLIP = "\t\s\s\sSlip Gaji Karyawan", TEMPLATE_OUTPUT = "Output : ",
        TEMPLATE_LIST_ROLE = "List Posisi Jabatan yang tersedia :\n- Admin\n- Coordinator\n- SPV\n- Manager\n- Sprinter\n- Officer\n",
        TEMPLATE_LIST_BRANCH_OFFICE = "List Cabang Kantor yang tersedia :\n- Bandung\n- Garut\n- Jakarta\n- Bekasi\n- Bogor\n- Palembang\n",
        LINE = "\n=========================================\n",
        HEADER_PROGRAM = "\s\s\s\sSelamat Datang di Aplikasi\n\t\s\sPerhitungan Gaji\n\tPT. Secret Semut 79",
        INPUT_NAME = "Nama : ",
        INPUT_ROLE = "\nPosisi Jabatan : ",
        INPUT_BRANCH_OFFICE = "\nCabang Kantor : ",
        INPUT_WORK_PERIOD = "\nMasa Kerja (Tahun) : ",
        INPUT_MARITAL_STATUS = "\nStatus Pernikahan (Ya/Tidak) : ",
        OUTPUT_BASIC_SALARY = "Gaji Pokok\t\t: Rp. %.1f",
        OUTPUT_TRANSPORT_ALLOWANCE = "\nTunj. Transportasi\t: Rp. %.1f",
        OUTPUT_FAMILY_ALLOWANCE = "\nTunj. Keluarga\t\t: Rp. %.1f",
        OUTPUT_ROLE_ALLOWANCE = "\nTunj. Jabatan\t\t: Rp. %.1f",
        OUTPUT_EMPLOYEE_ALLOWANCE = "\nTunj. Pegawai\t\t: Rp. %.1f",
        OUTPUT_GROSS_SALARY = "Gaji Kotor\t\t: Rp. %.1f",
        OUTPUT_PENSION_DEDUCTION = "Potongan Pensiun\t: Rp. %.1f",
        OUTPUT_BPJS_DEDUCTION = "\nBPJS\t\t\t: Rp. %.1f",
        OUTPUT_PPH_DEDUCTION = "\nPPH\t\t\t: Rp. %.1f",
        OUTPUT_NETT_SALARY = "Take Home Pay\t\t: Rp. %.1f",
        ERROR_INPUT_TYPE_DATA = "\nMaaf, hanya menerima inputan berupa %s saja.\nSilahkan input kembali!\n",
        ERROR_INPUT_OUT_OF_CONDITION = "\nMaaf, input yang kamu masukkan diluar syarat.\nSilahkan input kembali",
        ERROR_INPUT_RANGE_DATA = "\nMaaf, Input Masa Kerja tidak boleh kurang dari 0.\nSilahkan input kembali!\n";
}