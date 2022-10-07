package Day13;

import java.util.Scanner;

public class Task_IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int intNumber1 = scanner.nextInt();
        int intNumber2 = scanner.nextInt();

// study this way you could have done with else if
        if (intNumber1 != intNumber2) {

            if (intNumber1 > intNumber2) {
            System.out.println("The greatest number is" + intNumber1);
               } else
                   System.out.println("the greater number is" + intNumber2);


        }





    }
}
