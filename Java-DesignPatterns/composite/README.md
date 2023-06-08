# Composite Pattern

The Composite pattern is a structural design pattern that allows you to compose objects into tree-like structures and represent whole-part hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

## General Explanation

The Composite pattern is based on the idea of treating individual objects and groups of objects in a uniform manner. It defines two main types of components: leaf components and composite components.

- **Leaf Components:** These are the individual objects that do not have any child objects. They implement a common interface that allows them to be treated uniformly with the composite components.

- **Composite Components:** These are objects that can have child objects, which can be either leaf components or other composite components. Composite components also implement the same common interface as the leaf components.

The composite components maintain a collection of child components, providing methods to add, remove, and access them. This allows the creation of recursive structures where a component can contain other components, forming a tree-like hierarchy.

## Advantages of using the Composite Pattern

- **Uniformity:** The Composite pattern provides a uniform way to treat both individual objects and compositions of objects. Clients can work with the objects without needing to know whether they are dealing with a leaf or a composite component.

- **Simplified Client Code:** Clients can interact with complex hierarchical structures using a single interface, simplifying the client code and reducing the need for conditional statements or type checks.

- **Flexibility:** The pattern allows you to add or remove objects dynamically from the hierarchy without affecting the client code. New types of components can be added easily by implementing the common interface.

- **Code Reusability:** The Composite pattern promotes code reusability by enabling the use of the same code to work with individual objects and compositions of objects.

## Use Cases

The Composite pattern is useful in situations where you have a hierarchical structure that can be represented as a tree-like composition of objects. Some common use cases include:

- **File Systems:** A file system can be represented using the Composite pattern, where directories can contain files or subdirectories. This allows operations to be applied uniformly to both individual files and directories.

- **UI Components:** User interfaces often have a hierarchical structure, where components like containers or panels can contain other components or widgets. The Composite pattern enables treating the individual UI elements and their compositions in a uniform way.

- **Organization Structures:** The Composite pattern can be used to represent organizational structures, such as departments within a company. Departments can contain other departments or individual employees, allowing consistent operations to be performed at different levels of the hierarchy.

## Example

In our example code, we have used the Composite pattern to represent a delivery order system. The `Box` interface acts as the common interface for both individual products and composite boxes. The `CompositeBox` class represents a composite box that can contain other boxes or products. The `Product` class represents individual products that implement the `Box` interface.

The `DeliveryService` class uses the Composite pattern to set up an order by creating a composite box with various products. The `calculatePrices` method calculates the total prices of the items in the delivery order, treating both individual products and composite boxes uniformly.

This example demonstrates how the Composite pattern allows us to work with individual products and compositions of products in a unified manner, making it easier to manage and process complex delivery orders.

Please note that this is a simplified example to illustrate the Composite pattern. Real-world implementations may involve additional considerations and complexities based on the specific requirements of the application.
