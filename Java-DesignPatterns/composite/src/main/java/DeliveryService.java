import composites.Box;
import composites.CompositeBox;

/**
 * Represents a delivery service that manages a box of items. Provides methods to set up the delivery order,
 * calculate the total prices, and retrieve the box.
 */
public class DeliveryService {
    private Box box;

    /**
     * Retrieves the box associated with the delivery service.
     *
     * @return the box associated with the delivery service
     */
    public Box getBox() {
        return box;
    }

    /**
     * Sets up the delivery order by creating a composite box with the provided boxes.
     *
     * @param boxes the boxes to be added to the delivery order
     */
    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    /**
     * Calculates the total prices of the items in the delivery order.
     *
     * @return the total prices of the items in the delivery order
     */
    public double calculatePrices() {
        return box.calculatePrice();
    }
}
