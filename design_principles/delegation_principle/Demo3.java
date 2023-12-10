package design_principles.delegation_principle;

public class Demo3 {
    public static void main(String[] args) {
        Employee employee = new Employee(new FastCoder(), new GoodDesigner());
        employee.code();
        employee.design();
    }
}

interface WhoCanCode {
    void code();
}

interface WhoCanDesign {
    void design();
}

class Employee implements WhoCanCode, WhoCanDesign {
    private WhoCanCode coder;
    private WhoCanDesign designer;

    Employee(WhoCanCode coder, WhoCanDesign designer) {
        this.coder = coder;
        this.designer = designer;
    }

    @Override
    public void design() {
        designer.design();
    }

    @Override
    public void code() {
        coder.code();
    }

}

class FastCoder implements WhoCanCode {

    @Override
    public void code() {
        System.out.println("Coded by FastCoder");
    }

}

class GoodDesigner implements WhoCanDesign {

    @Override
    public void design() {
        System.out.println("Designed by GoodDesigner");
    }

}