- [Compilation: Creating Executables](#compilation-creating-executables)
- [Java Interview Questions](#java-interview-questions)
- [Java Classes](#java-classes)
  - [Classes: Constructors](#classes-constructors)
    - [Here’s the Car class with a constructor:](#heres-the-car-class-with-a-constructor)
  - [Classes: Instance Fields](#classes-instance-fields)
  - [Classes: Constructor Parameters](#classes-constructor-parameters)
  - [Classes: Assigning Values to Instance Fields](#classes-assigning-values-to-instance-fields)
  - [Classes: Multiple Fields](#classes-multiple-fields)

<small><i><a href='http://ecotrust-canada.github.io/markdown-toc/'>Table of contents generated with markdown-toc</a></i></small>



# Compilation: Creating Executables

Compilation helped us catch an error. Now that we’ve corrected the file, let’s walk through a successful compilation.

> As a reminder, we can compile a .java file from the terminal with the command:


        javac Whales.java

>If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal.

We run the executable with the command:

    java Whales

> Note that we leave off the .class part of the filename.

Here’s a full compilation cycle as an example:

```java
// within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to Codecademy's Java course!");
  }
}
```
>We have one file: Welcome.java. We compile with the command:

    javac Welcome.java

>The terminal shows no errors, which indicates a successful compilation.

We now have two files:

1. Welcome.java, our original file with Java syntax.
2. Welcome.class, our compiled file with Java bytecode, ready to be executed by the Java Virtual Machine.
   
We can execute the compiled class with the command:

    java Welcome

>The following is printed to the screen:

    Welcome to Codecademy's Java course!



# Java Interview Questions
1. Why encapsulation used ? Where you used encapsulation?
   1. Everything is an abstraction. Encapsulation is the process of hiding information details and protecting data and behavior of an object from misuse by other objects. In Java, encapsulation is done using access modifiers (public, protected, private) with classes, interfaces, setters, getters.

2. Where you used Synchronized and how it works?
   1. Synchronized keyword in Java is used to provide mutually exclusive access to a shared resource with multiple threads in Java. Synchronization in Java guarantees that no two threads can execute a synchronized method which requires the same lock simultaneously or concurrently.

# Java Classes

## Classes: Constructors
We create objects (instances of a class) using a constructor method. The constructor is defined within the class.

### Here’s the Car class with a constructor:

```java
public class Car {
  public Car() {
  //constructor method starts after curly brace

    //instructions for creating a Car instance

  }
  //constructor method ends after curly brace

  public static void main(String[] args) {

    // program tasks

  }
}
```

The constructor, `Car()`, shares a name with the class.

We create instances by calling or invoking the constructor within `main()`. This example assigns an instance to the variable ferrari:

```java
public class Car {

  public Car() {
  }

  public static void main(String[] args) {
    /*
    invoke a constructor using 
    'new', the name, and parentheses:
    new Car()
    */
    Car ferrari = new Car(); 
  }
}
```
As with other variable declarations, we specify the type: Car, and name: ferrari. Variables that reference an instance have a type of the class name.

We invoke the constructor method: `Car()`, and use the keyword new to indicate that we’re creating an instance. Omitting new causes an error.

This is the first time we’ve called a method that we’ve also defined. `main()` is run automatically and we did not define the `println()` method.

```java

public class Store {
  
  // new method: constructor!
  public Store() {
      System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}
```

Inside `main()`, print lemonadeStand to see how Java represents this instance.

Review the order of the printed messages:

Running the program invokes `main()`
We create an instance so we move from `main()` to `Store()`
The code inside `Store()` runs
When `Store()` finishes execution, we return to `main()`

Overall, output is:

```
Start of the main method.
I am inside the constructor method.
Store@2aae9190

```

## Classes: Instance Fields

Our last exercise ended with printing an instance of Store, which looked something like `Store@6bc7c054`. The first part, `Store`, refers to the class, and the second part `@6bc7c054` refers to the instance’s location in the computer’s memory.

We don’t care about memory location, but our instances have no other characteristics!

We’ll add associated data to an object by introducing instance variables, or instance fields. Instance fields are the state in our objects.

We want `Car` instances of different colors, so we declare a String color instance field.

```java
public class Car {
  /*
  declare fields inside the class
  by specifying the type and name
  */
  String color;

  public Car() {
    /* 
    instance fields available in
    scope of constructor method
    */
  }

  public static void main(String[] args) {
    // body of main method
  }
}
```
The declaration is within the class and the instance variable will be available for assignment inside the constructor.

Fields are a type of state each instance will possess. One instance may have "red" as its color, another "blue", etc. We’ll learn how to assign values in the next exercise.


## Classes: Constructor Parameters
We’ll use a combination of constructor method and instance field to create instances with individual state.

We need to alter the constructor method because now it needs to access data we’re assigning to the instance.

Our Car constructor now has a parameter: `String carColor.`

```java

public class Car {
  String color;

  // constructor method with a parameter
  public Car(String carColor) {
    // parameter value assigned to the field
    color = carColor;
  }
  public static void main(String[] args) {
    // program tasks
  }
}

```

We need a value for the instance field color, so we’ve added `String carColor` as a parameter.

Parameters specify the type and name of data available for reference within a method’s scope.

We’ve already seen a parameter in the `main()` method: `String[] args`, but this is the first time we’re using the parameter value within a method body.

The parameter `carColor` references the value passed in during a method call:

```java
new Car("blue");
// carColor references "blue" inside constructor
new Car("yellow");
// carColor references "yellow" inside constructor
```

Within the constructor, we assign the parameter value to the instance field.

Instance fields are available for assignment inside the constructor because we declared them within the class.

## Classes: Assigning Values to Instance Fields

Now that our constructor has a parameter, we must pass values into the method call. These values become the state of the instance.

Here we create an instance, ferrari, in the `main()` method with "red" as its color field:

```java
public class Car {
  String color;

  public Car(String carColor) {
    // assign parameter value to instance field
    color = carColor;
  }

  public static void main(String[] args) {
    // parameter value supplied when calling constructor
    Car ferrari = new Car("red");
  }
}
```

We pass the String value "red" to our constructor method call: `new Car("red");`.

The type of the value given to the invocation must match the type declared by the parameter.

Inside the constructor, the parameter `carColor` refers to the value passed in during the invocation: "red". This value is assigned to the instance field color.

`color` has already been declared, so we don’t specify the type during assignment.

The object, ferrari, holds the state of color as an instance field referencing the value "red".

We access the value of this field with the dot operator (.):

```java
/*
accessing a field:
objectName.fieldName
*/

ferrari.color;
// "red"
```
Another example with the store class:

```java
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("lemonade"); 
    
    System.out.println(lemonadeStand.productType);
    
  }
}
```

## Classes: Multiple Fields

Objects are not limited to a single instance field. We can declare as many fields as are necessary for the requirements of our program.

Let’s change `Car` instances so they have multiple fields.

We’ll add a boolean is`Running, that indicates the car engine is on and an `int velocity`, that indicates the speed at which the car is traveling.

```java
public class Car {
  String color;
  // new fields!
  boolean isRunning;
  int velocity;

  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour) {
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
  }

  public static void main(String[] args) {
    // new values passed into the method call
    Car ferrari = new Car("red", true, 27);
    Car renault = new Car("blue", false, 70);

    System.out.println(renault.isRunning);
    // false
    System.out.println(ferrari.velocity);
    // 27
  }
}
```

The constructor now has multiple parameters to receive values for the new fields. We still specify the type as well as the name for each parameter.

Ordering matters! We must pass values into the constructor invocation in the same order that they’re listed in the parameters.

```java
// values match types, no error
Car honda = new Car("green", false, 0);

// values do not match types, error!
Car junker = new Car(true, 42, "brown");
```