package models;
import interfaces.Allowance;

public class ProjectLeader extends Employee implements Allowance{
    private int totalProject;
    private double allowance;
    
    public ProjectLeader() {
        super();
    }

    public ProjectLeader(String name, String address, int age, String employeeId, String jobDesc, String placement,
            int totalProject) {
        super(name, address, age, employeeId, jobDesc, placement);
        this.totalProject = totalProject;
        calculateSalary();
        calculateAllowance();
    }

    @Override
    public void calculateSalary() {
        // TODO Auto-generated method stub
        setSalary(getUmk() * PROJECT_LEADER_SALARY_PERCENT);
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
        double allowance = this.totalProject >= 2 ? getSalary() * SENIOR_PROJECTLEAD_ALLOWANCE_PERCENT : getSalary() * JUNIOR_PROJECTLEAD_ALLOWANCE_PERCENT;
        setAllowance(allowance);
    }

    public int getTotalProject() {
        return totalProject;
    }

    public void setTotalProject(int totalProject) {
        this.totalProject = totalProject;
        calculateAllowance();
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
}