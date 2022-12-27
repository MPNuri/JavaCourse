package Java_Interview_3;

import java.util.Scanner;

public class Star_Side_Triangle {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int userNumber = scn.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 3)
                    System.out.print("**");
                else
                    System.out.print("*");            }
            System.out.println();
        }
        for (int i = userNumber-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (i == 3)
                    System.out.print("*");
                else
                    System.out.print("*");
            }
            System.out.println();
        }












    }
}
