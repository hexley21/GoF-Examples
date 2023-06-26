import colors.Color;
import colors.types.Blue;
import colors.types.Red;
import shapes.Shape;
import shapes.types.Circle;
import shapes.types.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Creating different shapes with different colors
        Color redColor = new Red();
        Color blueColor = new Blue();

        Shape redRectangle = new Rectangle(redColor);
        Shape blueRectangle = new Rectangle(blueColor);
        Shape redCircle = new Circle(redColor);
        Shape blueCircle = new Circle(blueColor);

        // Drawing the shapes
        redRectangle.draw();    // Output: Rectangle painted with color #FF0000
        System.out.println();
        blueRectangle.draw();   // Output: Rectangle painted with color #0000FF
        System.out.println();
        redCircle.draw();       // Output: Circle painted with color #FF0000
        System.out.println();
        blueCircle.draw();      // Output: Circle painted with color #0000FF
    }
}