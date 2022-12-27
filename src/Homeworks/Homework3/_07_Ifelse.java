package Homeworks.Homework3;

import java.util.Scanner;

public class _07_Ifelse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.equals("Orange") && str.length() == 6) {
            System.out.println("Orange has six letters");
        } else if (str.equals("Apple") && str.length() == 5) {
            System.out.println("Apple has five letters");
        } else if (str.contains("Orange") && str.length()>10) {
            System.out.println("String contains orange and length is more then 10");
        }


    }
}
