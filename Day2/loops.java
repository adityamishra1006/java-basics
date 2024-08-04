public class loops {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10){
            System.out.println("Hii " + i);
            int j = 1;
            while(j<=5){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Byee" + i);
    }
}
