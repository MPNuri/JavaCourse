package Day42.MultipleExceptionHandling;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("please enter a number");
        String number = scn.nextLine();

        System.out.println("your entry = " + number);


        try {
            int numbers = Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            System.out.println("you must enter number up to 2147483647");
        }





    }
}
