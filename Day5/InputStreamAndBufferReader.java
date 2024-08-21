import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamAndBufferReader {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        BufferedReader br = null;
        try{
            br = new BufferedReader( new InputStreamReader(System.in));

            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        // The above commented statements can be written as
        
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }

        // The advantage of above representation is once the execution of try gets over the resourse will be closed automatically, we do not need finally block there.


        finally{
            br.close();

            // The finally block is used to close the resources, connections. It is meant for closing them.
        }
    }
}
