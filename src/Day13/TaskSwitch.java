package Day13;

import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number");
        int numberfromUser = scanner.nextInt();

        switch (numberfromUser) {

            case 5:
                System.out.println("ok");
                break;
            case 3:
                System.out.println("maybe");
                break;
            case 1:
                System.out.println("no");
                break;
            default:
                System.out.println("dunno");

        }



    }
}
