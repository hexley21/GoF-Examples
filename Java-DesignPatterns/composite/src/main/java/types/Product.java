package types;

import composites.Box;

public abstract class Product implements Box {

    protected final double price;
    protected final String name;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    public Product(double price, String name) {
        super();
        this.price = price;
        this.name = name;
    }
}
