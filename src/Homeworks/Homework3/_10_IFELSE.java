package Homeworks.Homework3;

import java.util.Scanner;

public class _10_IFELSE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        if (number>number2) {
            System.out.println("Hello World");
        } else if (number<number2) {
            System.out.println("Not Hello World");
        } else {
            System.out.println("I love Java");
        }


    }
}
