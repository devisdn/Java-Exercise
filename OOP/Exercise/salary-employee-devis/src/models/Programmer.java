package models;
import interfaces.Allowance;

public class Programmer extends Employee implements Allowance {
    private String programmingLanguage;
    private int experience;
    private double allowance;

    public Programmer() {
        super();
    }

    public Programmer(String name, String address, int age, String employeeId, String jobDesc, String placement,
            String programmingLanguage, int experience) {
        super(name, address, age, employeeId, jobDesc, placement);
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
        calculateSalary();
        calculateAllowance();
    }

    @Override
    public void setSalary(double salary) {
        // TODO Auto-generated method stub
        super.setSalary(salary);
        calculateAllowance();
    }

    @Override
    public void calculateSalary() {
        // TODO Auto-generated method stub
        setSalary(getUmk() * PROGRAMMER_SALARY_PERCENT);
    }

    @Override
    public void calculateAllowance() {
        // TODO Auto-generated method stub
        double allowance = this.experience >= 5 ? getSalary() * SENIOR_PROGRAMMER_ALLOWANCE_PERCENT : getSalary() * JUNIOR_PROGRAMMER_ALLOWANCE_PERCENT;
        setAllowance(allowance);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
        calculateAllowance();
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
}