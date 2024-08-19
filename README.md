# JAVA Developemtn
## Day 1
## Java Programming Basics

## Introduction to Java

Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It is widely used for building enterprise-scale applications and has a reputation for its portability across platforms thanks to the Java Virtual Machine (JVM).

### Setting Up the Java Environment

To write and run Java programs, you need to set up a development environment on your computer. Here's how:

1. **Install the Java Development Kit (JDK)**: 
   - Download the latest version of the JDK from the official Oracle website or use an open-source alternative like OpenJDK.
   - Install the JDK by following the on-screen instructions.

2. **Set Up Environment Variables**:
   - On Windows, add the JDK `bin` directory to your system's PATH environment variable.
   - On macOS/Linux, you can add the PATH in your `.bash_profile`, `.zshrc`, or `.bashrc` file.

3. **Verify Installation**:
   - Open a command prompt or terminal and type `java -version` and `javac -version` to verify the installation.

### Understanding JVM and JDK

- **Java Virtual Machine (JVM)**: 
  - The JVM is the engine that runs Java applications. It converts the bytecode produced by the Java compiler into machine code that can be executed by your computer.
  - **Important**: JVM allows Java applications to run on any device or operating system, making Java platform-independent.

- **Java Development Kit (JDK)**:
  - The JDK is a software development kit that includes tools required to develop Java applications. It contains the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools.

## Java Fundamentals

### Variables in Java

Variables are containers that hold data values. In Java, each variable must be declared with a specific data type.

```java
int x = 10; // 'x' is a variable of type int
```

### Data Types in Java

Java provides two types of data types:

1. **Primitive Data Types**: These are the most basic data types built into the Java language. They include:
   - `int` (integer)
   - `float` (floating point number)
   - `double` (double-precision floating point number)
   - `char` (character)
   - `boolean` (true/false)
   - `byte`, `short`, `long` (for varying sizes of integers)

2. **Non-Primitive Data Types**: These include classes, arrays, and interfaces. Unlike primitive data types, non-primitive types are created by the programmer and can hold multiple values.

### Literals in Java

Literals are the constant values assigned to variables. Java supports several types of literals:

- **Integer Literals**: `int a = 10;`
- **Floating-point Literals**: `float b = 20.5f;`
- **Character Literals**: `char c = 'A';`
- **String Literals**: `String s = "Hello";`
- **Boolean Literals**: `boolean flag = true;`

### Increment and Decrement Operators

Java provides the increment (`++`) and decrement (`--`) operators to increase or decrease a variable's value by one.

```java
int x = 5;
x++; // Now x is 6
x--; // Now x is back to 5
```

### Type Conversion and Type Casting

- **Type Conversion**: The automatic conversion of a smaller data type to a larger data type.
  
  ```java
  int a = 10;
  double b = a; // Automatic conversion from int to double
  ```

- **Type Casting**: The manual conversion of a larger data type to a smaller data type.
  
  ```java
  double a = 10.5;
  int b = (int) a; // Manual casting from double to int
  ```

### Operators in Java

Java operators are special symbols used to perform operations on variables and values. Here are some key types:

- **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`
- **Relational Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators**: `&&`, `||`, `!`
- **Assignment Operators**: `=`, `+=`, `-=`, `*=`, `/=`

## Conditional Statements in Java

Conditional statements allow you to execute code blocks based on certain conditions.

### Example 1: Basic Conditional Statement

```java
public class Conditionals {
    public static void main(String[] args) {
        int x = 18;

        if(x > 10) // Important: Checks if x is greater than 10
            System.out.println("Hello");
        else
            System.out.println("Bye");
    }
}
```

- **Explanation**: 
  - This code checks if `x` is greater than 10. If true, it prints "Hello"; otherwise, it prints "Bye".

### Example 2: Multiple Conditions

```java
public class Conditionals2 {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;

        if(x > y && x > z) {
            System.out.println(x + " is greater");
        } else if(y > x && y > z) { // Important: Checks if y is greater than both x and z
            System.out.println(y + " is greater");
        } else {
            System.out.println(z + " is greater");
        }
    }
}
```

- **Explanation**: 
  - This code compares three variables (`x`, `y`, `z`) and prints the greatest one. The `&&` operator ensures both conditions must be true.

### Example 3: Ternary Operator

```java
public class Conditionals3 {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;

        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}
```

- **Explanation**: 
  - This code uses the ternary operator `? :` to assign a value to `result`. If `n` is even, `result` is 10; otherwise, it is 20.

### Example 4: Simplified Ternary Operator

```java
public class Conditionals4 {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;

        result = n % 2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}
```

- **Explanation**: 
  - This example is identical to Example 3 and further demonstrates the use of the ternary operator for concise conditional logic.

---

This comprehensive guide provides a solid foundation in Java programming, explaining key concepts with practical code examples. The detailed line-by-line explanations make it easier to understand and apply these concepts in real-world programming scenarios.
