package past7.entities;

import past7.entities.enums.Color;

public class Circle extends Shape {
    private Double radius;
    private static final Double PI = Math.PI;

    public Circle() {
    }

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
