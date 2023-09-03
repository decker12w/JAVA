package entities;

public class Product {
    public double price;
    public String name;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
