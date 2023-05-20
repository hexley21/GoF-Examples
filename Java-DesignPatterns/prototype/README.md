# Prototype Design Pattern

The Prototype design pattern is a creational design pattern that allows us to create new objects by cloning existing objects, thus avoiding the need for subclassing.

## Advantages

- Provides a way to create new objects by cloning existing objects, which can be more efficient and flexible than creating objects from scratch.
- Hides the complexities of object creation and initialization from the client code.
- Allows easy modification of existing objects by creating clones and modifying the specific properties as needed.

## Applicability

Use the Prototype pattern when:

- Creating new objects is costly or complex, and a similar object already exists.
- You want to isolate the object creation and cloning logic from the client code.
- You want to create copies of objects without coupling to their concrete classes.

## Use Cases

- Creating multiple instances of complex objects that share a lot of common properties.
- Implementing a registry of prototype objects that can be cloned and customized as needed.
- Avoiding the overhead of subclassing when creating new objects.

## Structure

The Prototype pattern involves the following participants:

- **Prototype**: The prototype interface or base class that declares the `clone()` method for cloning itself.
- **Concrete Prototypes**: The concrete classes that implement the `clone()` method to provide cloning functionality.

## Implementation Example

In our example, we have a `Phone` class hierarchy that represents different types of phones. The `Phone` class implements the `Prototype` interface, which defines the `clone()` method. Each concrete phone class (`IPhone` and `GooglePixel`) provides its own implementation of the `clone()` method.

To create a clone of a phone, you can call the `clone()` method on an existing phone object. This will create a new instance of the same type with the same properties, allowing you to modify the cloned object without affecting the original.

```java
Phone originalPhone = new IPhone(12, 12345, false, true);
Phone clonedPhone = originalPhone.clone();
```
## Summary
The Prototype design pattern provides a way to create new objects by cloning existing ones. It offers advantages such as flexibility, reduced complexity, and improved performance. By isolating the object creation and cloning logic, it allows for easy modification and customization of objects.