package types.products;

import types.Product;

/**
 * Represents a book product that can be placed in a box. Extends the {@link Product} class.
 */
public class Book extends Product {
    /**
     * Constructs a book with the specified price and name.
     *
     * @param price the price of the book
     * @param name  the name of the book
     */
    public Book(double price, String name) {
        super(price, name);
    }
}