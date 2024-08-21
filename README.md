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

## Switch Case

The `switch` statement in Java is used to execute one out of multiple blocks of code based on the value of a variable. It provides a cleaner way of writing multiple `if-else-if` statements.

### Important Points
- **Important:** Always include a `default` case to handle unexpected values.
- Use `break` statements to prevent fall-through, where the execution continues into the next case block even if it doesn't match.
- `switch` can work with `byte`, `short`, `char`, `int`, `String`, and enum types.

### Syntax and Explanation

```java
switch(variable) {
    case value1:
        // Code block
        break; // Important: Stops the execution of more cases.
    case value2:
        // Code block
        break;
    default:
        // Code block
}
```

### Code and Explanation

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
                break; // Important: Ensures the code exits the switch block.
        }
    }
}
```

  - The variable `n` is checked against each `case`. 
  - If `n` matches a case, the corresponding block executes. 
  - The `default` case handles any values of `n` that do not match the specified cases.

## Loops

Loops are used to execute a block of code repeatedly until a specified condition is met.

### Important Points
- Be careful with loop conditions to avoid infinite loops.
- Ensure that the loop counter or condition changes within the loop to eventually terminate it.
- Nested loops can be powerful but should be used cautiously to avoid complexity.

### Syntax and Explanation

#### While Loop

```java
while (condition) {
    // Code to be executed
}
```

#### For Loop

```java
for (initialization; condition; update) {
    // Code to be executed
}
```

#### Do-While Loop

```java
do {
    // Code to be executed
} while (condition);
```

### Code and Explanation

#### While Loop Example

```java
public class Loops {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.println("Hii " + i);
            int j = 1;
            while(j <= 5) {
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Byee " + i);
    }
}
```
- **Explanation:**
  - The outer loop prints "Hii" 10 times.
  - The inner loop prints "Hello" 5 times for each iteration of the outer loop.
  - The loop counters `i` and `j` are incremented to prevent infinite loops.

#### For Loop Example

```java
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
```
- **Explanation:**
  - The first loop prints numbers from 0 to 10.
  - The second loop prints numbers from 10 down to 0.

#### Do-While Loop Example

```java
public class DoWhile {
    public static void main(String[] args) {
        int i = 11;
        do {
            System.out.println("Hii " + i);
            i++;
        } while (i <= 10);
        // Important: The loop executes at least once even if the condition is false.
    }
}
```
- **Explanation:**
  - The `do-while` loop guarantees at least one execution of the loop body, even if the condition is false initially.

## Arrays


An array is a collection of elements of the same type stored in contiguous memory locations.

### Important Points
- **Important:** Array indices start from 0.
- Be cautious of `ArrayIndexOutOfBoundsException`.
- Arrays have a fixed size after initialization.

### Syntax and Explanation

```java
int[] arrayName = new int[size];
```
- `arrayName`: The name of the array.
- `size`: The number of elements the array can hold.

### Code and Explanation

```java
public class ArrayExample {
    public static void main(String[] args) {
        // If we know the values
        int nums[] = {5, 6, 7, 2};
        System.out.println(nums[0]); // 5
        System.out.println(nums[1]); // 6

        nums[1] = 3;
        System.out.println(nums[1]); // 3

        int num[] = new int[4];
        num[0] = 4;
        num[1] = 6;
        num[2] = 7;
        num[3] = 9;

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
```
- **Explanation:**
  - Two arrays are declared and initialized: one with predefined values and another with dynamic values.
  - The array elements are accessed using their indices.

## Multidimensional Arrays

Multidimensional arrays are arrays of arrays. They can be used to represent data in a grid or matrix format.

### Important Points
- The number of elements in each row of a multidimensional array can be different.
- Iterating over multidimensional arrays typically involves nested loops.

### Syntax and Explanation

```java
dataType[][] arrayName = new dataType[rows][columns];
```
- `rows`: Number of rows in the array.
- `columns`: Number of columns in the array.

### Code and Explanation

```java
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 1000);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : nums) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
```
- **Explanation:**
  - A 3x4 array is initialized and filled with random integers.
  - The array is printed in a grid format using nested loops.
  - An enhanced for loop is used to iterate through the array elements.

Certainly! Below is the updated explanation for the `static` keyword section, including the reasoning behind why the `main` method is marked as static, and the important note about it.

---

## Static Keyword and Methods

The `static` keyword in Java is used to define class-level methods and variables. These can be accessed without creating an instance of the class.

### Important Points
- **Important:** Static methods cannot access non-static variables or methods directly.
- Static variables are shared across all instances of the class.
- The `static` block is executed when the class is first loaded into memory.
- **Important:** The `main` method is marked as `static` because it is the entry point of the program. Without marking it `static`, the JVM would need to create an instance of the class to invoke the `main` method, which would not be possible since no object exists when the program starts.

### Syntax and Explanation

```java
class ClassName {
    static dataType variableName;
    
    static {
        // Static block
    }
    
    static void methodName() {
        // Static method
    }

    public static void main(String[] args) {
        // Main method - Important: It's static to allow the JVM to call it without creating an object.
    }
}
```

### Code and Explanation

```java
class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile() {
        brand = "";
        price = 15000;
        System.out.println("In Constructor");
    }
    
    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("in static method -- ");
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
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

        Mobile.show1(obj1); // We can call static method directly with the class name.
    }
}
```
- **Explanation:**
  - The `static` block initializes the static variable `name` before any instances of `Mobile` are created.
  - The `show1` static method demonstrates how to use static and non-static variables together when an object reference is passed.
  - The `main` method is marked as `static` to allow the JVM to invoke it without needing to create an instance of the `StaticKeyword` class. This is critical for the program to start executing as soon as it's launched.
