package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        // Task
        // Create an int array with the size of 5
        // Initialize elements of Array by getting the values from user


        int[] myIntArray = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <myIntArray.length; i++) {
            myIntArray[i] = scanner.nextInt();
        }
            System.out.println(Arrays.toString(myIntArray));









    }
}
