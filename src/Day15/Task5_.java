package Day15;

import java.util.Scanner;

public class Task5_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your text ");
        String string1 = scanner.nextLine();

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == ' ' || string1.charAt(i) == ';')
                continue; // continue keyword here will not let the code print space or ;
            System.out.println(string1.charAt(i));





        }






    }
}
