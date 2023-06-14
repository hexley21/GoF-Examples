# Flyweight Pattern

The Flyweight pattern is a structural design pattern that focuses on minimizing memory usage by sharing common data among multiple objects. It is useful when we need to create a large number of similar objects that can be effectively shared and have intrinsic (immutable) properties.

## General Explanation

The Flyweight pattern works by separating the intrinsic and extrinsic states of objects. Intrinsic state represents the properties that are shared among multiple objects and can be shared, while extrinsic state represents the properties that are unique to each object and cannot be shared.

In the Flyweight pattern, a flyweight factory is used to manage a pool of flyweight objects. When a client requests a flyweight object, the factory checks if an object with the desired properties already exists in the pool. If it does, the existing object is returned; otherwise, a new object is created, added to the pool, and returned. This way, multiple objects can share the same intrinsic state, reducing memory consumption.

## Advantages

- Memory Efficiency: The Flyweight pattern reduces memory usage by sharing common data among multiple objects. Instead of each object storing duplicate data, the shared data is referenced, resulting in significant memory savings.

- Performance Improvement: By sharing common data, the Flyweight pattern can improve performance by reducing object creation and initialization time.

- Scalability: The Flyweight pattern allows for the efficient management of a large number of fine-grained objects, making it suitable for applications that deal with a large number of similar objects.

## Use Cases

- Text Editors: In a text editor, different text styles such as font, size, and color can be considered as flyweight objects. Instead of creating a separate object for each character with the same style, the flyweight objects can be reused, improving memory efficiency.

- Game Development: In games that involve rendering a large number of similar objects, such as bullets, particles, or characters, the Flyweight pattern can be used to share common properties among these objects, resulting in better performance.

- Caching: The Flyweight pattern can be used for caching commonly used objects or resources to avoid repeated instantiation and improve system performance.

## Example

In our example code, we demonstrated the Flyweight pattern using a text editor. Different text styles, such as bold, italic, and underline, were implemented as flyweight objects. These objects shared common properties like name, color, and size, and were reused whenever possible.

By employing the Flyweight pattern, we achieved memory efficiency by reducing the number of individual text style objects. Instead, we created flyweight objects for each unique combination of properties and reused them as needed. This approach saved memory and improved performance when applying text styles to specific parts of the text.

To see the Flyweight pattern in action, refer to the [Java code example](./src/main/java/Main.java).

## Conclusion

The Flyweight pattern is a powerful technique for optimizing memory usage in situations where large numbers of similar objects need to be created. By separating intrinsic and extrinsic state and sharing common data, it helps reduce memory consumption, improve performance, and enhance scalability. It finds applications in various domains such as text editors, game development, and caching.