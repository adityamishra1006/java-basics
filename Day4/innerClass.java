package javaDevelopment.Day4;

class A{
    int age;
    
    public void show(){
        System.out.println("Show");
    }

    static class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // We cannot make object of B directly
        // If the function is non static than this syntax will be used
        // A.B obj1 = obj.new B();
        
        
        // but if the function is static we can call it using this syntaz
        A.B obj1 = new A.B();
        obj1.config();;
        
    }
}

// What is static class?
// In Java, a static class is a nested class that is declared with the static keyword. A static class is a class that is nested inside another class, but it does not have access to the outer class's instance variables.
// We cannot make outer class static





