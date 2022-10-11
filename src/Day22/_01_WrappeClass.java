package Day22;

import java.util.Arrays;

public class _01_WrappeClass {
    public static void main(String[] args) {


        // if we want our primitive type to act like non-primitive
        // we use "Wrapper Class"

        int a = 5;
        int[] array1 = new int[3];

        System.out.println(Arrays.toString(array1)); // 0 also do not forget array printing method
        //primitive types
        // 1-) do not have any methods
        // 2-) cannot have null value
        // 3-) starts lowercase

        String str = "TechnoStudy";
        Integer[] array2 = new Integer[3];
        array2[0] = 2;
        System.out.println(Arrays.toString(array2)); // [2, null, null]
        //  Integer.parseInt(number);
        // Reference Types
        // 1-) can have methods
        // 2-) can have null value
        // 3-) starts uppercase


    }





















}
