# Chain of Responsibility Design Pattern

The Chain of Responsibility design pattern is a behavioral pattern that allows an object to pass a request along a chain of potential handlers until the request is handled or reaches the end of the chain. This pattern promotes loose coupling between senders and receivers, providing flexibility in handling requests.

## Introduction

The Chain of Responsibility pattern follows the "don't ask, just do" principle. Instead of a sender explicitly calling a receiver to handle a request, it delegates the responsibility to a series of potential receivers. Each receiver in the chain has the opportunity to handle the request or pass it to the next receiver. This decouples senders from receivers, allowing flexibility in handling requests and dynamic modification of the chain.

## Participants

The Chain of Responsibility pattern involves the following participants:

- **Handler**: An interface or abstract class that defines the common interface and implements the default behavior for handling requests.
- **Concrete Handlers**: Concrete implementations of the Handler interface. Each handler checks if it can handle the request and either handles it or passes it to the next handler in the chain.
- **Client**: The object that initiates the request and starts the chain. It is unaware of the concrete handlers and their order in the chain.

## Example

Consider an authentication system that verifies user credentials. We can use the Chain of Responsibility pattern to create a chain of handlers responsible for different authentication checks. For example, the first handler in the chain can verify if the user exists, the second handler can check the password validity, and so on. Each handler decides whether to handle the request or pass it to the next handler. This allows for flexible authentication workflows and the ability to add or remove authentication checks easily.

In the provided Java code example, the `Handler` class is an abstract base class representing the common structure for handling requests. The `PasswordHandler` and `UserExistsHandler` classes are concrete implementations of the handlers. The `AuthService` class represents the client that initiates the authentication process by calling the `handle` method of the first handler in the chain.

## Applicability

Use the Chain of Responsibility pattern in the following situations:

- When you want to decouple senders and receivers of a request, allowing for flexibility in handling and dynamically modifying the chain of receivers.
- When multiple objects can handle a request, and the handler should be determined at runtime.
- When you want to specify different handling strategies and the order of their execution.

## Benefits

The Chain of Responsibility pattern offers several benefits:

- **Flexibility**: Handlers can be added, modified, or removed without affecting the client or other parts of the application.
- **Decoupling**: The sender doesn't need to know the exact receiver in the chain, reducing dependencies and promoting loose coupling.
- **Reusability**: Handlers can be reused and combined in different ways to create various chains for handling requests.

## Related Patterns

The Chain of Responsibility pattern is related to other design patterns:

- **Decorator**: The Chain of Responsibility pattern can be used to extend the behavior of an object dynamically, similar to how decorators enhance objects' functionality.
- **Command**: The Chain of Responsibility pattern can be combined with the Command pattern to represent requests as objects and enable more complex processing and logging of requests.

## References

- Design Patterns: Elements of Reusable Object-Oriented Software, Gamma et al.
