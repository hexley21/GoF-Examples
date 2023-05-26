# Bridge Pattern

The Bridge pattern is a structural design pattern that decouples an abstraction from its implementation, allowing them to vary independently. It promotes loose coupling between the abstraction and its implementation, making them easier to modify and extend individually.

## General Overview

The Bridge pattern involves two separate hierarchies: the abstraction hierarchy and the implementation hierarchy. The abstraction hierarchy defines the high-level interface or functionality, while the implementation hierarchy provides the concrete implementation details.

By using the Bridge pattern, we can connect different abstractions with different implementations at runtime. This flexibility allows us to switch and combine abstractions and implementations dynamically.

## Advantages

- Decouples the abstraction from its implementation, promoting flexibility and extensibility.
- Allows independent modifications of the abstraction and implementation hierarchies.
- Enables runtime binding of abstractions and implementations.
- Enhances maintainability by providing a clear separation of concerns.

## Use Cases

The Bridge pattern is applicable in the following scenarios:

- When there are multiple independent hierarchies that need to be connected without coupling them tightly.
- When changes in the implementation should not affect the clients using the abstraction.
- When there is a need for dynamically selecting or switching between different implementations.

## Example

In our example, we have an abstraction hierarchy of shapes (`Rectangle`, `Circle`) and an implementation hierarchy of colors (`Red`, `Blue`). The `Shape` class represents the abstraction, while the `Color` interface represents the implementation.

The `Shape` class has a reference to the `Color` interface, allowing it to delegate the color-related operations. This decouples the shape and color hierarchies, enabling them to vary independently.

By creating different instances of shapes and associating them with different colors at runtime, we can achieve various combinations without modifying the existing code. For example:

```java
Color redColor = new Red();
Shape redRectangle = new Rectangle(redColor);
redRectangle.draw(); // Output: Rectangle painted with color #FF0000
```

This demonstrates how the Bridge pattern allows us to connect different shapes with different colors dynamically, providing flexibility and decoupling between the abstractions and their implementations.

---

Please note that the README.md file provided here is a general explanation of the Bridge pattern and uses a simplified version of the code examples you provided. You may need to modify and adapt it to fit your specific implementation and requirements.