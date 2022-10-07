package Day15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("your limit = ");

        int limit1 = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= limit1; i++) {
            sum += i;

        }

        System.out.println(sum);
    }
}
