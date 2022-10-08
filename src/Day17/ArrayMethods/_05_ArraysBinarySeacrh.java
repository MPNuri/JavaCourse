package Day17.ArrayMethods;

import java.util.Arrays;

public class _05_ArraysBinarySeacrh {
    public static void main(String[] args) {

        // this method search for the index number from its value.
        // make sure you have the index you are binary searching, or java will have run time exception

        int [] numbers = {12, 5, 89, 646, 84};

        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers,12));










    }
}
