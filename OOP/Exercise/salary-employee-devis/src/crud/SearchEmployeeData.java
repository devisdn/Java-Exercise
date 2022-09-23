package crud;
import java.util.*;
import models.*;
import validations.Validation;

public class SearchEmployeeData {
    public static List<Employee> getEmployeeByPlacement(String placement) {
        List<Employee> data = new ArrayList<Employee>(ReadEmployeeData.allEmployee);
        data.removeIf(Employee -> !Employee.getPlacement().toLowerCase().contains(placement.toLowerCase()));
        return data;
    }

    public static void search(){
        String search = Validation.inputLetterType("Silahkan Masukkan lokasi penempatan kerja : ");
        ReadEmployeeData.showEmployeeData(SearchEmployeeData.getEmployeeByPlacement(search));
        Validation.backToMainMenu();
    }
}
