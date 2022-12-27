package Day17.ArrayMethods;

import java.util.Arrays;

public class _04_ArraysSort {
    public static void main(String[] args) {

        // to be able to find the smallest value of the array we can use (Arrays.sort) method

        int[] arrayx = new int[8];

        arrayx[0] = 31;
        arrayx[1] = 9;
        arrayx[2] = 78;
        arrayx[3] = 33;
        arrayx[4] = 8461;
        arrayx[5] = 437;
        arrayx[6] = 4658;
        arrayx[7] = 643;

        System.out.println(Arrays.toString(arrayx));

        // lets find smallest array
        System.out.println(arrayx[1]);

        Arrays.sort(arrayx); // this here is putting them in order

        System.out.println(Arrays.toString(arrayx));

        // After changing th order with Arrays.sort() lets find the smallest number
        System.out.println(arrayx[0]);

        System.out.println(arrayx.length);

        // or even we can do

        int maxNumber = arrayx[0];

        for (int i = 0; i < arrayx.length; i++) {
            if (maxNumber<arrayx[i]){
                maxNumber = arrayx[i];
            }
        }
        System.out.println(maxNumber);









    }
}
