import java.util.Scanner;

public class AgeMessages{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);
		int umur;
		
		System.out.print("Berapa umur kamu?");
		umur = input.nextInt();
		
		System.out.println("Kamu dapat:");
		if(umur >= 18){
			System.out.println("Membuat Surat Izin Mengemudi(SIM).");
		}	
		if (umur >= 17){
			System.out.println("Mendapatkan Kartu Tanda Penduduk(KTP)");
		}
		if (umur > 25){
			System.out.println("Menikah diusia ideal.");
		}
	}
}