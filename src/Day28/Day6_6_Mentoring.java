package Day28;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day6_6_Mentoring {
    public static void main(String[] args) {


        //Create a java class with a Scanner class and get people names from the user.
        //Keep getting values until the input is "STOP"
        //Store all of these values inside a Set,
        //print
        //"Your names list consists of: [Alex, Angela, Brian..."

        // do this by yourself


        boolean keepWorking = true;
        Scanner scanner = new Scanner(System.in);
        String x;
        Set<String > xy = new HashSet<>();

        while (keepWorking)  {
            x = scanner.nextLine();
            if (!x.equals("Stop"))
                xy.add(x);
            else
                break;
        }

        System.out.println("total names = "+xy);
















    }
}
