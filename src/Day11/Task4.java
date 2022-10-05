package Day11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your string");
        String string1 = scanner.nextLine();

        if (string1.contains("a && b") && string1.contains("b")) {
            System.out.println("The input contains both a and b");
        } else if (string1.contains("a")) {
            System.out.println("The input contains only a");
        } else if (string1.contains("b")) {
            System.out.println("The input only contains b");
        } else {
            System.out.println("Does not contains neither a nor b");
        }

    }

}

