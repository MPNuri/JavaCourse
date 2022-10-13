package Day26;

import java.util.ArrayList;
import java.util.Collections;

public class _01_2D_Collections {
    public static void main(String[] args) {


        // from day 18 we have seen to store 2 arrays inside one array
        // just like below
        int[][] twoArrays = new int[2][2];

        twoArrays[1][1] = 11;

        // let's see for Arraylists
        // Arraylist inside arraylist and the objector.

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        ArrayList<String> cars = new ArrayList<>();
        Collections.addAll(cars,"Honda", "Audi","Merco");

        ArrayList<String> motors = new ArrayList<>();
        Collections.addAll(motors,"Honda", "Suzuki", "Yamaha");

        Collections.addAll(listOfLists, cars, motors);
        System.out.println(listOfLists);











    }
}
