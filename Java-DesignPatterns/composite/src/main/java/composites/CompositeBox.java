package composites;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Box {

    private final List<Box> boxContainer;

    public CompositeBox(List<Box> boxContainer) {
        this.boxContainer = boxContainer;
    }

    public CompositeBox() {
        this.boxContainer = new ArrayList<>();
    }

    @Override
    public double calculatePrice() {
        return boxContainer.stream().mapToDouble(Box::calculatePrice).sum();
    }
}
