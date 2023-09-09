package past11.entities;

import past7.entities.enums.Color;

public abstract class AbstractShape implements Shape {
    private Color color;

    public AbstractShape() {
    }

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
