import java.util.Scanner;

public class PassingGrade79{
	public static void main( String[] args ){
		//inisialisasi variabel
		Scanner input = new Scanner(System.in);
		
		int matematika, bhsInggris, bhsIndonesia, ipa;
		int passingGradeSMK, passingGradeSastra, passingGradeTKJ;
		boolean isPassingSMK, isPassingSastra, isPassingTKJ;
		double averageUjian, averageBahasa;
		
		//inisialisasi value syarat kelulusan
		passingGradeSMK = 73;
		passingGradeSastra = 75;
		passingGradeTKJ = 80;
		
		System.out.print("Masukkan nilai Ujian Matematika : ");
		matematika = input.nextInt();

		System.out.print("\nMasukkan nilai Ujian Bhs.Indonesia : ");
		bhsIndonesia = input.nextInt();

		System.out.print("\nMasukkan nilai Ujian Bhs.Inggris : ");
		bhsInggris = input.nextInt();

		System.out.print("\nMasukkan nilai Ujian IPA : ");
		ipa = input.nextInt();
		
		//menghitung average
		averageUjian = (matematika + bhsIndonesia + bhsInggris + ipa)/4;
		averageBahasa = (bhsIndonesia + bhsInggris)/2;
		
		//menentukan kelulusan
		isPassingSMK = averageUjian >= passingGradeSMK;
		isPassingSastra = averageBahasa >= passingGradeSastra;
		isPassingTKJ = matematika > passingGradeTKJ;
		
		System.out.println("\n\nHasil dari Simulasi untuk Persyaratan Calon Siswa di SMK Padepokan 79");
		System.out.println("==========================================================================");
		System.out.println("\nApakah anda memenuhi syarat untuk masuk ke SMK Padepokan 79 : " + isPassingSMK);
		System.out.println("\nApakah anda memenuhi syarat untuk masuk ke jurusan sastra : " + isPassingSastra);
		System.out.println("\nApakah anda memenuhi syarat untuk masuk ke jurusan TIK : " + isPassingTKJ);
	}
}