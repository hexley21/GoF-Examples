# Composite Pattern

The Composite pattern is a structural design pattern that allows you to treat individual objects and groups of objects uniformly. It composes objects into tree-like structures to represent part-whole hierarchies. This pattern lets clients work with individual objects and compositions in a consistent manner.

## General Idea

The Composite pattern consists of three main components:

1. **Component:** This is the common interface or abstract class that represents both individual objects and compositions. It defines the common operations that can be performed on the objects.

2. **Leaf:** A leaf is the basic building block of the composition. It represents individual objects that have no children.

3. **Composite:** A composite is a container that holds a collection of child components, including both leaves and other composites. It implements the operations defined in the component interface by delegating them to its child components.

The key idea behind the Composite pattern is that the client treats both individual objects and compositions uniformly through the component interface. This allows the client to interact with complex structures in a recursive manner without needing to know the specific details of the objects in the structure.

## Advantages

The Composite pattern offers several benefits:

- **Simplifies client code:** The pattern provides a unified interface for working with individual objects and compositions. This simplifies the client code by treating them uniformly.

- **Flexible and extensible:** New types of components can be added to the structure without impacting the existing code. The pattern allows for a flexible and extensible design.

- **Recursive structure:** The pattern enables the creation of recursive structures that can represent complex hierarchies in a convenient way.

## Use Cases

The Composite pattern is applicable in various scenarios, including:

- **Hierarchical structures:** When you need to represent part-whole hierarchies, such as directories and files, organization hierarchies, or graphical user interface components.

- **Uniform access:** When you want to provide a consistent interface to clients for accessing individual objects and compositions.

- **Tree-like structures:** When you need to work with tree-like structures where nodes can have child nodes.

## Example

In our code example, we have implemented a simplified version of the Composite pattern using a camera system. The `ICamera` interface defines the common operations for taking a photo. The `CameraNikon` class represents an individual camera, while the `CameraDecorator` class serves as the base decorator for adding additional functionality.

We have also implemented three concrete decorators: `FlashCameraDecorator`, `LensCameraDecorator`, and `MemoryCameraDecorator`. These decorators add specific features to the camera, such as flash, lens adjustment, and additional memory card support.

By combining these decorators in different ways, we can create various configurations of the camera system. In the `Main` class, we demonstrate how to create a decorated camera with flash, lens adjustment, and additional memory card functionality. Calling the `takePhoto()` method on this decorated camera will invoke the corresponding operations in each decorator, providing the desired behavior.

This example showcases how the Composite pattern allows us to treat individual camera objects and decorated camera compositions uniformly. It provides a flexible and extensible way to enhance the functionality of the camera system while keeping the client code simple and consistent.

