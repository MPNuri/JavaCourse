package Day42;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {

        String str = "techno study";

        Scanner scn = new Scanner(System.in);
        int numberOfIndex = scn.nextInt();

        try {
            for (int i = 0; i <numberOfIndex ; i++)
                System.out.println(str.charAt(i));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("not enough indexes");
        }

        // unchecked errors happen when we execute the code
        // unchecked exception do not give compile error
        // try-catch block helps us to check the coding phase without crashing it





































    }
}
