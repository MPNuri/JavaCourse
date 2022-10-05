package Day11;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        /*
        if temp > 30 print hot
        if temp =< 18 && 30 >= print good weather
        if temp <18 print cold
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your Temp");
        int temp1 = scanner.nextInt();



        if (temp1 > 30) {
            System.out.println("Hot weather");
        } else if (temp1 < 30 && temp1 > 18) {
            System.out.println("Good weather");
        } else{
            System.out.println("Cold weather");
        }


    }
}
