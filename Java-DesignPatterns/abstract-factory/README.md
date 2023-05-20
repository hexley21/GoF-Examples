# Abstract Factory Pattern

The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

## Components

![img.png](https://www.cs.unc.edu/~stotts/GOF/hires/Pictures/abfac108.gif)

### AbstractProductA
`AbstractProductA` is an abstract class that defines the methods that the `ProductA` objects will implement. In our example, it is `Developer` interface.

### AbstractProductB
`AbstractProductB` is an abstract class that defines the methods and fields that the `ProductB` objects will have. In our example, it is `Ide` abstract class.

### ProductA1
`ProductA1` is a concrete implementation of `AbstractProductA`. In our example, it is implemented by the `PythonDeveloper` class.

### ProductA2
`ProductA2` is a concrete implementation of `AbstractProductA`. In our example, it is implemented by the `PyCharm` class.

### ProductB1
`ProductB1` is a concrete implementation of `AbstractProductB`. In our example, it is implemented by the `RubyDeveloper` class.

### ProductB2
`ProductB2` is a concrete implementation of `AbstractProductB`. In our example, it is implemented by the `RubyMine` class.

### AbstractFactory
`AbstractFactory` is an abstract class that defines the methods for creating `AbstractProductA` and `AbstractProductB` objects. In our example, it is `AbstractProgrammingFactory` interface.

### ConcreteFactory1
`ConcreteFactory1` is a concrete implementation of `AbstractFactory`. In our example, it is implemented by the `PythonProgrammingFactory` class.

### ConcreteFactory2
`ConcreteFactory2` is a concrete implementation of `AbstractFactory`. In our example, it is implemented by the `RubyProgrammingFactory` class.

## Example Usage

Suppose we want to create a `PythonDeveloper` using the `PythonProgrammingFactory`. We would do the following:

1. Create a `PythonProgrammingFactory` object.
2. Call the `createDeveloper()` method on the `PythonProgrammingFactory` object, which will return a `PythonDeveloper` object.
3. Call the `createIde()` method on the `PythonProgrammingFactory` object, which will return a `PyCharm` object.
4. Use the `PythonDeveloper` and `PyCharm` objects to write code, tests, and push changes.

Here's an example code snippet:

```java
public class Main {
    
    public static void main(String[] args) {
        AbstractProgrammingFactory factory = new PythonProgrammingFactory();

        Developer developer = factory.createDeveloper();
        Ide ide = factory.createIde();

        developer.writeCode(ide);
        developer.writeTests(ide);
        developer.pushChanges();
    }
}
```

Similarly, if we want to create a `RubyDeveloper`, we'd be using the `RubyProgrammingFactory`.

## Benefits
In this particular example, factories are not much useful.
Objects could be instantiated directly and everything would work the same.
But creating abstract factories gives us an advantages in:
1. Flexibility and extensibility:<br>
Abstract factories provide a way to create objects without specifying their concrete types.
2. Encapsulation of object creation:<br>
This makes easier to manage the complexity of creating an objects in a large software system.
3. Separation of concerns:<br>
Separation of object creation from their use simplifies code. Basically you don't need to know what's behind.

## Related Patterns
- AbstractFactory classes are often implemented with **Factory Methods**.
- But they can also be implemented using **Prototype**.
- A concrete factory is often a **Singleton**.