package colors.types;

import colors.Color;

/**
 * A class representing the color red.
 * Implements the Color interface.
 */
public class Red implements Color {
    /**
     * Applies the red color.
     * Overrides the paint method in the Color interface.
     * Prints the color code "#FF0000".
     */
    @Override
    public void paint() {
        System.out.println("#FF0000");
    }
}
