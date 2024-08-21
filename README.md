# JAVA Developement
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

## Switch Case in Java

The switch case statement is a control structure that allows you to choose one of many code blocks to be executed based on the value of an expression.

### Example: Switch Case Statement

```java
public class SwitchCase {
    public static void main(String[] args) {
        int n = 2;
        
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
```

- **Explanation**:
  - The `switch` statement evaluates the variable `n` and executes the corresponding case block.
  - **Important**: The `break` statement is used to terminate the switch block, preventing fall-through to subsequent cases.
  - If none of the cases match, the `default` case is executed.

## Loops in Java

Loops allow you to execute a block of code repeatedly, either a specific number of times or until a condition is met.

### For Loop

The `for` loop is used when the number of iterations is known beforehand.

```java
public class ForLoop {
    public static void main(String[] args) {
        // Loop from 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Loop from 10 to 0
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
    }
}
```

- **Explanation**:
  - The loop runs from `i = 0` to `i <= 10` in the first loop, printing numbers from 0 to 10.
  - In the second loop, it runs from `i = 10` to `i >= 0`, printing numbers in reverse order.

### While Loop

The `while` loop continues to execute as long as the condition is true.

```java
public class Loops {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10){
            System.out.println("Hi " + i);
            int j = 1;
            while(j <= 5){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);
    }
}
```

- **Explanation**:
  - The outer `while` loop prints "Hi" followed by the value of `i` for values from 1 to 10.
  - The inner `while` loop prints "Hello" followed by the value of `j` for values from 1 to 5, for each iteration of the outer loop.

### Do-While Loop

The `do-while` loop is similar to the `while` loop, but it guarantees that the code block will be executed at least once.

```java
public class DoWhile {
    public static void main(String[] args) {
        int i = 11;
        do {
            System.out.println("Hi " + i);
            i++;
        } while(i <= 10);
        // We get the output once even if the condition is false.
    }
}
```

- **Explanation**:
  - The `do-while` loop executes the block of code first and then checks the condition.
  - **Important**: Even though the condition `i <= 10` is false initially, the code inside the loop runs once.

### Enhanced For Loop

The enhanced `for` loop, also known as the "for-each" loop, is used to iterate through arrays or collections.

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int number : numbers) {
    System.out.println(number);
}
```

- **Explanation**:
  - The enhanced for loop simplifies the iteration over arrays by eliminating the need for an index variable.

## Arrays in Java

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

### Example: One-Dimensional Array

```java
public class Array {
    public static void main(String[] args) {
        // If we know the values
        int nums[] = {5, 6, 7, 2};
        System.out.println(nums[0]); // 5
        System.out.println(nums[1]); // 6

        nums[1] = 3;
        System.out.println(nums[1]); // 3

        // If we don't know the values beforehand
        int num[] = new int[4];
        num[0] = 4;
        num[1] = 6;
        num[2] = 7;
        num[3] = 9;

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
```

- **Explanation**:
  - The first array `nums` is initialized with values.
  - The second array `num` is declared with a fixed size, and values are assigned later.

### Multidimensional Arrays

Multidimensional arrays are arrays of arrays, allowing you to create matrices or tables.

```java
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                nums[i][j] = (int)(Math.random() * 1000);
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
```

- **Explanation**:
  - A two-dimensional array `nums` is created with 3 rows and 4 columns.
  - The array is filled with random values and printed in both a nested loop and an enhanced for loop.

### Jagged Arrays

Jagged arrays are arrays of arrays with different lengths.

```java
int[][] jaggedArray = new int[3][];

jaggedArray[0] = new int[2];
jaggedArray[1] = new int[4];
jaggedArray[2] = new int[3];
```

- **Explanation**:
  - In a jagged array, each sub-array can have a different length, providing more flexibility in managing data.

## Static Keyword in Java

The `static` keyword in Java is used for memory management, making it possible to access variables and methods without creating an instance of the class.

### Example: Static Variable and Static Method

```java
class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile(){
        brand = "";
        price = 15000;
        System.out.println("In Constructor");
    }

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show1(Mobile obj){
        System.out.println("in static method -- ");
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 70000;
        Mobile.name = "Smart Phone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 30000;
        Mobile.name = "Smart Phone";

        obj1.show();
        obj2.show();
    }
}
```

- **Explanation**:
  - **Static Variable**: Shared by all objects of the class. Changes made to it by one object are reflected in all others.
  - **Static Method**: Can be called without creating an object. It can only access static data members and cannot access non-static data members directly.
  - **Static Block**: Executed when the class is loaded, before the main method or constructors.

- **Important**: The `main` method is static because it is the entry point of the program and must be accessible without creating an instance of the class.

---


