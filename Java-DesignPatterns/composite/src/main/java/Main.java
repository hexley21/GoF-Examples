import composites.CompositeBox;
import types.products.Book;
import types.products.VideoGame;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.setupOrder(
                new CompositeBox(
                        new Book(15, "The war and peace")
                ),
                new CompositeBox(
                        new CompositeBox(
                                new VideoGame(10, "The Witcher 3: Wild hunt"),
                                new VideoGame(8, "The Witcher 2: Assassins of Kings")
                        ),
                        new Book(15, "The Last Wish"),
                        new Book(15, "Sword of Destiny")
                )
        );

        System.out.println(deliveryService.getBox().calculatePrice());
    }
}