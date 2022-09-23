package crud;

import models.Analyst;
import models.Employee;
import models.Programmer;
import models.ProjectLeader;
import validations.Validation;

public class CreateEmployeData {
    public static void add(){
        ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);

        String position[] = {"Employee","Analyst","Programmer","Project Leader"}, placement[] = {"Garut", "Bandung", "Jakarta", "Bogor", "Bekasi"};
        String addPosition = Validation.inputLetterLimit("Masukkan posisi kerja : ", position);
        String addEmployeeId = Validation.checkInputId("Masukkan Id Karyawan : ");
        String addName = Validation.inputLetterType("Masukkan nama : ");
        String addAddress = Validation.inputLetterType("Masukkan alamat : ");
        Integer addAge = Validation.inputNoUnderage("Masukkan usia : ");
        String addJobDesc = Validation.inputLetterType("Masukkan Deskripsi pekerjaan : ");
        String addPlacement = Validation.inputLetterLimit("Masukkan lokasi penempatan kerja (Garut/Bandung/Jakarta/Bekasi/Bogor) : ", placement);

        if (addPosition.equalsIgnoreCase("Analyst")){
            Employee analyst = new Analyst(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement);
            ReadEmployeeData.allEmployee.add(analyst);

        } else if (addPosition.equalsIgnoreCase("Programmer")){
            String addProgrammingLanguage = Validation.inputLetterType("Masukkan bahasa pemrograman : ");
            Integer addExperience = Validation.inputNumber("Masukkan lama pengalaman : ");
            Employee programmer = new Programmer(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement, addProgrammingLanguage, addExperience);
            ReadEmployeeData.allEmployee.add(programmer);

        } else if (addPosition.equalsIgnoreCase("Project Leader")){
            Integer addTotalProject = Validation.inputNumber("Masukkan total project : ");
            Employee projectLeader = new ProjectLeader(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement, addTotalProject);
            ReadEmployeeData.allEmployee.add(projectLeader);
        
        } else {
            Employee employee = new Employee(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement);
            ReadEmployeeData.allEmployee.add(employee);
        }
        System.out.println("Data berhasil ditambahkan");
        ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);
        
        Validation.backToMainMenu();
    }
}
