package past7.entities;

import past7.entities.enums.Color;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
