package crud;
import validations.Validation;
import views.Menu;

public class DeleteEmployeeData {
    public static void delete(){
        ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);

        String id = Validation.inputTypeId("Masukkan Id Karyawan : ");
        String confirm = Validation.inputLetterYesNo("Simpan perubahan (ya/tidak)? ");
        if (confirm.equalsIgnoreCase("ya")){
            ReadEmployeeData.allEmployee.removeIf(s -> s.getEmployeeId().equalsIgnoreCase(id));
            System.out.println("Data berhasil dihapus!");
            ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);
        }else{
            Menu.mainMenu();
        }

        Validation.backToMainMenu();
    }
}
