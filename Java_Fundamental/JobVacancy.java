import java.util.Scanner;

public class JobVacancy{
    public static void main(String[]args){
		//deklarasi variable
        int umur,pengalaman;
        double penampilan;
        String lulusan,nama,jenisKelamin;
        boolean reqKoorl,reqKoor2,reqAdmin1,reqAdmin2;
        boolean isPassingKoor,isPassingAdmin;
		
        Scanner input=new Scanner(System.in);
		
		System.out.println("Selamat datang di PT.Secret Semut 79");
        System.out.println("====================================");
		System.out.println("Silahkan input Data Anda");
		
		System.out.print("\nNama : ");
		nama = input.next();

		System.out.print("\nUmur : ");
		umur = input.nextInt();

		System.out.print("\nJenis Kelamin(Pria/Wanita): ");
		jenisKelamin = input.next();

		System.out.print("\nLulusan(SMK/D3/S1) : ");
		lulusan = input.next();

		System.out.print("\nPengalaman (tahun) : ");
		pengalaman = input.nextInt();
		
		System.out.print("\nPenampilan (1-10) : ");
		penampilan = input.nextDouble();
		
		//persyaratan koor1
		reqKoorl = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3"))&& pengalaman >= 2;
		
		//persyaratan koor2
		reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;
		
		//hasil koor
		isPassingKoor = reqKoorl || reqKoor2;
		
		//persyaratan admin 1
		reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur<=25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);

		//persyaratan Admin2
		reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;
		
		//hasil admin
		isPassingAdmin = reqAdmin1 || reqAdmin2;
		
		System.out.println(nama + ", Terima kasih sudah mengikuti Lowongan Kerja di PT.Secret Semut 79.\n");
		System.out.println("Berikut adalah hasil dari Rekrutment untuk Koordinator dan Admin:");
		System.out.println("Hasil Kelulusan untuk Koordinator : " + isPassingKoor);
		System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);
	}
	
}