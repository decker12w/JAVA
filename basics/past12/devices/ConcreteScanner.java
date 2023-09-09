package past12.devices;

public class ConcreteScanner extends Device implements Scanner {

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scan");
    }

    public void scanf() {
        System.out.println("Scan");
    }
}
