import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


class Student{
    int age;
    String name;


    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    
}

public class DemoII {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);


        // for(int n : nums){
        //     System.out.print(n + " ");
        // }

        // nums.forEach(n -> System.out.println(n));

        Consumer<Integer> con =  n -> System.out.println(n);

        nums.forEach(con);

        // Map<String, Integer> students = new HashMap<>();
        // students.put("Aditya",10);
        // students.put("Aayush",04);
        // students.put("Krishna",56);
        // students.put("Vinayak",63);
        // students.put("Krishna",90);

        // // System.out.println(students.get("Aayush"));
        
        // //To get all the keys we use keySet(). 
        // System.out.println(students.keySet());

        // for(String key : students.keySet()){
        //     System.out.println(key + " : " + students.get(key));
        // }

        Comparator com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if(i.age > j.age){
                    return 1;
                }
                return -1;
            }
        };


        List<Student> studs = new ArrayList<>();
    
        studs.add(new Student(22, "Aditya"));
        studs.add(new Student(19, "Krishan"));
        studs.add(new Student(24, "Vinayak"));
        studs.add(new Student(21, "Ayush"));

        Collections.sort(studs, com);

        for(Student s : studs)
            System.out.println(s);

    }
}
