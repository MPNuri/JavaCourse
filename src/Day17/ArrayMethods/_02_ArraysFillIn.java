package Day17.ArrayMethods;

import java.util.Arrays;

public class _02_ArraysFillIn {
    public static void main(String[] args) {


        int[] number = new int[10];

        number[2] = 99;

        System.out.println(Arrays.toString(number));


        //////////////////////////////////////////
       //it will fill the array with "10" values even the index 2(99)

        int[] number10 = new int[10];

        Arrays.fill(number10,10);

        System.out.println(Arrays.toString(number10));






    }
}
