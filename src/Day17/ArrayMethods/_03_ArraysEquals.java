package Day17.ArrayMethods;

import java.util.Arrays;

public class _03_ArraysEquals {
    public static void main(String[] args) {

        // equals method checks if both arrays have the same values in same order

        int[] firstarray = {1, 3, 5};
        int[] secondarray = {1, 3, 5};
        int[] thirdarray = {3, 1, 5};

        System.out.println(Arrays.equals(firstarray, secondarray)); // true
        System.out.println(Arrays.equals(firstarray, thirdarray));  // false






    }
}
