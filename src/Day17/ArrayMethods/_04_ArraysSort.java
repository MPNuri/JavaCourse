package Day17.ArrayMethods;

import java.util.Arrays;

public class _04_ArraysSort {
    public static void main(String[] args) {

        // to be able to find the smallest value of the array we can use (Arrays.sort) method

        int[] arrays = new int[8];

        arrays[0] = 31;
        arrays[1] = 9;
        arrays[2] = 78;
        arrays[3] = 33;
        arrays[4] = 8461;
        arrays[5] = 437;
        arrays[6] = 4658;
        arrays[7] = 643;

        System.out.println(Arrays.toString(arrays));

        // lets find smallest array
        System.out.println(arrays[1]);

        Arrays.sort(arrays); // this here is putting them in order

        System.out.println(Arrays.toString(arrays));

        // After changing th order with Arrays.sort() lets find the smallest number
        System.out.println(arrays[0]);











    }
}
