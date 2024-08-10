package javaDevelopment.Day4;

enum Status{
    Running, Failed, Pending, Success;
}

// enum in java extends enum class by default in java

public class Enums {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Pending;
        System.out.println(s.ordinal());
        System.out.println(s);

        Status[] st = Status.values();

        for(Status x : st){
            System.out.println(x + " : " + x.ordinal());
        }
    }
}

// Why we use enums?
// Enums (Enumerations) in Java are used to represent a fixed number of named values. Here are some reasons why we use enums in Java:
// 1. Improved Code Readability: Enums make the code more readable by providing a clear and concise way to represent a set of named values.
// 2. Type Safety: Enums ensure type safety by restricting the values to a specific set of named constants, preventing invalid values from being assigned.
// 3. Compile-Time Checking: Enums are checked at compile-time, which means that any errors or invalid values are caught early, reducing the chances of runtime errors.
// 4. Reducing Magic Numbers: Enums help to reduce the use of magic numbers (hardcoded values) in the code, making it more maintainable and easier to understand.
// 5. Improved Performance: Enums can improve performance by allowing the compiler to optimize the code, as the values are known at compile-time.
// 6. Flexibility: Enums can have methods and fields, making them more flexible and powerful than simple constants.
