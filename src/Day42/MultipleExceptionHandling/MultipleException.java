package Day42.MultipleExceptionHandling;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleException {
    public static void main(String[] args)  {

        try {
            FileReader fileReader = new FileReader("Murii.txt");
            fileReader.read();
        } catch (FileNotFoundException ex) {
            System.out.println("file does ot exist");
        } catch (IOException ix) {
            System.out.println("file is not able be red");
        }



        // here we have an object referenced from FileReader class and a objected method
        // we need to have 2 try catch block to prevent crashing the application.
        // so we use 2 different type of exception block as we see above.













    }
}
