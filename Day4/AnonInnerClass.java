package javaDevelopment.Day4;

class A{
    public void show(){
        System.out.println("A");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("B");
//     }
// }

public class AnonInnerClass {
    public static void main(String[] args) {
        // This is an inner class
        // There is no name for this clas so this is anonymous inner class
        A obj = new A(){
            public void show(){
                System.out.println("Inner Class");
            }    
        };
        obj.show();
    }
}


