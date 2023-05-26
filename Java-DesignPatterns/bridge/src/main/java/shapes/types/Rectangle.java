package shapes.types;

import colors.Color;
import shapes.Shape;

/**
 * A class representing a rectangle shape.
 * Extends the abstract Shape class.
 */
public class Rectangle extends Shape {

    /**
     * Constructs a new Rectangle object with the specified color.
     *
     * @param color the color of the rectangle
     */
    public Rectangle(Color color) {
        super(color);
    }

    /**
     * Draws the rectangle.
     * Overrides the draw method in the Shape class.
     * Prints "Rectangle" and applies the color.
     */
    @Override
    public void draw() {
        System.out.println("Rectangle");
        color.paint();
    }
}
