

//Creating own exception 
class AdityaException extends Exception{

    public AdityaException(String str){
        super(str);
    }

}

public class exceptionsAndErrors {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        int[] arr = new int[5];

        try 
        {
            j = 18/i;
            if(j == 0) throw new AdityaException("I don't want to print zero");
        }
        catch(AdityaException e){
            j = 18/1;
            // System.out.println("Cannot divide by 0");
            System.out.println("This is the default output " + e);
        }
        // catch(ArithmeticException e){
        //     j = 18/1;
        //     // System.out.println("Cannot divide by 0");
        //     System.out.println("This is the default output" + e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Stay in your limit.");
        // }

        // Always keep this exception in the bottom of all the exception handling catch blocks, If we keep this above all then it will handle all the other exceptions too, so dedicated exceptions will not work. 
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

// Types of Error
// 1. Compile Time Error : 
// Generally identifies at the time of compilation, they are easy to solve


// 2. Runtime Error
// Identifies at the time when code runs, after successfull compilation
// they stops the application


// Exceptions are generally run time error


// 3. Logical Error
// There is not compile time or run time error, they are often called bugs



// hierarechy of the class from object class toall the errors and exceptions