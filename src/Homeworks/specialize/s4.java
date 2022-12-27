package Homeworks.specialize;

import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {

        //Given an int ,
        //if the int is 1 print monday
        //if the int is 2 print tuesday
        //if the int is 3 print wednesday
        //if the int is 4 print thursday
        //if the int is 5 print friday
        //if the int is 6 print saturday
        //if the int is 7 print sunday
        //if the number more than 8 print "this is not a valid day"
        //NOTE : USE A SWITCH STATEMENT WHILE DOING THIS EXERCISE

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x) {
            case 8:
                System.out.println("this is not possible");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sunday");
        }







    }
}
