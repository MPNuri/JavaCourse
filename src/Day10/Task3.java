package Day10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your integer here");
        int int1 = scanner.nextInt();

        if (int1 > 0) {
            System.out.print("positive");
        }

        if (int1 == 0) {
            System.out.println("zero");
        }
        if (int1 < 0) {
            System.out.println("Negative");
        }


    }
}
//perfectoooo
