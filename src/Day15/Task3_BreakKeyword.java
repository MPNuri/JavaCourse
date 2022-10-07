package Day15;

import java.util.Scanner;

public class Task3_BreakKeyword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number = ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            if (i > 9) {
                System.out.print(number + " ");
                break;
            }
        }













    }
}
