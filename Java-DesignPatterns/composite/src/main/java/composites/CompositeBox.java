package composites;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a composite box that can contain other boxes or products. Implements the {@link Box} interface and provides
 * functionality to calculate the total price by summing the prices of all items in the box.
 */
public class CompositeBox implements Box {
    private final List<Box> boxContainer;

    /**
     * Constructs a composite box with the provided list of boxes as its contents.
     *
     * @param boxContainer the list of boxes contained within the composite box
     */
    public CompositeBox(List<Box> boxContainer) {
        this.boxContainer = boxContainer;
    }

    /**
     * Constructs a composite box with the provided array of boxes as its contents.
     *
     * @param boxes the array of boxes contained within the composite box
     */
    public CompositeBox(Box... boxes) {
        this.boxContainer = Arrays.asList(boxes);
    }

    /**
     * Constructs an empty composite box.
     */
    public CompositeBox() {
        this.boxContainer = new ArrayList<>();
    }

    /**
     * Calculates the total price of the composite box by summing the prices of all items in the box.
     *
     * @return the total price of the composite box
     */
    @Override
    public double calculatePrice() {
        return boxContainer.stream().mapToDouble(Box::calculatePrice).sum();
    }
}
