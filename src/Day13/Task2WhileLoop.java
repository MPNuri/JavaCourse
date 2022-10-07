package Day13;

import java.util.Scanner;

public class Task2WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter limit");
        int limit = scanner.nextInt();

        int counter = 0;
        int total = 0;

        while (counter < limit) {
            total = total + counter;
            counter++;
        }
        System.out.println(total);





    }
}
