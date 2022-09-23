package models;
import interfaces.Salary;

public class Employee extends Person implements Salary{
    private String employeeId, JobDesc, placement;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String address, int age, String employeeId, String jobDesc, String placement) {
        super(name, address, age);
        this.employeeId = employeeId;
        JobDesc = jobDesc;
        this.placement = placement;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        // TODO Auto-generated method stub
        setSalary(getUmk() * EMPLOYEE_SALARY_PERCENT);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobDesc() {
        return JobDesc;
    }

    public void setJobDesc(String jobDesc) {
        JobDesc = jobDesc;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
        calculateSalary();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getUmk(){
        double umk = PLACEMENT_UMK.get(this.placement.toUpperCase());
        return umk;
    }
}