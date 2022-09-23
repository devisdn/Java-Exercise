package views;

//import java.util.Scanner;
import crud.*;
import validations.*;

public class Menu {
    ///private static final Scanner INPUT = new Scanner(System.in);
    public static void mainMenu(){
        //String search;
        int choice;
        System.out.format("+%-40s+%n","-----------------------------------------------");
        System.out.format("|  %-43s  |%n","Data Karyawan PT. Secret Semut 79");
        System.out.format("+%-40s+%n","-----------------------------------------------");
        System.out.format("| 1. %-42s |%n", "Daftar Data Karyawan");
        System.out.format("| 2. %-42s |%n", "Tambah Data Karyawan");
        System.out.format("| 3. %-42s |%n", "Edit Data Karyawan");
        System.out.format("| 4. %-42s |%n", "Hapus Data Karyawan");
        System.out.format("| 5. %-42s |%n", "Cari Data Karyawan Berdasarkan Placement");
        System.out.format("| 0. %-42s |%n", "Keluar");
        System.out.format("+%-35s+%n","-----------------------------------------------");
        
        choice = Validation.inputNumberLimit("Silahkan pilih menu di atas (angka saja) : ", 0, 5);
        switch (choice){
            case 1:
                ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);
                break;
            case 2:
                CreateEmployeData.add();
                break;
            case 3:
                UpdateEmployeeData.update();
                break;
            case 4:
                DeleteEmployeeData.delete();
                break;
            case 5:
                SearchEmployeeData.search();
                break;
            default:
                break;
        }        
    }
}
