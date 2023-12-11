package design_principles.single_responsibility_principle.demo2.solution;

import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        
    }
}

class Employee {
    private String employeeId;
    private String name;
    private String address;
    private Date dateOfJoining;

    // getters / setters for all member variables
}

class HRPromotions {
    public boolean isPromotionDueThisYear(Employee employee) {
        // promotion logic
        return true;
    }
}

class Finance {
    public double calcIncomeTaxForCurrentYear(Employee employee) {
        // income tax logic
        return 1;
    }
}
