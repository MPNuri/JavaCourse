package Day10;

import java.util.Random;

public class _03_IfStatement {
    public static void main(String[] args) {

        // WE ARE GONNA SEE IF AND ELSE COMMAND PROGRAMING

        Random rndm = new Random();

        int a = rndm.nextInt(2,6);
        int b = rndm.nextInt(2,7);
        int c = rndm.nextInt(8);

        System.out.println(a+" "+b+" "+c);

        //inside parentheses weare gonna put our conditions
        // DO NOT FORGET CURLY BRASES
        // If if condition is true we are  going to execute our code
        if (a == b)  {
            System.out.println("A equals B");


            // in this example our if code is not true so code will not run we need else here
            if (a == c);

            System.out.println("A equals C");

        }























    }
}
