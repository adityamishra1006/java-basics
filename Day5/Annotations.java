
// @Deprecated?
class A{
    public void showDataOfClass(){
        System.out.println("A");
    }
}
class B extends A{
    @Override
    public void showDataOfClass(){
        System.out.println("B");
    }
}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showDataOfClass();
    }
}

// Annotation do not chage the way of working of code, it only gives the additional information to the compiler or runtime