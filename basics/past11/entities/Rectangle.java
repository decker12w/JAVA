package past11.entities;

public class Rectangle extends AbstractShape {
    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double area() {
        return width * height;
    }
}
