package Day15;

import java.util.Scanner;

public class _02_BreakKeyword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Input: ");
            String userinput = scanner.nextLine();

            if (userinput.equals("stop")) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
                  // this will print until at 0123456789.
            if (i==5) {
                break;
            } // break keyword will stop the code at i = 5, answer = 012345

        }










    }
}
