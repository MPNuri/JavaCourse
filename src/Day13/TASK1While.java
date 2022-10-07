package Day13;

import java.util.Scanner;

public class TASK1While {
    public static void main(String[] args) {



        int userInput = 0; //users input numbers
        int total = 0;     //shows how many steps you are taking

        while (userInput < 6) {
            total = total + userInput;
        userInput++;
        }


        System.out.println(total);



    }
}
