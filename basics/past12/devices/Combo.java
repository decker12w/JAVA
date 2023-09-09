package past12.devices;

public class Combo extends Device implements Scanner, Printer {

    public Combo(String serialNumber) {
        super(serialNumber);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public void scanf() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scanf'");
    }

    @Override
    public void processDoc(String doc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'processDoc'");
    }

}
