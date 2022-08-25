import java.util.*;
//javac FamilySavingsV2.java
public class FamilySavingsV2 {
    public static void main(String[] args){
        int i, totalSavings = 0, totalMember, savingPerMonth = 0, savingPeriods, totalSavingPerMonth[];

        getHeader();
        
        totalMember = inputTypeNumberLimit(INPUT_TOTAL_MEMBERS, MIN_MEMBERS, MAX_MEMBERS);
        savingPeriods = inputTypeNumberLimit(INPUT_TOTAL_SAVING_PERIODS, MIN_SAVING_PERIODS, MAX_SAVING_PERIODS);

        totalSavingPerMonth = new int[savingPeriods];

        for(i = 0; i < savingPeriods; i++){
            savingPerMonth = 0;
            for(int j = TOTAL_DAY_PERMONTH[i]; j >= 1; j-- ){
                savingPerMonth += (j * 1000);
            }
            totalSavingPerMonth[i] = savingPerMonth * totalMember;
            totalSavings += totalSavingPerMonth[i];
        }
        for(i = 0; i < savingPeriods; i++){
            getOutputListSavingPerMonth(i, totalSavingPerMonth);
        }
        getOutputResult(savingPeriods, totalMember, totalSavings);
    }

    //fungsi untuk menampilkan header program
    public static void getHeader(){
        System.out.println(LINE + HEADER_PROGRAM + LINE);
    }
    //fungsi untuk validasi range dari inputan
	public static int inputTypeNumberLimit(String question, int min, int max){
		boolean isValid = false;
		int number = 0;
		do{
			number = inputTypeNumber(question);
			if (number < min) {
				System.out.printf(ERROR_INPUT_RANGE, TEMPLATE_TOTAL_MEMBER, LESS, min);
			}else if(number > max){
                System.out.printf(ERROR_INPUT_RANGE, TEMPLATE_TOTAL_MEMBER, EXCESS, max);
            }else{
				isValid = true;
            }
		} while(!isValid);
		return number;
	}
    //
    public static int inputTypeNumber(String question){
		String number;
		boolean isValid = false;
		do{
			System.out.println(question);
			number = INPUT.nextLine();
			isValid = validateNumber(number);

			if (!isValid) {
				System.out.println(ERROR_INPUT_TYPE_DATA);
			}
		} while(!isValid);
		return Integer.parseInt(number);
	}
    //fungsi untuk menentukan inputan berupa integer
    public static boolean validateNumber(String number){
		boolean result;
		if (!number.matches("[0-9]+")) {
			return result = false;
		} else{
			return result = true;
		}
	}
    //fungsi untuk menghitung jumlah tabungan perbulan
    public static int getSavingPerMonth(int j, int savingPerMonth){
            savingPerMonth += (j * 1000);
        return savingPerMonth;
    }
    //fungsi untuk mendapatkan list tabungan tiap bulan
    public static void getOutputListSavingPerMonth(int i, int totalSavingPerMonth[]){
        System.out.printf(OUTPUT_SAVINGS_PER_MONTH, i+1, totalSavingPerMonth[i]);
    }
    //fungsi untuk mendapatkan output hasil akhir
    public static void getOutputResult(int savingPeriods, int totalMember, int totalSavings){
        System.out.printf(OUTPUT_TOTAL_SAVINGS, savingPeriods, totalMember, totalSavings);
    }
    //fungsi variable konstanta
    public static final Scanner INPUT = new Scanner(System.in);
    public static final int MIN_MEMBERS = 2, MAX_MEMBERS = 6, MIN_SAVING_PERIODS = 1, MAX_SAVING_PERIODS = 12,
        TOTAL_DAY_PERMONTH[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final String LESS = "kurang", EXCESS = "lebih",
        LINE = "\n=================================\n", 
        HEADER_PROGRAM = "\n\tTabungan Keluarga\n",
        TEMPLATE_TOTAL_MEMBER = "Jumlah Keluarga",
        TEMPLATE_TOTAL_SAVING_PERIODS = "Lama Tabungan", 
        INPUT_TOTAL_MEMBERS = "\nMasukkan Jumlah Keluarga : ",
        INPUT_TOTAL_SAVING_PERIODS = "\nMasukkan Lama Tabungan :",
        ERROR_INPUT_TYPE_DATA = "\nMaaf, input hanya berupa angka saja.\n",
        ERROR_INPUT_RANGE = "\nMaaf, %s tidak boleh %s dari %d. Silahkan input kembali.\n",
        OUTPUT_SAVINGS_PER_MONTH = "\nTabungan pada bulan ke - %d sebesar : %d",
        OUTPUT_TOTAL_SAVINGS = "\n\nTotal Tabungan Selama %d Bulan dengan %d anggota keluarga adalah %d" ; 
}
