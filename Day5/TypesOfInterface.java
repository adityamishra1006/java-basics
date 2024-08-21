

// What is notmal interface?
// a normal interface is an interface that has multiple abstract methods. In other words, it is an interface that has more than one method declaration without an implementation.

// What is functional interface?
// In Java, a functional interface is an interface that has only one abstract method (also known as a Single Abstract Method, or SAM). This means that the interface has only one method that must be implemented by any class that implements it.

@FunctionalInterface
interface A{
    int add(int i, int j);
}

// Why it is more important ?

// class B implements A{
//     public void show() {
//         System.out.println("Show in A");
//     }
// }



// What is marker interface? 
// In Java, a marker interface (also known as a tag interface) is an interface that has no methods or variables declared in it. It is used to provide additional information about a class, without adding any functionality.

public class TypesOfInterface{
    public static void main(String[] args) {
        // This is lambda expression
        // A obj = (i) ->  System.out.println("Show in A " + i);
        // obj.show(5);   

        A obj = new A() {
            public int add(int i, int j) {
                return i+j;
            }
        };

        // Lambda expression for above function
        // Lambda expression only works with functional interface

        A obj2 = (int i, int j) -> i+j;

        System.out.println(obj.add(4,5));
        System.out.println(obj2.add(5,5));
    }
}

// There are 3 types of interfaces
// 1. Normal Interface : 
// 3. Functional Interface / SAM : 
// 2. Marker Interface : 

// All the methods in interface are public abstract.