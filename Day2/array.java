public class array {
    public static void main(String[] args) {
        // If we know the values
        int nums[] = {5,6,7,2};
        System.out.println(nums[0]); // 5
        System.out.println(nums[1]); // 6

        nums[1] = 3;
        System.out.println(nums[1]); // 3


        int num[] = new int[4];
        // System.out.println(num[0]);
        num[0] = 4;
        num[1] = 6;
        num[2] = 7;
        num[3] = 9;

        for(int i = 0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        
    }
}
