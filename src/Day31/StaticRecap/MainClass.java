package Day31.StaticRecap;

import Day31.StaticRecap._01_UsefulMethods;

public class MainClass {
    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5,6,7,8,9};

        _01_UsefulMethods.printArray(numbers); // this one is static

        _01_UsefulMethods um = new _01_UsefulMethods(); // this one is non-static
        um.printArrayByHand(numbers);





    }
}
