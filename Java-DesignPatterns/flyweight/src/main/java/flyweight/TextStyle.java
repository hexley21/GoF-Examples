package flyweight;

/**
 * Concrete Flyweight
 */
public class TextStyle {
    private final String name;
    private final String color;
    private final int size;

    public TextStyle(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void applyText(String text) {
        System.out.println("Applying text style: " + name +
                ", Color: " + color + ", Size: " + size + ", Text: " + text);
    }
}
