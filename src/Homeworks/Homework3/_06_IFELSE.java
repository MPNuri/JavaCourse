package Homeworks.Homework3;

import java.util.Scanner;

public class _06_IFELSE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.contains("€")) {
            System.out.println("This is euro");
        } else if (str.contains("$")) {
            System.out.println("This is dollar");
        } else {
            System.out.println("no money");
        }







    }
}
