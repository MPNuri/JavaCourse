package Day22;

import java.util.ArrayList;

public class Task2_ArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 6; i++)
            integerArrayList.add((int) (Math.random() * 10));

        System.out.println(integerArrayList);

        for (int i = 0; i < integerArrayList.size(); i++) { // replacing the arraylist each values to 5 by using .set() method
            integerArrayList.set(i,5);
        }

        System.out.println(integerArrayList);

    }
}
