package Day12;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number between 0 - 5");
        int usernumber05 = scanner.nextInt();

        int randomnumber1 = (int) (Math.random() * 6);
        System.out.println(randomnumber1);



        if (usernumber05 >= 0 && usernumber05 <= 5) {

            if (usernumber05 == randomnumber1) {
                System.out.println("you won");
            } else  {
                System.out.println("you lost");
            }
        } else {
            System.out.println("Invalid");
        }













    }
}
