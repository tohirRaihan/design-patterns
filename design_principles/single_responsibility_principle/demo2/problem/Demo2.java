package design_principles.single_responsibility_principle.demo2.problem;

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

    public boolean isPromotionDueThisYear() {
        // promotion logic
        return true;
    }

    public double calcIncomeTaxForCurrentYear() {
        // income tax logic
        return 1;
    }

    // getters / setters for all member variables
}
