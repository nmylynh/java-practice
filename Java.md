# Compilation: Creating Executables
### Compilation helped us catch an error. Now that we’ve corrected the file, let’s walk through a successful compilation.

> As a reminder, we can compile a .java file from the terminal with the command:


        javac Whales.java

>If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal.

### We run the executable with the command:

    java Whales

> Note that we leave off the .class part of the filename.

### Here’s a full compilation cycle as an example:

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

### We now have two files:

1. Welcome.java, our original file with Java syntax.
2. Welcome.class, our compiled file with Java bytecode, ready to be executed by the Java Virtual Machine.
   
### We can execute the compiled class with the command:

    java Welcome

>The following is printed to the screen:

    Welcome to Codecademy's Java course!



# Java Interview Questions
1. Why encapsulation used ? Where you used encapsulation?
   1. Everything is an abstraction. Encapsulation is the process of hiding information details and protecting data and behavior of an object from misuse by other objects. In Java, encapsulation is done using access modifiers (public, protected, private) with classes, interfaces, setters, getters.

2. Where you used Synchronized and how it works?
   1. Synchronized keyword in Java is used to provide mutually exclusive access to a shared resource with multiple threads in Java. Synchronization in Java guarantees that no two threads can execute a synchronized method which requires the same lock simultaneously or concurrently.