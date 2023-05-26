package shapes.types;

import colors.Color;
import shapes.Shape;

/**
 * A class representing a circle shape.
 * Extends the abstract Shape class.
 */
public class Circle extends Shape {

    /**
     * Constructs a new Circle object with the specified color.
     *
     * @param color the color of the circle
     */
    public Circle(Color color) {
        super(color);
    }

    /**
     * Draws the circle.
     * Overrides the draw method in the Shape class.
     * Prints "Circle" and applies the color.
     */
    @Override
    public void draw() {
        System.out.println("Circle");
        color.paint();
    }
}