package crud;

import validations.Validation;
import views.Menu;

public class UpdateEmployeeData {
    public static void update(){
        String placement[] = {"Garut", "Bandung", "Jakarta", "Bogor", "Bekasi"};
        ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);

        String id = Validation.inputTypeId("\nMasukkan Id Karyawan : ");
        String newPlacement = Validation.inputLetterLimit("\nMasukan Lokasi penempatan kerja baru, Garut/Bandung/Jakarta/Bekasi/Bogor : ", placement);
        String confirm = Validation.inputLetterYesNo("\nSimpan perubahan (ya/tidak)? ");
        if (confirm.equalsIgnoreCase("ya")){
            ReadEmployeeData.allEmployee.get(ReadEmployeeData.getDataById(id)).setPlacement(newPlacement);
            System.out.println("\nData berhasil diupdate!");
            ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);
        }else{
            Menu.mainMenu();
        }
        
        Validation.backToMainMenu();
    }    
}
