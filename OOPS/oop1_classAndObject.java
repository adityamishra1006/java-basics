class Calculator {
    int a;
    int b;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class oop1_classAndObject {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
