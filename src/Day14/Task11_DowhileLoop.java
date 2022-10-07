package Day14;

import java.util.Scanner;

public class Task11_DowhileLoop {
    public static void main(String[] args) {


     /* int correctPin = 8787;

       Scanner scan = new Scanner(System.in);
        System.out.println("enter your pin");
        int pinNumber = scan.nextInt();

        while (pinNumber != correctPin) {
            System.out.println("wrong password please, try again");
            pinNumber = scan.nextInt();
        }
        System.out.println("welcome back");
*/
/////////////////////////////////////////////////////////////////////////////////////

        int correctpin1 = 8787;

        Scanner scanner = new Scanner(System.in);

        int pinNumber2;

        do {
            System.out.println("Please enter your password");
            pinNumber2 = scanner.nextInt();
        } while (correctpin1 != pinNumber2);

        System.out.println("welcome back");













    }
}
