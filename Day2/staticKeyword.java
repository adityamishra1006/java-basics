class Mobile {
    String brand;
    int price;
    static String name;
    // Static is shared by all objects. If wemake changes to any one then it will affect others

    static{
        name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile(){
        brand = "";
        price = 15000;
        System.out.println("In Constructor");
    }
    
    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show1(Mobile obj){
        // We can only use static varibale inside static methods and not use non static non variable in static variable.

        System.out.println("in static method -- ");

        // If we have a object reference then we can use non static varibale in static methods

        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}

// The static block is called first.
// Java do not follow the order

public class staticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();

        obj1.brand = "Apple";
        obj1.price = 70000;
        Mobile.name = "Smart Phone";
        
        Mobile obj2 = new Mobile();

        obj2.brand = "Samsung";
        obj2.price = 30000;
        Mobile.name = "Smart Phone";

        // Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        // Mobile.show1(); 
        //We can call static method directly with the class name. 




        // Class.forName("Mobile");
    }
}

// Why is main function static?
// It is the entry point of any program and if we not declate it as static it will need 
// an object of the class to call the main method. But we do not have any object of
// the class at the time of execution of the program. So we declare it as static.
