package Homeworks.Homework3;

import java.lang.management.MemoryManagerMXBean;
import java.util.Scanner;

public class _04_IFELSE {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number==0) {
            System.out.println("Im neutral");
        } else if (number>0) {
            System.out.println("Im positive");
        } else {
            System.out.println("Im negative");
        }


    }
}
