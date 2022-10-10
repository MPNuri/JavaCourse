package Day18;

import java.util.Arrays;

public class _02_ArrayRecap {
    public static void main(String[] args) {


        String[] arrayOfCars = {"Tesla", "Toyota", "Lexus", "Porsche"};

        System.out.println(arrayOfCars[0]);
        System.out.println(arrayOfCars[1]);
        System.out.println(arrayOfCars[2]);
        System.out.println(arrayOfCars[3]);

        for (int i = 0; i < arrayOfCars.length; i++ ) {
            System.out.println(arrayOfCars[i]);
        }



        int[] randomNumbers = new int[5];
        randomNumbers[0] = (int) (Math.random()*50);
        randomNumbers[1] = (int) (Math.random()*50);
        randomNumbers[2] = (int) (Math.random()*50);
        randomNumbers[3] = (int) (Math.random()*50);
        randomNumbers[4] = (int) (Math.random()*50);

        // as you see there is only index numbers are changing
        // so there is a loop here.
        // instead of typing one by one, our goal is to initialize the random values
        // just like above -->


        // this here is for giving random values from Math.random
        for (int i = 0; i<= randomNumbers.length - 1; i++) {
            randomNumbers[i] = (int) (Math.random()*500);
        }

        /* this here is for printing the random given values*/
        for (int i = 0; i< randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }



    }
}
