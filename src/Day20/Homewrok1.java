package Day20;

import java.util.Arrays;

public class Homewrok1 {

   /*
    ||This Part Should be in Main Method||

    -Create an array of size 5, assign some random values from 1 to 10
    -(use random class and for loop to assign values)


     ||You should create public static void methods for each (Parameter should be int Array for methods)||

     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
     -2-Create a method that prints the sum of an array
     -3-Create a method that prints the max element of an array

      P.S: Return type should be void because we are not returning anything just printing
    */


    public static void main(String[] args) {

    int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {   // In this line; instead of writing each array one by one we use for loop
            intArray[i] = (int) ((Math.random() * 10) +1 ); //intArray[i] burda sirayla 1. 2. 3. 4. ve besinci random numarayi print ediyor
        }


        // and now all these values needs to be printed. So we are going to use for loop again. to be able to print.
        // so instead of writing for loop again and again and again we use a method that will help us to print.
        //this method is kinda printer method as you see from its name. It will save us time and our code will look cleaner.

        printAnArray(intArray); // but we need other methods to fasten our hand
        sumOfArrays(intArray);
        MaxElement(intArray);
    }

    public static void printAnArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void sumOfArrays(int[] arrs) {
        int sum = 0;
        for (int i = 0; i < arrs.length; i++)
            sum = sum + arrs[i];     // at the end sum will be equal to = arrs[1] + arrs[2] + arrs[3] + arrs[4] + arrs[5]
            // and then we will move this to main method. In main METHOD section these arrs will get their values.
            // so sum for example will be = 2 + 3 + 4 + 5 + 6 = 19
        System.out.println("Sum equation equals to = " +sum);

    }

    public static void MaxElement(int[] arrss) {
        int maxvalue = arrss[0];
        for (int i = 0; i < arrss.length; i++) {
            if (arrss[i] > maxvalue) {
                maxvalue = arrss[i];
            }


        } System.out.println(maxvalue);

    }


}