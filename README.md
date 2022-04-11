## Hi there 👋

### 💬 This project is used to show examples of java.

### Useful Information

- int myNum = 5; // Integer (whole number)
- float myFloatNum = 5.99f; // Floating point number
- char myLetter = 'D'; // Character
- boolean myBool = true; // Boolean
- String myText = "Hello"; // String

----

### Primitive Data Types

A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

- byte 1 byte Stores whole numbers from -128 to 127
- short 2 bytes Stores whole numbers from -32,768 to 32,767
- int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
- long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
- double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
- boolean 1 bit Stores true or false values
- char 2 bytes Stores a single character/letter or ASCII values

----

## Access Modifiers

### Classes

- public The class is accessible by any other class
- default The class is only accessible by classes in the same package. This is used when you don't specify a modifier.

### Methods and Constructors

- public The code is accessible for all classes
- private The code is only accessible within the declared class
- default The code is only accessible in the same package. This is used when you don't specify a modifier.
- protected The code is accessible in the same package and subclasses.

---

### Encapsulation

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

- declare class variables/attributes as private
- provide public get and set methods to access and update the value of a private variable

---

### Abstract Classes and Methods

Data bank is the process of hiding certain details and showing only essential information to the user. Abstraction can
be achieved with either abstract classes or interfaces

The abstract keyword is a non-access modifier, used for classes and methods:

- Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from
  another class).

- Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the
  subclass (inherited from).

---

### Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

---

### Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept"
into two categories:

subclass (child) - the class that inherits from another class

superclass (parent) - the class being inherited from To inherit from a class, use the extends keyword.

---

### Useful links

- JUnit: https://junit.org/junit5/