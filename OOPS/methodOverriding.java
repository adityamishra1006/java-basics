
class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    
}

class AdvCalc extends Calc{
    // Method Overriding : When we create a function with same name and same parameters but the behavious of the function are different.

    // Like here the add() in Calc class behaves differently but add() in AdvCalc adds two number and 10 after it. It means the behaviour is different. 

    public int add(int n1, int n2){
        return n1 + n2 + 10;
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println( obj.add(3,4));
    }
}
