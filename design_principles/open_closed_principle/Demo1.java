package design_principles.open_closed_principle;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Calculator obj = new Calculator();

        Addition add = new Addition(10, 5);
        obj.calculate(add);

        System.out.println("result: " + add.result);

        Substraction subs = new Substraction(10, 5);
        obj.calculate(subs);
        System.out.println("result: " + subs.result);
    }
}

interface Operation {
    void perform();
}

class Addition implements Operation {
    public double a;
    public double b;
    public double result = 0.0;

    public Addition(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void perform() {
        this.result = this.a + this.b;
    }

}

class Substraction implements Operation {
    public double a;
    public double b;
    public double result = 0.0;

    public Substraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void perform() {
        this.result = this.a - this.b;
    }
}

class Calculator {

    public void calculate(Operation operation) throws Exception {

        if (operation == null) {
            throw new Exception("Can not perform operation");
        }

        operation.perform();
    }

}
