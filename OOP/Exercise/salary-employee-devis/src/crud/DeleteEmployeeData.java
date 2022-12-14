package crud;
import validations.Validation;
import views.Menu;

public class DeleteEmployeeData {
    public static void delete(){
        ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);
        
        String id = Validation.inputTypeId("\nMasukkan Id Karyawan : ");
        String confirm = Validation.inputLetterYesNo("\nSimpan perubahan (ya/tidak)? ");
        if (confirm.equalsIgnoreCase("ya")){
            ReadEmployeeData.allEmployee.removeIf(s -> s.getEmployeeId().equalsIgnoreCase(id));
            System.out.println("\nData berhasil dihapus!");
            ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);
            Validation.backToMainMenu();
        }else{
            Menu.mainMenu();
        }

        
    }
}
