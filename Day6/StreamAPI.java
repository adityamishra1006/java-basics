import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        // s3.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));
        // Once we use the stream, we cannot reuse it.


        // It is used to show how filter() works.
        Predicate<Integer> p = n ->  n%2==0;


        // Predicate<Integer> p = new Predicate<Integer>() {

            
        //     public boolean test(Integer n) {
        //         return n%2==0;
        //     }
            
        // };
        
        // int result = nums.stream()
        //                  .filter(n -> n%2==0)
        //                  .map(n -> n*2)
        //                  .reduce(0, (c,e) -> c+e);
        
        // System.out.println(result);
        // The benefits of using stream is, it provides a lot of methods to use with.

        // Function interface is of 2 types used to understand working of .map().

        // Function<Integer, Integer> fun = new Function<Integer,Integer>() {

        //     @Override
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }
            
        // };

        Function<Integer, Integer> fun = n -> n*2;

        
        int result = nums.stream()
                         .filter(p)
                         .map(fun)
                         .reduce(0, (c,e) -> c+e);
        
        System.out.println(result);



        // Sow to get a sorted value using stream
        
        Stream<Integer> sortedValue = nums.stream()
                         .filter(p)
                         .sorted();
        
        sortedValue.forEach(n -> System.out.println(n));
        
    }
}

