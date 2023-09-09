package past11.entities;

public class Circle extends AbstractShape {
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
