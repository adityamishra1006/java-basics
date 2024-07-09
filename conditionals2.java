public class conditionals2 {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 9;

        if(x>y && x>z){
            System.out.println(x + " is greater");
        } else if(y>x && y>z){ //We can also write only y>z
            System.out.println(y + " is greater");
        }else{
            System.out.println(z + " is greater");
        }
    }
}
