class A extends Object{
    // Every class extends to Object class weather we mention or not. 
    public A(){
        super();
        System.out.println("A");
    }

    public A(int n){
        super();
        System.out.println("A(int)");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("B");
    }

    public B(int n){
        // super(n);
        this();
        System.out.println("B(int)");
    }
}

public class thisAndSuper {
    public static void main(String[] args) {
        // B obj = new B();
        B obj1 = new B(5);
    }
}
