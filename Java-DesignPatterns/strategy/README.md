# Strategy Design Pattern

The Strategy design pattern is a behavioral design pattern that enables dynamic selection of algorithms at runtime. It allows you to define a family of algorithms, encapsulate each one as a separate class, and make them interchangeable. By doing so, the Strategy pattern allows the algorithms to vary independently from the clients that use them.

## General

The Strategy pattern consists of the following components:

- **Context**: The context class represents the object that uses a strategy. It holds a reference to the selected strategy object and delegates the execution of the algorithm to it.

- **Strategy**: The strategy interface defines the contract for different strategies. It declares a common method that encapsulates the algorithm to be performed.

- **Concrete Strategies**: Concrete strategy classes implement the strategy interface and provide the actual algorithm implementation.

## Advantages

- **Flexibility**: The Strategy pattern promotes flexibility by allowing algorithms to be easily interchangeable at runtime without affecting the clients using them.

- **Encapsulation**: Each strategy is encapsulated within its own class, making it easier to maintain, test, and modify without affecting other parts of the code.

- **Promotes code reuse**: Different strategies can be reused across multiple contexts, promoting code reuse and reducing duplication.

## Use Cases

The Strategy design pattern is applicable in various scenarios, including:

- When you have a family of algorithms or behaviors that need to be selected dynamically at runtime.

- When you want to avoid code duplication and make the algorithms reusable across different contexts.

- When you need to add new algorithms or modify existing ones without impacting the clients using them.

## Example

In our example, we have a `PaymentService` class that represents a service for processing orders using different payment strategies. It allows clients to set a payment strategy and process orders accordingly.

The `PaymentStrategy` interface defines the contract for different payment strategies, and we have two concrete strategy implementations: `PayPalPayment` and `CreditCardPayment`.

To use the Strategy pattern, you can create an instance of the `PaymentService`, set the desired payment strategy using `setPaymentStrategy()`, and then call `processOrder()` to process an order with the selected strategy.

Here's a code snippet demonstrating the usage:

```java
PaymentService paymentService = new PaymentService();
paymentService.setPaymentStrategy(new PayPalPayment());
paymentService.processOrder(100);

paymentService.setPaymentStrategy(new CreditCardPayment());
paymentService.processOrder(200);
