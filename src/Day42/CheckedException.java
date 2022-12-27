package Day42;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {


        // other than unchecked exception (out of memory error, stack overflow error) everything is checked exception.
        // checked exception gives warning during coding.
        // we have to solve before we continue coding.
        // in checked exception java force us to check the code, but unchecked exception does not.


        try {
            FileReader fileReader = new FileReader("murilllooo");
        } catch (FileNotFoundException ex) {
            System.out.println("please enter the file name correctly");
        }














    }
}
