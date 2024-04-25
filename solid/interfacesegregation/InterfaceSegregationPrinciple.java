package solid.interfacesegregation;


// Interface representing the functionality related to printing
interface Printer {
    void print();
}

// Interface representing the functionality related to scanning
interface Scanner {
    void scan();
}

// Interface representing the functionality related to faxing
interface Fax {
    void fax();
}

// Class implementing only printing functionality
class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

// Class implementing only scanning functionality
class SimpleScanner implements Scanner {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

// Class implementing only faxing functionality
class SimpleFax implements Fax {
    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}

// Class implementing functionalities of both printing and scanning
class Photocopier implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        // Using SimplePrinter
        Printer printer = new SimplePrinter();
        printer.print();

        // Using SimpleScanner
        Scanner scanner = new SimpleScanner();
        scanner.scan();

        // Using Photocopier
        Printer photocopierPrinter = new Photocopier();
        Scanner photocopierScanner = new Photocopier();
        photocopierPrinter.print();
        photocopierScanner.scan();
    }
}

