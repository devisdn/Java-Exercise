import java.util.*;

public class Yudisium {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
        boolean isCheckingTotalCourse = true, isCheckingCreditCourse = true, isCheckingCourseScore = true, isPending = false;
		
		String name, predicate,
		predicateArray[] = {"Cumlaude", "Sangat Memuaskan", "Memuaskan", "pending"},
		courseName[], alphabeticCourseScore[], temp, resultOutput = "",
		headerProgram = "Selamat Datang di Simulasi Perhitungan Yudisium.",
		inputName = "\nSilahkan Masukkan name Anda :",
		inputTotalCourse = "\nSilahkan masukan Berapa Jumlah Mata Mata Kuliah :",
		inputCourseName = "\nSilahkan masukan name Mata Kuliah ke-%s :\n",
		inputCredits = "\nSilahkan masukan Jumlah SKS untuk Mata Kuliah %s :\n",
		inputScore = "\nSilahkan masukan Nilai Untuk Mata Kuliah %s (A/B/C/D/E) :\n",
        templateTotalCourse = "Jumlah Mata Kuliah",
		templateTotalCredits = "Jumlah SKS",
		templateResult = "Hasil Perhitungan Yudisium a.n %s Adalah \"%s\" dengan Rincian Sebagai Berikut :\n",
		errorIntOnly = "Maaf, %s hanya bisa dimasukkan angka saja.\n",
		errorLessThanRange = "Maaf, %s tidak boleh kurang dari %s.\n",
		errorOutOfRange = "Maaf, %s tidak boleh lebih dari %s.\n",
		errorScore = "Maaf, Nilai Mata Kuliah tidak boleh selain A, B, C, D, dan E.",
		outputTotal = "- Total Mata Kuliah adalah %s, Yaitu:\n",
		outputTotalCredits = "- Total SKS adalah %s.\n",
		outputList = "%s. %s (%s)\n",
		outputGPA = "- IPK yang didapat adalah %s";
		
        int totalCourse = 0, minCourse = 2, maxCourse = 12, minCredits = 2, maxCredits = 6, totalCredits = 0, creditCourse[];
		
        float courseScore[], score[] = {4, 3, 2, 1, 0}, gpaArray[] = {3.5f, 2.75f, 2f}, totalScore = 0, gpa;

		System.out.println(headerProgram);

			System.out.println(inputName);
			name = input.nextLine();

		//Determine total course
			do {
				System.out.println(inputTotalCourse);
				temp = input.next();
                //validation input total course
				if (!temp.matches("[0-9]+")) {
					System.out.printf(errorIntOnly, templateTotalCourse);
				} else {
					totalCourse = Integer.parseInt(temp);
					if (totalCourse < minCourse) {
						System.out.printf(errorLessThanRange, templateTotalCourse, minCourse);
					} else if (totalCourse > maxCourse) {
						System.out.printf(errorOutOfRange, templateTotalCourse, minCourse);
					} else {
						isCheckingTotalCourse = false;
					}
				}
			} while (isCheckingTotalCourse);

			courseName = new String[totalCourse];
			alphabeticCourseScore = new String[totalCourse];
			creditCourse = new int[totalCourse];
			courseScore = new float[totalCourse];

			for (int i = 0; i < totalCourse; i++) {

				System.out.printf(inputCourseName, (i+1));
				input.nextLine();
				courseName[i] = input.nextLine();

				do {
					System.out.printf(inputCredits, courseName[i]);
					temp = input.next();
					if (!temp.matches("[0-9]+")) {
						System.out.printf(errorIntOnly, templateTotalCredits);
					} else {
						creditCourse[i] = Integer.parseInt(temp);
						if (creditCourse[i] < minCredits) {
							System.out.printf(errorLessThanRange, templateTotalCredits, minCredits);
						} else if (creditCourse[i] > maxCredits) {
							System.out.printf(errorOutOfRange, templateTotalCredits, maxCredits);
						} else {
							isCheckingCreditCourse = false;
						}
					}
				} while (isCheckingCreditCourse);

				do {
					System.out.printf(inputScore, courseName[i]);
				    alphabeticCourseScore[i] = input.next();
					if (!(alphabeticCourseScore[i].equalsIgnoreCase("A") 
                    || alphabeticCourseScore[i].equalsIgnoreCase("B") 
                    || alphabeticCourseScore[i].equalsIgnoreCase("C") 
                    || alphabeticCourseScore[i].equalsIgnoreCase("D") 
                    || alphabeticCourseScore[i].equalsIgnoreCase("E"))) {
						
                        System.out.println(errorScore);

					} else {
						isCheckingCourseScore = false;
					}
				} while (isCheckingCourseScore);

				switch (alphabeticCourseScore[i].toUpperCase()) {
					case "A":
						courseScore[i] = score[0];
						break;
					case "B":
						courseScore[i] = score[1];
						break;
					case "C":
						courseScore[i] = score[2];
						break;
					case "D":
						courseScore[i] = score[3];
						break;
					default:
						courseScore[i] = score[4];
						break;
				}
			}

				for (int creditPerCourse : creditCourse) {
					totalCredits += creditPerCourse;
                }

				for (int j = 0; j < totalCourse; j++) {
					totalScore += (courseScore[j] * creditCourse[j]);
				}

				gpa = totalScore / totalCredits;
	
				for (String nilaiKata : alphabeticCourseScore) {
					if (nilaiKata.equalsIgnoreCase("E")) {
						isPending = true;
					}
				}
				if (isPending || gpa < gpaArray[2]) {
					predicate = predicateArray[3];
				} else if (gpa >= gpaArray[2] && gpa < gpaArray[1]) {
					predicate = predicateArray[2];
				} else if (gpa >= gpaArray[1] && gpa < gpaArray[0]) {
					predicate = predicateArray[1];
				} else {
					predicate = predicateArray[0];
				}

		System.out.printf(templateResult, name, predicate);
		System.out.printf(outputTotal, totalCourse);
		for (int l = 0; l < totalCourse; l++) {
			resultOutput += String.format(outputList, l, courseName[l], alphabeticCourseScore[l]);
		}
		System.out.println(resultOutput);
		System.out.printf(outputTotalCredits, totalCredits);
		System.out.printf(outputGPA, gpa);
	}
}