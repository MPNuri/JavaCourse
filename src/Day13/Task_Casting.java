package Day13;

import java.util.Scanner;

public class Task_Casting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 2 string as Number : ");

        // ONLY NUMBERS CAN BE CONVERTED

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        int int1 = Integer.parseInt(string1);
        int int2 = Integer.parseInt(string2);

        System.out.println(int1 + int2);





    }
}
