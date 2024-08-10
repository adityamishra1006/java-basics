package javaDevelopment.Day4;

interface A{

    // all the varibles inside interfaces are by default static and final
    int age = 44;
    String name = "Aditya";

    void show();
    void config();
}

interface X{
    void run();
}

// class  -> class == extends
// class -> interface == implements
// interface -> interface == extends

interface Y extends X{
    // void run();
}

class B implements A, Y{
    public void show() {
        System.out.println("show()");
    }
    public void config(){
        System.out.println("config()");
    }
    public void run(){
        System.out.println("run()");
    }
}

public class InterfacesII {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.name);
    }
}
// What is interface?
// it is like a class where all the methods are by default public abstract
// We cannot instantiate it