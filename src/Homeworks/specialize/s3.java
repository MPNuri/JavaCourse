package Homeworks.specialize;

import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {


        //3- Determine and print the number of times
        //the character ‘b’ appears in the input entered by the user.
        //Example Input: Test
        //b: 0
        //output should be 0
        //Example Input: bucket
        //b:1
        //output should be 1
        ////hint: .charAt, length(), for, index, counter,

        Scanner scn = new Scanner(System.in);
        String alpha = scn.nextLine();

        int x = 0;

        for (int i = 0; i < alpha.length(); i++) {
           if (alpha.charAt(i) == 'b') {
                x++;
            }
        }
        System.out.println("total b used in terminal by user = " +x);




    }
}
