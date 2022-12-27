package Day17.ArrayMethods;

import java.util.Arrays;

public class _01_Array_to_String {
    public static void main(String[] args) {

        /**                  VERY IMPORTANTEE                  **/

        int[] arrayOfInts = new int[100];
        String[] a = new String[2];
        a[0] = "dsd";
        a[1] = "ds";

        System.out.println(Arrays.toString(a));

        arrayOfInts[0] = 100;
        arrayOfInts[99] = 9999;



        // to print whole array we use Array.ToString method
        System.out.println(Arrays.toString(arrayOfInts));







    }
}
