package interfaces;
import java.util.*;

public interface Salary {
    double EMPLOYEE_SALARY_PERCENT = 1, PROGRAMMER_SALARY_PERCENT = 1.5,
    PROJECT_LEADER_SALARY_PERCENT = 2, ANALYST_SALARY_PERCENT = 1.6;

    Map<String, Double> PLACEMENT_UMK = new HashMap<String, Double>(){{
        put("GARUT", 1961085.0);
        put("BANDUNG", 3742276.0);
        put("JAKARTA", 4453935.0);
        put("BEKASI", 4782935.0);
        put("BOGOR", 4330249.0);
      }};
    
    void calculateSalary();
}
