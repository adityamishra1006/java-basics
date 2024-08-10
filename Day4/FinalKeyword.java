package javaDevelopment.Day4;

// final keyword : variable, method, class
// final variable : cannot be changed
// final method : cannot be overridden
// final class : cannot be inherited

class Calc{
    final public void show(){
        System.out.println("Calc class show Aditya");
    }
    public void add(int a, int b){
        System.out.println(a + b);
    }
}


// When we use final with class it means no one can inherit it. 
class AdvCalc extends Calc{
    // public void show(){
        // System.out.println("AdvCalc class show Other");
    // }
}

public class FinalKeyword{
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc();
        c.show();
        c.add(5, 4);
    }
}

// 7:22:53