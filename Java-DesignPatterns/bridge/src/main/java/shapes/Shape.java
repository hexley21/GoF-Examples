package shapes;

import colors.Color;

/**
 * The abstract base class for shapes.
 */
public abstract class Shape {

    /**
     * The color of the shape.
     */
    protected Color color;

    /**
     * Constructs a new Shape object with the specified color.
     *
     * @param color the color of the shape
     */
    public Shape(Color color) {
        this.color = color;
    }

    /**
     * Draws the shape.
     * Subclasses must provide their own implementation.
     */
    public abstract void draw();

}
