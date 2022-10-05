package Day11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please Enter your number");
        int int1 = scanner1.nextInt();

        if (int1 > 100) {
            System.out.println("It is bigger than 100");
        }
        // you do not enter a new thing only else is enough
        else   {
            System.out.println("number is equal or smaller than 100");
        }






    }
}
