package Homeworks.Homework3;

import java.util.Scanner;

public class _05_IFELSE {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double double1 = scanner.nextDouble();

        if (double1 % 40 == 0 ) {
            System.out.println("able to divide by 5 and 8");
        } else if (double1 % 21 == 0){
            System.out.println("able to divide by 3 or able to divide by 7");
        } else {
            System.out.println("not divisible by neither 40 nor 21");
        }


    }
}
