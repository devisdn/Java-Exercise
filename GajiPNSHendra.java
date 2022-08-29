import java.util.*;

//javac GajiPNSHendra.java

public class GajiPNSHendra {
    public static void main(String[] args){
        //deklarasi variable
        String name, workspaceGroup, maritalStatus;
        int classRank, workPeriods, totalChild;
        
        
        getHeader();

        name = inputTypeAlphabet(INPUT_NAME);
        classRank = inputTypeNumberLimit(INPUT_CLASS_RANK, MIN);

        if(classRank != CLASS_RANK[3]){
            workspaceGroup = inputTypeAlphabetLimit(INPUT_WORKSPACE_GROUP, WORKSPACE_GROUP);
        }else{
            workspaceGroup = inputTypeAlphabetLimit(INPUT_WORKSPACE_GROUP4, WORKSPACE_GROUP);
        }
        
        workPeriods = inputTypeNumberLimit(INPUT_WORK_PERIODS, MIN);
        maritalStatus = inputTypeAlphabetLimit(INPUT_MARITAL_STATUS, MARITAL_STATUS);
        totalChild = inputTypeNumberLimit(INPUT_TOTAL_CHILDRENS, MIN);

        getResult(name, classRank, workspaceGroup, workPeriods, maritalStatus, totalChild);
        
    }

// ===== FUNGSI UNTUK OUTPUT ====== //

    //fungsi untuk menampilkan header program
    public static void getHeader(){
        System.out.println(LINE + HEADER_PROGRAM + LINE);
    }
    //fungsi untuk menampilkan hasil akhir
    public static void getResult(String name, int classRank, String workspaceGroup, int workPeriods, String maritalStatus, int totalChild){
        System.out.println(LINE + TEMPLATE_SALARY_SLIP + LINE);
        System.out.println(OUTPUT_NAME + name);
        System.out.println(OUTPUT_GROUP + classRank + "-" + workspaceGroup);
        System.out.println(OUTPUT_WORK_PERIODS + workPeriods + "tahun");
        System.out.println(OUTPUT_MARITAL_STATUS + maritalStatus);
        System.out.println(OUTPUT_TOTAL_CHILD + totalChild);
        System.out.println(LINE + OUTPUT_BASIC_SALARY + LINE);
        System.out.println(OUTPUT_FAMILY_ALLOWANCE);
        System.out.println(OUTPUT_CHILD_ALLOWANCE);
        System.out.println(OUTPUT_RICE_ALLOWANCE);
        System.out.println(LINE + OUTPUT_GROSS_SALARY + LINE);
        System.out.println(OUTPUT_PPH_DEDUCTION);
        System.out.println(OUTPUT_TAXPAYER_DUES_DEDUCTION);
        System.out.println(OUTPUT_HOUSE_SAVINGS_DEDUCTION);
        System.out.println(LINE + OUTPUT_NETT_SALARY + LINE);
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

// ===== FUNGSI UNTUK KALKULASI ===== //
    //fungsi untuk menampung variable konstanta
    public static final Scanner INPUT = new Scanner(System.in);
    public static final int CLASS_RANK [] = {1, 2, 3, 4}, MIN = 0;
    public static final String TEMPLATE_LETTER = "huruf", TEMPLATE_NUMBER = "angka", TEMPLATE_WORK_PERIODS = "Lama Bekerja", TEMPLATE_TOTAL_CHILD = "Jumlah Anak",
    TEMPLATE_SALARY_SLIP = "\t\s\s\s\s\sSlip Gaji PNS",
    WORKSPACE_GROUP [] = {"A", "B", "C", "D"},
    WORKSPACE_GROUP4 [] = {"A", "B", "C", "D", "E"},
    MARITAL_STATUS [] = {"kawin", "belum kawin", "cerai"},
    LINE = "\n=========================================\n",
    HEADER_PROGRAM = "\tSelamat Datang di Aplikasi\n\t\s\s\sPerhitungan Gaji PNS\n\tGolongan I s.d IV tahun 2019",
    INPUT_NAME = "\nMasukkan Nama : ", OUTPUT_NAME = "\nNama\t\t\t: ",
    INPUT_CLASS_RANK = "\nMasukkan Golongan Pangkat (1-4) : ", OUTPUT_GROUP = "\nGolongan\t\t: ",
    INPUT_WORKSPACE_GROUP = "\nMasukkan Golongan Ruang Kerja (A/B/C/D) : ",
    INPUT_WORKSPACE_GROUP4 = "\nMasukkan Golongan Ruang Kerja (A/B/C/D/E) : ",
    INPUT_WORK_PERIODS = "\nMasukkan Masa Kerja (tahun) : ", OUTPUT_WORK_PERIODS = "\nMasa Kerja\t: ",
    INPUT_MARITAL_STATUS = "\nMasukkan Status Pernikahan (Kawin/Belum Kawin/Cerai) : ", OUTPUT_MARITAL_STATUS = "\nStatus Pernikahan: ",
    INPUT_TOTAL_CHILDRENS = "\nMasukkan Jumlah Anak : ", OUTPUT_TOTAL_CHILD = "\nJumlah Anak\t: ",
    OUTPUT_BASIC_SALARY = "Gaji Pokok\t\t:",
    OUTPUT_GROSS_SALARY = "Gaji Kotor\t\t: ",
    OUTPUT_NETT_SALARY = "Take Home Pay\t\t: ",
    OUTPUT_FAMILY_ALLOWANCE = "Tunjangan Keluarga\t: ",
    OUTPUT_CHILD_ALLOWANCE = "\nTunjangan Anak\t\t: ",
    OUTPUT_RICE_ALLOWANCE = "\nTunjangan Beras\t\t: ",
    OUTPUT_PPH_DEDUCTION = "Potongan PPH 21\t\t: ",
    OUTPUT_TAXPAYER_DUES_DEDUCTION = "\nPotongan IWP\t\t: ",
    OUTPUT_HOUSE_SAVINGS_DEDUCTION = "\nPotongan Taperum\t: ",
    ERROR_INPUT_TYPE_DATA = "\nMaaf, hanya menerima inputan berupa %s saja.\nSilahkan input kembali!\n",
    ERROR_INPUT_OUT_OF_CONDITION = "\nMaaf, input yang kamu masukkan diluar syarat.\nSilahkan input kembali",
    ERROR_INPUT_RANGE_DATA = "\nMaaf, Input %s tidak boleh kurang dari 0.\nSilahkan input kembali!\n";
}
