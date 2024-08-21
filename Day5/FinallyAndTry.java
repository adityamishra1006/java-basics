public class FinallyAndTry {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        try{
            j = 18/i;
        }
        catch(Exception e){
            System.out.println("Exception caught");
            // System.out.println("Inside try block");
        }
        finally{
            System.out.println("Inside try block");
        }
    }
}

// Why is finally used?
// the finally block is used in conjunction with try and catch blocks to handle exceptions. The finally block is executed regardless of whether an exception is thrown or not.
