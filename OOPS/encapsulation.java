// everytime you create an instance varibale make it private instance variable is a variable that is defined inside a class but outside any method or block. It is a member of the class and is associated with an instance of the class, hence the name "instance variable".

// varibale must be accessible to other but not directly, it can be accessible with methods

class Human{
    private int age = 22;
    // private means this varibale is only accessible in the same class
    private String name = "Aditya";

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void show(){
        System.out.println("Name: "+name);
    }
    
}

public class encapsulation {
    // concepts of capsule
    // Keeping it close and from outside no one can use it
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(24); 
        obj.setName("Aayush");

        System.out.println(obj.getName() + " : " + obj.getAge());


        // Anonymus Object
        new Human().show();
        // We cannot use this line once again
    }
}
