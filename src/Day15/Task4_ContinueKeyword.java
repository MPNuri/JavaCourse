package Day15;

import java.util.Scanner;

public class Task4_ContinueKeyword {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("your number = ");
        int number1 = scanner.nextInt();

        for (int i = 0; i < number1; i ++) {

           if (i % 2 == 0)
               continue; // will cut off the line for even numbers
            System.out.println(i);
        }














    }



}
