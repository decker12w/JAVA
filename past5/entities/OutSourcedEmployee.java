package past5.entities;

public class OutSourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutSourcedEmployee() {
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super();
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}