package repositories;
import java.util.*;
import models.*;

public class EmployeeRepository {
    public static List<Employee> getAllEmployee(){
        Employee employee1 = new Employee("Aditya Destiana", "Jl. Samarang", 24, "E001", "Admin", "Garut");
        Employee employee2 = new Employee("Dina Andaliana", "Tarogong Kaler", 22, "E002", "Akuntan", "Bandung");
        
        Employee programmer1 = new Programmer("Devis Destian", "Banyuresmi", 23, "P001", "Back-End Developer", "Jakarta", "Python", 6);
        Employee programmer2 = new Programmer("Indra Athalla", "Paseban", 25, "P002", "Front-End Developer", "Bogor", "JavaScirpt", 2);
        
        Employee projectLead1 = new ProjectLeader("Faksi Ahmad", "Jl. Guntur", 24, "PL01", "Project Leader Metaverse", "Bekasi", 1);
        Employee projectLead2 = new ProjectLeader("Fira Febriani", "Galumpit", 22, "PL02", "Project Leader Script.i", "Bandung", 3);
        
        Employee analyst1 = new Analyst("Hikmatul Alam", "Karangpawitan", 24, "A001","Data Analyst", "Bogor");
    
        List<Employee> allEmployee = new ArrayList<Employee>(Arrays.asList(employee1, employee2, programmer1, programmer2, projectLead1, projectLead2, analyst1));

        return allEmployee;
    }
}
