import composites.Box;
import composites.CompositeBox;

public class DeliveryService {
    private Box box;

    public Box getBox() {
        return box;
    }

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public double calculatePrices() {
        return box.calculatePrice();
    }

}
