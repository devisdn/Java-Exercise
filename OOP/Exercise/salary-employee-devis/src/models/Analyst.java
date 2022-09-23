package models;
import interfaces.Allowance;

public class Analyst extends Employee implements Allowance{
    private double allowance;

    public Analyst() {
        super();
    }

    public Analyst(String name, String address, int age, String employeeId, String jobDesc, String placement) {
        super(name, address, age, employeeId, jobDesc, placement);
        calculateSalary();
        calculateAllowance();
    }

    @Override
    public void calculateSalary() {
        // TODO Auto-generated method stub
        setSalary(getUmk() * ANALYST_SALARY_PERCENT);
    }

    @Override
    public void setSalary(double salary) {
        // TODO Auto-generated method stub
        super.setSalary(salary);
        calculateAllowance();
    }

    @Override
    public void calculateAllowance() {
        // TODO Auto-generated method stub
        double allowance = getSalary() * ANALYST_ALLOWANCE_PERCENT;
        setAllowance(allowance);
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
}