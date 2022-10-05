package Day12;

import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("please type your temperature here");
        int temperature = scanner.nextInt();


        String weather = temperature < 15 ? "Cold weather" : "Good weather";
        System.out.println(weather);



















    }
}
