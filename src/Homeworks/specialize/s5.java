package Homeworks.specialize;

import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {

        // 5- Write a program to find the factorial value of any number entered through the scanner class.
        //Example:
        //number:7
        //factorial:1*2*3*4*5*6*7=5040
        //output should be == 5040
        //number:6
        //factorial:1*2*3*4*5*6=720
        //output should be == 720


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 1;

        for (int i = 1; i < x; i++) {
            y = y * i;
        }
        System.out.println(y);






    }
}
