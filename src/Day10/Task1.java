package Day10;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        // IN THIS TASK YOU DID SCANNER METHOD, SOUT METHOD, STRING METHOD, BOOLEAN METHOD AND CONTAINS. METHOD CORRECTLY

        /*THING YOU WERE MISSED
        1-) ! IF TASK ASKS NOT SHOW SOMETHING DONT FORGET TO USE !(!!!!!)
        2-) IF YOU NEED TO CHECK 2 OR MORE DIFFERENT VARIABLE USE &&
        3-) OR OPERATOR ||
        4-) AND OPERATOR
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER A STRING");

        String newString = scanner.nextLine();


        //1-)

        boolean containsAandB = newString.contains("a") && newString.contains("b");
        System.out.println(containsAandB);

        //2-)

        boolean containsCandB = newString.contains("a") || newString.contains("c");
        System.out.println(containsCandB);

        //3-)

        boolean notContainsC = !newString.contains("c");
        System.out.println(notContainsC);

        //4-)

        boolean notContainsCandD = !newString.contains("c") && !newString.contains("d");
        System.out.println(notContainsCandD);















    }
}
