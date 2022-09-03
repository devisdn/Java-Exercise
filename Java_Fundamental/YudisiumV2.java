import java.util.*;

public class YudisiumV2 {
    //MAIN METHOD
    public static void main(String[] args){
        float totalScore = 0, gpa;
        int i, totalCourse, totalCredits = 0;
        String predicate = "", name = "";
        
        getHeader();
        //nama
        getName(name);
        //total mata kuliah
        totalCourse = getTotalCourse();
        //
        String[] courseName = new String[totalCourse], alphabeticCourseScore = new String[totalCourse];
        int[] creditCourse = new int[totalCourse];
        float[] courseScore = new float[totalCourse];

        //pengulangan output sesuai dengan jumlah mata kuliah
        for(i = 0; i < totalCourse; i++){
            getCourseName(courseName, i); //nama mata kuliah
            
            creditCourse = getCreditPerCourse(creditCourse, courseName, i); //jumlah sks per mata kuliah
            
            alphabeticCourseScore = getScore(i, courseName, alphabeticCourseScore); //nilai alphabetic
            
            courseScore[i] = convertScoreToValue(alphabeticCourseScore[i]); //konversi nilai alphabetic menjadi nilai angka
            
            totalScore += courseScore[i] * creditCourse[i]; //total nilai keseluruhan
        }

        totalCredits = getTotalCredit(creditCourse); //total sks keseluruhan
        gpa = getGPA(totalScore, totalCredits); //gpa
        predicate = getPredicate(gpa, predicate, courseScore, totalCourse);//predikat
        getOutputResult(i, name, courseName, alphabeticCourseScore, predicate, totalCredits, gpa);
    }

    //fungsi untuk mendapatkan total sks per mata kuliah
    public static int[] getCreditPerCourse(int creditCourse[], String courseName[],int i){
        String inputTemp = "";
        boolean repeat = true;
        
        do {
            System.out.printf(INPUT_TOTAL_CREDITS, courseName[i]);
            inputTemp = INPUT.next();
            if (!inputTemp.matches("[0-9]+")) {
                System.out.printf(ERORR_TYPE_DATA, TEMPLATE_TOTAL_CREDIT);
            } else {
                creditCourse[i] = Integer.parseInt(inputTemp);
                if (creditCourse[i] < MIN_CREDITS) {
                    System.out.printf(ERROR_INPUT_VALIDATION, TEMPLATE_TOTAL_CREDIT, LESS, MIN_CREDITS);
                } else if (creditCourse[i] > MAX_CREDITS) {
                    System.out.printf(ERROR_INPUT_VALIDATION, TEMPLATE_TOTAL_CREDIT, OVER, MAX_CREDITS);
                } else {
                    repeat = false;
                }
            }
        } while (repeat);
        return creditCourse;
    }
    //fungsi untuk mendapatkan nama mata kuliah
    public static void getCourseName(String courseName[], int i){
        System.out.printf(INPUT_COURSE_NAME, (i+1));
        INPUT.nextLine();
        courseName[i] = INPUT.nextLine();
    }
    //fungsi untuk output header program
    public static void getHeader(){
        System.out.println(LINE + HEADER_PROGRAM + LINE);
    }
    //fungsi untuk mendapatkan nama
    public static void getName(String name){
        System.out.print(INPUT_NAME);
        name = INPUT.nextLine();
    }
    //fungsi untuk mendapatkan total mata kuliah
    public static int getTotalCourse(){
        boolean repeat = true;
        String inputTemp = "";
        int totalCourse = 0;
        do{
            System.out.print(INPUT_TOTAL_COURSE);
            inputTemp = INPUT.next();
            if(!inputTemp.matches("[0-9]+")){ 
                System.out.printf(ERORR_TYPE_DATA, TEMPLATE_TOTAL_COURSE);
            }else{
                totalCourse = Integer.parseInt(inputTemp);
                if(totalCourse > YudisiumV2.MAX_COURSE){
                    System.out.printf(ERROR_INPUT_VALIDATION, TEMPLATE_TOTAL_COURSE, OVER, MAX_CREDITS);
                }else if(totalCourse < YudisiumV2.MIN_COURSE){
                    System.out.printf(ERROR_INPUT_VALIDATION, TEMPLATE_TOTAL_COURSE, LESS, MIN_COURSE);
                }else{
                    repeat = false;
                }
            }
        }while(repeat);
        return totalCourse;
    }
    //fungsi untuk mendapatkan nilai
    public static String[] getScore(int i, String courseName[], String alphabeticCourseScore[]) {
		boolean repeat = true;
        do{
			System.out.printf(INPUT_COURSE_SCORE, courseName[i]);
		    alphabeticCourseScore[i] = INPUT.next();
            if (	!(
						alphabeticCourseScore[i].equalsIgnoreCase("A") ||
						alphabeticCourseScore[i].equalsIgnoreCase("B") ||
						alphabeticCourseScore[i].equalsIgnoreCase("C") ||
						alphabeticCourseScore[i].equalsIgnoreCase("D") ||
						alphabeticCourseScore[i].equalsIgnoreCase("E")
						)
				) {
				System.out.println(ERROR_INPUT_SCORE);
			} else {
				repeat = false;
			}
		}while(repeat);
		return alphabeticCourseScore;
	}
    //fungsi untuk konversi nilai alphabet ke nilai angka
    public static float convertScoreToValue(String score) {
        switch (score.toUpperCase()) {
			case "A":
				return SCORE_ARRAY[0];
			case "B":
				return SCORE_ARRAY[1];
			case "C":
				return SCORE_ARRAY[2];
			case "D":
				return SCORE_ARRAY[3];
			default:
				return SCORE_ARRAY[4];
		}
	}
    //fungsi untuk mendapatkan total sks keseluruhan
    public static int getTotalCredit(int creditCourse[]) {
		int total = 0;
		for (int each : creditCourse) {
			total += each;
		}
		return total;
	}
    //fungsi untuk mendapatkan ipk
	public static float getGPA(float totalScore, int totalCredits) {
		return totalScore / totalCredits;
	}
    //fungsi untuk mendapatkan predikat
	public static String getPredicate(float gpa, String predicate, float[] courseScore, int totalCourse){
		if (gpa < 2) {			
			predicate = "Pending";
		} else if (gpa >= 2 && gpa < 2.75) {			
			predicate = "Memuaskan";
		} else if (gpa >= 2.75 && gpa < 3.5) {			
			predicate = "Sangat Memuaskan";
		} else {			
			predicate = "Cumlaude";
		}
		for (int i=0; i < totalCourse; i++) {
			if (courseScore[i] == 0) {
				predicate = "Pending";
				i = totalCourse;
			}
		} 
		return predicate;
	}
    //fungsi untuk mendapatkan output hasil akhir
    public static void getOutputResult(int i, String name, String[] courseName, String[] alphabeticScore, String predicate, int totalCredits, float gpa) {
        System.out.printf(YudisiumV2.OUTPUT_RESULTS, name, predicate);
        System.out.printf(YudisiumV2.OUTPUT_TOTAL_COURSE, courseName.length);
        for (int l = 0; l < courseName.length; l++) {
            System.out.printf(YudisiumV2.OUTPUT_COURSE_LIST, l+1, courseName[l], alphabeticScore[l].toUpperCase() );
        }
        System.out.printf(YudisiumV2.OUTPUT_TOTAL_CREDITS, totalCredits);
        System.out.printf(YudisiumV2.OUTPUT_FINAL_GPA, gpa);
	}
    //fungsi untuk inisialisasi variabel bersifat final
    public static final String  OVER = "lebih", LESS = "kurang",
        LINE = "\n================================================\n",
        HEADER_PROGRAM = "\nSelamat Datang di Simulasi Perhitungan Yudisium\n",
        INPUT_NAME = "\nSilahkan Masukkan nama Anda : ",
        INPUT_TOTAL_COURSE = "\nSilahkan masukan Berapa Jumlah Mata Kuliah : ",
        INPUT_TOTAL_CREDITS = "\nSilahkan masukan Jumlah SKS untuk Mata Kuliah %s :\n",
        INPUT_COURSE_NAME = "\nSilahkan masukan nama Mata Kuliah ke-%s :\n",
        INPUT_COURSE_SCORE = "\nSilahkan masukan Nilai Untuk Mata Kuliah %s (A/B/C/D/E) :\n",
        TEMPLATE_TOTAL_COURSE = "Jumlah Mata Kuliah",
		TEMPLATE_TOTAL_CREDIT = "Jumlah SKS",
        ERROR_INPUT_VALIDATION = "\nMaaf, %s tidak boleh %s dari %s.\n",
        ERROR_INPUT_SCORE = "Maaf, Nilai Mata Kuliah tidak boleh selain A, B, C, D, dan E.",
        ERORR_TYPE_DATA = "\nMaaf, %s hanya bisa dimasukkan angka saja.\n",
        OUTPUT_RESULTS = "\nHasil Perhitungan Yudisium a.n %s Adalah \"%s\" dengan Rincian Sebagai Berikut :\n",
		OUTPUT_TOTAL_COURSE = "- Total Mata Kuliah adalah %s, Yaitu:\n\n",
		OUTPUT_COURSE_LIST = "%s. %s (%s)\n",
		OUTPUT_TOTAL_CREDITS = "\n- Total SKS adalah %s.\n",
		OUTPUT_FINAL_GPA = "- IPK yang didapat adalah %s";
    public static final int MIN_COURSE = 2, MAX_COURSE = 12, MIN_CREDITS = 2, MAX_CREDITS = 6;
    public static final float GPA_ARRAY[] = {3.5f, 2.75f, 2f}, SCORE_ARRAY[] = {4, 3, 2, 1};
    public static Scanner INPUT = new Scanner(System.in);
}