package Homeworks.Homework3;

import java.util.Scanner;

public class _01_IFELSE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("your doubles");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        if (double1>double2) {
            System.out.println("double 1 is greater than double 2");
        } else if (double2>double1){
            System.out.println("double 2 is greater than double 1");
        } else {
            System.out.println("please enter 2 different values");
        }



    }
}
