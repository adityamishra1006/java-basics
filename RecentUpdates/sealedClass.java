sealed class A permits B, C {

}

final class B extends A {

}

// If the parent class is sealed then child class must be sealed, non-sealed or final
final class C extends A {

}

class D {

}

public class sealedClass {
    public static void main(String[] args) {

    }
}