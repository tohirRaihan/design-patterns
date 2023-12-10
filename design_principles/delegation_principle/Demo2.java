package design_principles.delegation_principle;

public class Demo2 {
    public static void main(String[] args) {
        PrinterController hpPrinterController = new PrinterController(new HpPrinter());
        PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print();
        canonPrinterController.print();
        epsonPrinterController.print();
    }
}

interface Printer {
    void print();
}

// The Delegator
class PrinterController implements Printer {
    private final Printer printer;

    PrinterController(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print(); // delegation (delegate task to the actual object)
    }

}

// The Delegate
class CanonPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("CanonPrinter Printing ...");
    }

}

// The Delegate
class EpsonPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("EpsonPrinter Printing ...");
    }

}

// The Delegate
class HpPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("HpPrinter Printing ...");
    }

}