# Builder Pattern

The Builder pattern is a creational design pattern that allows you to construct complex objects step by step, using a builder object that separates the construction of the object from its representation. The builder object is responsible for collecting the necessary information to build the object, and then creating the object with the collected information.

## How it works

The Builder pattern typically involves two main components: the **Product** and the **Builder**. The **Product** is the object that is being constructed, while the **Builder** is the object that is responsible for constructing the **Product**. The **Builder** has a set of methods that allow you to specify the various properties of the **Product** step by step, and a method to create the **Product** once all the properties have been specified.

In Java, the Builder pattern can be implemented as an inner static class of the **Product** class, like in this code example. The inner static **Builder** class has a set of methods that allow you to specify the various properties of the **Product** step by step, and a `build()` method to create the **Product** once all the properties have been specified. The **Product** constructor is made private, and can only be called from within the **Builder** class.

## Benefits

The Builder pattern has several benefits, including:

- It provides a clear separation of concerns between the construction of the object and its representation.
- It allows you to create complex objects step by step, making the code more readable and maintainable.
- It allows you to create different variations of the same object using the same construction code, by simply changing the **Builder** that is used to construct the object.
- It can help to avoid the use of multiple constructors with different combinations of parameters, which can lead to confusing and error-prone code.

## Example

In the code example provided, the **Builder** pattern is used to construct an `IceCream` object. The `IceCream` class has an inner static **Builder** class that allows you to specify the flavours, toppings, and price of the `IceCream` object step by step, and then create the `IceCream` object with the collected information using the `build()` method.

Here's an example of how to use the **Builder** to create an `IceCream` object:

``` java
IceCream iceCream = new IceCream.Builder()
        .addFlavour("Chocolate")
        .addFlavour("Vanilla")
        .addTopping("M&M")
        .price(10)
        .build();
```

This code creates a new `IceCream` object with two flavours ("Chocolate" and "Vanilla"), one topping ("M&M"), and a price of 10 dollars.
