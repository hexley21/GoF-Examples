package types.products;

import types.Product;

/**
 * Represents a video game product that can be placed in a box. Extends the {@link Product} class.
 */
public class VideoGame extends Product {
    /**
     * Constructs a video game with the specified price and name.
     *
     * @param price the price of the video game
     * @param name  the name of the video game
     */
    public VideoGame(double price, String name) {
        super(price, name);
    }
}