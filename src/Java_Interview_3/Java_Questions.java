package Java_Interview_3;

import java.util.Scanner;

public class Java_Questions {
    public static void main(String[] args) {


        // for 2-4-8-16-32
        int f = 1;
        int total = 1;

        for (int i = 0; i < 10; i++) {
            total = f + f * total;
            System.out.print(" " + total);
        }


        System.out.println();

        // this is how we solve fibonnacchi
        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;

        }

        System.out.println();


        int number = 741253;
        int reversedNumber = 0;

        while (number > 0) {

            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder; // this one makes the number reversed

            number = number / 10; // this makes number to 0
        }
        System.out.println(reversedNumber);


        // string reverser

        System.out.println(" ");

        String str = "yoldas";
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            str2 = str.charAt(i) + str2;
        }

        System.out.println(str2);


        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();







    }
}