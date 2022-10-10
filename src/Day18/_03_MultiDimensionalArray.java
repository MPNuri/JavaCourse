package Day18;

import java.util.Arrays;

public class _03_MultiDimensionalArray {
    public static void main(String[] args) {

        // 1 dimensional array
        int[] arrayOfOddNumbers = {1,3,5,7,9};
        int[] arrayOfEvenNumbers = {2,4,6,8,10};


        int[][] listOfLists = {arrayOfEvenNumbers, arrayOfOddNumbers};
        System.out.println(Arrays.deepToString(listOfLists));

        /**System.out.println(Arrays.toString(listOfLists)); // this will only print the place of the array variables**/

        // 2 dimensional array
        int[][]  arrayOfARRAYS = { {1,3,5,7,9}, {2,4,6,8,10} };
        // ARRAYS OSF ARRAY WHICH IS ABLE TO STORE 2 ARRAY INSIDE ITSELF AS ARRAY

        System.out.println(Arrays.deepToString(arrayOfARRAYS));


       // {{0,0}, {0,0}, {0,0}, {0,0}, {19,6}}
        int[][] multiDArrays = new int[4][2]; // 6 is our element
        // bigger elements represents bigger indexes
        // smaller elements represents smaller indexes

        multiDArrays[0][0] = 11; // first index from first
        multiDArrays[0][1] = 22; // second index from first


        int[][] multiDArray = { {4, 5, 6}, {1, 2, 3}, {8, 9} }; // new int[3][3]

        System.out.println(multiDArray[1][1]);  // answer = 2
        System.out.println(multiDArray[0][2]);  // answer = 6
        System.out.println(Arrays.deepToString(multiDArray));





    }
}
