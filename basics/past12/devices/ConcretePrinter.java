package past12.devices;

public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer");
    }

    public void print() {
        System.out.println("Print");
    }
}
