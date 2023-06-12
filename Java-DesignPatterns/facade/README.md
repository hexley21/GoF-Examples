# Facade Pattern

The Facade pattern is a software design pattern that provides a simplified interface to a complex subsystem of classes. It allows you to hide the complexities of the subsystem behind a unified and user-friendly interface. This pattern promotes loose coupling between client code and the subsystem, making it easier to use and understand.

## How it works

The Facade pattern involves creating a facade or wrapper class that encapsulates the interactions with the subsystem. This facade class provides a high-level interface that clients can use to access the subsystem's functionality without needing to understand its inner workings.

In our example, we have a `BuyPhoneFacade` class that serves as a facade for buying phones. It simplifies the process of buying an Apple or Google phone by encapsulating the interactions with the `FedEx` delivery service and the phone classes (`ApplePhone` and `GooglePhone`).

## Advantages of using Facade pattern

- **Simplifies complex subsystems**: The Facade pattern provides a simplified interface that hides the complexities of the subsystem. It allows clients to interact with the subsystem without needing to understand its internal implementation details.

- **Promotes loose coupling**: By providing a unified interface, the Facade pattern decouples the client code from the subsystem. Clients only need to depend on the facade class, reducing the dependencies on individual subsystem components.

- **Improves code maintainability**: Changes in the subsystem can be encapsulated within the facade class, preventing the need for modifications in the client code. This makes the codebase more maintainable and reduces the risk of introducing bugs when modifying the subsystem.

## Use cases for Facade pattern

The Facade pattern is useful in the following scenarios:

- **Simplifying complex APIs**: When working with complex APIs or libraries, a facade can be created to provide a simplified interface that hides the intricate details of the underlying API, making it easier to use.

- **Legacy code integration**: When integrating legacy code into a new system, a facade can be created to provide a consistent and simplified interface to interact with the legacy code, without the need to modify it extensively.

- **Subsystems with complex dependencies**: When a subsystem consists of multiple classes with intricate dependencies, a facade can be used to encapsulate the interactions and provide a unified interface to clients.

## Example

In our example, we have a `BuyPhoneFacade` class that simplifies the process of buying phones. It encapsulates the interactions with the `FedEx` delivery service and the phone classes (`ApplePhone` and `GooglePhone`). Clients can use the facade to buy an Apple or Google phone without having to deal with the complexities of the subsystem.

Here's a snippet of code demonstrating the usage of the `BuyPhoneFacade`:

```java
BuyPhoneFacade buyPhoneFacade = new BuyPhoneFacade();
String address = "moon";

ApplePhone iphone = buyPhoneFacade.getApple(address, "iPhone 14", 15);
GooglePhone pixel = buyPhoneFacade.getGoogle(address, "pixel 4", 14);

System.out.println(iphone.getName());
System.out.println(iphone.getIosVersion());

System.out.println();

System.out.println(pixel.getName());
System.out.println(pixel.getAndroidVersion());
```

In this example, we create a `BuyPhoneFacade` instance and use it to buy an Apple phone and a Google phone. The facade internally handles the interactions with the `FedEx` delivery service and the phone classes, providing a simplified interface for the client code.

Using the Facade pattern in this scenario simplifies the process of buying phones and hides the complexities of the subsystem, making the code more readable and maintainable.

---

By using the

Facade pattern, you can simplify complex subsystems, promote loose coupling, and improve code maintainability. It provides a convenient and understandable interface for clients to interact with the subsystem. The pattern is applicable in various scenarios, such as simplifying APIs, integrating legacy code, and handling subsystems with complex dependencies.

In our example, the `BuyPhoneFacade` demonstrates how the Facade pattern can simplify the process of buying phones by encapsulating the interactions with the subsystem.