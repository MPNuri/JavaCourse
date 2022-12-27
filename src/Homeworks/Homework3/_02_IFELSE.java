package Homeworks.Homework3;

import java.util.Scanner;

public class _02_IFELSE {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("your doubles");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        if (int1>int2) {
            System.out.println("int 1 is greater than int 2");
        } else if (int2>int1){
            System.out.println("int 1 is smaller than int 2");
        } else {
            System.out.println("please enter 2 different values");
        }








    }
}
