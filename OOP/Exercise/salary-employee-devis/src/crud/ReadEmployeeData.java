package crud;

import models.Employee;
import java.util.*;
import models.*;
import currency.FormatCurrency;
import repositories.EmployeeRepository;

public class ReadEmployeeData {
    public static List<Employee> allEmployee = EmployeeRepository.getAllEmployee();

    public static int getDataById(String updateData){
        List<String> data = new ArrayList<String>();
        for (Employee employee : allEmployee){
            data.add(employee.getEmployeeId());
        }
        int index = data.indexOf(updateData);
        return index;
    }

    public static void showEmployeeData(List<Employee> allEmployee){
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-3s | %-12s | %-57s | %-15s | %-25s | %-25s | %-25s |%n", "No.", "Employee ID", "Name", "Placement", "Job Desc", "Salary", "Allowance");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
        
        for (int i = 0; i < allEmployee.size(); i++) {
            Employee employee = allEmployee.get(i);
            if ( !( employee instanceof Programmer || employee instanceof ProjectLeader || employee instanceof Analyst)) {
                System.out.format("| %-3s | %-12s | %-57s | %-15s | %-25s | %-25s | %-25s |%n", (i+1), employee.getEmployeeId(), employee.getName(), employee.getPlacement(), employee.getJobDesc(), FormatCurrency.indonesiaCurrency(employee.getSalary()), FormatCurrency.indonesiaCurrency(0.0));
            }else{
                if (employee instanceof Programmer){
                    System.out.format("| %-3s | %-12s | %-57s | %-15s | %-25s | %-25s | %-25s |%n", (i+1), employee.getEmployeeId(), employee.getName(), employee.getPlacement(), employee.getJobDesc(), FormatCurrency.indonesiaCurrency(employee.getSalary()), FormatCurrency.indonesiaCurrency(((Programmer)employee).getAllowance()));
                }else if (employee instanceof ProjectLeader){
                    System.out.format("| %-3s | %-12s | %-57s | %-15s | %-25s | %-25s | %-25s |%n", (i+1), employee.getEmployeeId(), employee.getName(), employee.getPlacement(), employee.getJobDesc(), FormatCurrency.indonesiaCurrency(employee.getSalary()), FormatCurrency.indonesiaCurrency(((ProjectLeader)employee).getAllowance()));
                }else if (employee instanceof Analyst){
                    System.out.format("| %-3s | %-12s | %-57s | %-15s | %-25s | %-25s | %-25s |%n", (i+1), employee.getEmployeeId(), employee.getName(), employee.getPlacement(), employee.getJobDesc(), FormatCurrency.indonesiaCurrency(employee.getSalary()), FormatCurrency.indonesiaCurrency(((Analyst)employee).getAllowance()));
                }
            }
        }
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-3s | %-174s |%n", "0.", "Back to Menu");
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
    }
}