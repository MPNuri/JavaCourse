package Day12;

import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tempreture here");

        double temperature = scanner.nextDouble();


        if (temperature > 0) {
            System.out.println("please enter atmospheric number");
            double atmospheric = scanner.nextDouble();

            if (atmospheric > 5) {
                System.out.println("ok");
            } else {
                System.out.println("not ok");
            }
        }else {
            System.out.println("Weather too cold to check");
        }














    }
}
