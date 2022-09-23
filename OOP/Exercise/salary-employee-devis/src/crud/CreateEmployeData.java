package crud;

import models.Analyst;
import models.Employee;
import models.Programmer;
import models.ProjectLeader;
import validations.Validation;

public class CreateEmployeData {
    public static void add(){
        String position[] = {"Employee","Analyst","Programmer","Project Leader"}, placement[] = {"Garut", "Bandung", "Jakarta", "Bogor", "Bekasi"};

        String addPosition = Validation.inputLetterLimit("\nMasukkan posisi kerja : ", position);
        String addEmployeeId = Validation.checkInputId("\nMasukkan Id Karyawan : ");
        String addName = Validation.inputLetterType("\nMasukkan nama : ");
        String addAddress = Validation.inputLetterType("\nMasukkan alamat : ");
        Integer addAge = Validation.inputAge("\nMasukkan usia : ");
        String addJobDesc = Validation.inputLetterType("\nMasukkan Deskripsi pekerjaan : ");
        String addPlacement = Validation.inputLetterLimit("\nMasukkan lokasi penempatan kerja (Garut/Bandung/Jakarta/Bekasi/Bogor) : ", placement);

        if (addPosition.equalsIgnoreCase("Analyst")){
            Employee analyst = new Analyst(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement);
            ReadEmployeeData.allEmployee.add(analyst);

        } else if (addPosition.equalsIgnoreCase("Programmer")){
            String addProgrammingLanguage = Validation.inputLetterType("\nMasukkan bahasa pemrograman : ");
            Integer addExperience = Validation.inputNumber("\nMasukkan lama pengalaman : ");
            Employee programmer = new Programmer(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement, addProgrammingLanguage, addExperience);
            ReadEmployeeData.allEmployee.add(programmer);

        } else if (addPosition.equalsIgnoreCase("Project Leader")){
            Integer addTotalProject = Validation.inputNumber("\nMasukkan total project : ");
            Employee projectLeader = new ProjectLeader(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement, addTotalProject);
            ReadEmployeeData.allEmployee.add(projectLeader);
        
        } else {
            Employee employee = new Employee(addName, addAddress, addAge, addEmployeeId, addJobDesc, addPlacement);
            ReadEmployeeData.allEmployee.add(employee);
        }
        System.out.println("\nData berhasil ditambahkan");
        ReadEmployeeData.showEmployeeData(ReadEmployeeData.allEmployee);
    }
}
