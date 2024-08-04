public class typeCasting {
    public static void main(String[] args) {
        // byte b = 125;
        int a = 257;
        byte k = (byte) a;
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);


        // Type Promotion
        byte x = 10;
        byte y = 20;

        int res = x * y;
        System.out.println(res);
    }
}
