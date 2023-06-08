package types;

import composites.Box;

/**
 * Represents a product that can be placed in a box. Implements the {@link Box} interface and provides the functionality
 * to calculate its own price.
 */
public abstract class Product implements Box {
    protected final double price;
    protected final String name;

    /**
     * Retrieves the price of the product.
     *
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Calculates the price of the product.
     *
     * @return the price of the product
     */
    @Override
    public double calculatePrice() {
        return getPrice();
    }

    /**
     * Constructs a product with the specified price and name.
     *
     * @param price the price of the product
     * @param name  the name of the product
     */
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }
}
