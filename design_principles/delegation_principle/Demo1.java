package design_principles.delegation_principle;

public class Demo1 {
    // To the outside world it looks like Printer is actually prints
    public static void main(String[] args) {
        Printer1 p = new Printer1();
        p.print();
    }
}

// The Delegate
class RealPrinter {

    void print() {
        System.out.println("The Delegate");
    }

}

// The Delegator
class Printer1 {
    RealPrinter p = new RealPrinter();

    // create the delegate
    void print() {
        p.print(); // delegation
    }

}
