package ice_cream;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * A class representing an ice cream dessert, with one or more flavours and toppings, and a price.
 */
public class IceCream {

    private final ArrayList<String> flavours;
    private final ArrayList<String> toppings;
    private final int price;

    private IceCream(ArrayList<String> flavours, ArrayList<String> toppings, int price) {
        this.flavours = flavours;
        this.toppings = toppings;
        this.price = price;
    }

    /**
     * Returns a string representation of this ice cream, with its flavours, toppings, and price.
     * @return a string representation of this ice cream
     */
    @Override
    public String toString() {
        return String.format("ice cream with flavours:\n%s\ntoppings:\n%s\ncosts:%s$\n",
                flavours.stream().collect(Collectors.joining(", ", "\t", ".")),
                toppings.stream().collect(Collectors.joining(", ", "\t", ".")),
                price

        );
    }

    /**
     * Returns a new Builder instance for creating an IceCream object.
     */
    public static final class Builder {
        private final ArrayList<String> flavours = new ArrayList<>();
        private final ArrayList<String> toppings = new ArrayList<>();
        private int price;

        /**
         * Adds the given flavour to the list of flavours for the IceCream object being built.
         * @param flavour the flavour to add, cannot be null or empty
         * @return this Builder instance
         * @throws IllegalArgumentException if the flavour is null or empty
         */
        public Builder addFlavour(String flavour) {
            flavours.add(flavour);
            return this;
        }

        /**
         * Adds the given topping to the list of toppings for the IceCream object being built.
         * @param topping the topping to add, cannot be null or empty
         * @return this Builder instance
         * @throws IllegalArgumentException if the topping is null or empty
         */
        public Builder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        /**
         * Sets the price in dollars for the IceCream object being built.
         * @param price the price to set, must be positive
         * @return this Builder instance
         * @throws IllegalArgumentException if the price is not positive
         */
        public Builder price(int price) {
            this.price = price;
            return this;
        }

        /**
         * Creates and returns a new IceCream object with the current list of flavours, toppings, and price.
         * @return a new IceCream object
         * @throws IllegalStateException if the flavours or toppings list is empty, or if the price is not positive
         */
        public IceCream build() {
            if (price <= 0) {
                throw new IllegalArgumentException("Price should be positive integer!");
            }
            if (flavours.isEmpty()) {
                throw new IllegalStateException("Flavour required!");
            }
            if (toppings.isEmpty()) {
                throw new IllegalStateException("Topping required!");
            }
            return new IceCream(flavours, toppings, price);
        }
    }
}
