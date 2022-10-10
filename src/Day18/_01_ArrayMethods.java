package Day18;

import java.util.Arrays;

public class _01_ArrayMethods {
    public static void main(String[] args) {

    int[] myArray; //array declaration
    myArray = new int[5]; // Array initialized with size 5

        int[] array = new int[3]; // Declared and initialized Array

        System.out.println(Arrays.toString(array)); // [0, 0, 0, 0, 0] = auto values

        int[] ages = new int[5];
        ages[0] = 10; // this is updating the value at index 0
        ages[1] = 14;
        ages[2] = 45;
        ages[3] = 7;
        ages[4] = 26;

        System.out.println(ages); // you cannot print the array directly see below
        System.out.println(Arrays.toString(ages)); // this is how we print
        System.out.println(ages[1]); // this is how to print individually

        int someone = ages[3]; // initialize variable with element index 3 for ages array


        String[] countries = new String[5];
        countries[0] = "United Statws";
        countries[1] = "France";
        countries[2] = "Mexico";
        countries[3] = "Turkey";

        System.out.println(Arrays.toString(countries));

        String[] programing = {"java", "phyton", "c#"};
        programing[2] = "c";

        //in order to find the size of the array we use array.length
        System.out.println(programing.length);

        String[] names = {"john", "mark", "emily", "amy", "halit"};

        int lengthOfNames = names.length;
        int lastIndexOfnNames = (lengthOfNames - 1); // because indexes start counting from 0

        System.out.println(lastIndexOfnNames);




    }

}
