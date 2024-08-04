// base class / parent class
// derived class / child class
// super class / sub class

public class inheritance {
    // inheriting properties of parent class in a child class
    public static void main(String[] args) {
        VeyAdvCalc obj = new VeyAdvCalc();

        int r1 = obj.add(10,3);
        int r2 = obj.sub(10,3);
        int r3 = obj.product(10,3);
        float r4 = obj.division(10,3);

        int r5 = obj.power(10, 3);
        
        System.out.println(r1 + "    " + r2 + "    " + r3 + "    " + r4 + "    " + r5);
    }
}

// multiple inheritance in java is not possibe.
// but we can use interface to achieve multiple inheritance

// to avoid ambiguity and diamond problem in java we don't use multiple inheritance

// 
