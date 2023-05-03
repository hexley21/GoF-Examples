import ice_cream.IceCream;

public class Main {

    /**
     Creates an instance of IceCream using the Builder pattern and prints its details.
     The Builder pattern provides a flexible and readable way to construct complex objects by allowing
     the client code to specify only the desired attributes, instead of having to use many constructors
     or setters. This method creates an IceCream object with two flavours ("Chocolate" and "Vanilla"),
     one topping ("M&M"), and a price of 10$, using the IceCream.Builder class. The resulting IceCream
     object is printed to the console.
     @see IceCream.Builder
     */
    public static void main(String[] args) {
        IceCream iceCream = new IceCream.Builder()
                .addFlavour("Chocolate")
                .addFlavour("Vanilla")
                .addTopping("M&M")
                .price(10)
                .build();

        System.out.println(iceCream);
    }
}
