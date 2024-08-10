class A{
    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("B");
    }
}

public class UpAndDownCasting {
    public static void main(String[] args) {

        // Upcasting
        A obj = new B();
        obj.show();


        // Downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }
}


// What is Abstract Class? abstract class is a class that cannot be instantiated on its own and is intended to be inherited by other classes. An abstract class is declared using the abstract keyword and can contain both abstract and non-abstract methods.
// Abstract method belong to abstract class only