
class A {
    public void show() {
        System.out.println("Show in A");
    }
}

class B extends A {
    public void show() {
        System.out.println("Show in B");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        final int a = 9;
        // a = 10;

    }
}


