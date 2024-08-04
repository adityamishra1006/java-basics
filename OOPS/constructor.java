
class Human{
    private int age = 22;
    private String name = "Aditya";

    // A constructor looks like a method itself.
    // Name must be same as class name.


    // Default constructor
    // If we not create this constructor, object calls it by default. 
    public Human(){
        age = 22;
        name = "Aditya";
    }

    // parametrized constructor
    public Human(int a, String n) {
        age = a;
        name = n;
    }

    public Human(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}


public class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        // Everytime we create the object it calls the constructor

        Human obj1 = new Human(18, "Aayush");

        Human obj2 = new Human("Krishna");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}

// If we want to perform some operations then do it in the methods.

// Method Overloading : When we have 2 methods with same name but with different parameters, it is called method overloading.
