package Day15;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {


        // in FOR loop always use int

        Scanner scanner = new Scanner(System.in);
        System.out.println("Users String");
        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }










    }
}
