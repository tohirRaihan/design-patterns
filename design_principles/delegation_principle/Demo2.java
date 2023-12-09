package design_principles.delegation_principle;

public class Demo2 {
    public static void main(String[] args) {
        HP hp = new HP();
        Printer2 printer = new Printer2(hp);
        printer.print();
    }
}

interface Task {
    void print();
}

// The Delegator
class Printer2 implements Task {
    Task realPrinter;

    Printer2(Task realPrinter) {
        this.realPrinter = realPrinter;
    }

    @Override
    public void print() {
        realPrinter.print(); // delegation (delegate task to the actual object)
    }

}

// The Delegate
class HP implements Task {

    @Override
    public void print() {
        System.out.println("HP Printing ...");
    }

}

// The Delegate
class Epson implements Task {

    @Override
    public void print() {
        System.out.println("Epson Printing");
    }

}