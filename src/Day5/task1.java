package Day5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your hometown");

        String answer = scanner.nextLine();
        System.out.println("Your hometowm is : " + answer);

// in 3rd row dont forget scanner.nextline(); method

        System.out.println("please enter your first int");
        int number1 = scanner.nextInt();
        System.out.println("your first int is: " + number1);

        System.out.println("please enter your second int");
        int number2 = scanner.nextInt();
        System.out.println("your second int is: " + number2);

        int number3 = number1 + number2;
        System.out.println("calculation: " + number3);







    }
}
