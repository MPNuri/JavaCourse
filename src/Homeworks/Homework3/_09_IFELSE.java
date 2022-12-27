package Homeworks.Homework3;

import java.util.Scanner;

public class _09_IFELSE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intx = scanner.nextInt();

        if (intx % 4 == 3) {
            System.out.println("Reminder is 3");
        } else if (intx % 4 == 2) {
            System.out.println("Reminder is 2");
        } else if (intx % 4 == 1) {
            System.out.println("Reminder is 1");
        } else {
            System.out.println("perfect fit, Reminder is o");
        }


    }
}
