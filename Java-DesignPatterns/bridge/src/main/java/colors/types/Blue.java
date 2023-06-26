package colors.types;

import colors.Color;

/**
 * A class representing the color blue.
 * Implements the Color interface.
 */
public class Blue implements Color {
    /**
     * Applies the blue color.
     * Overrides the paint method in the Color interface.
     * Prints the color code "#0000FF".
     */
    @Override
    public void paint() {
        System.out.println("#0000FF");
    }
}
