package Day22;

import java.util.ArrayList;

public class Task1_ArrayLists {
    public static void main(String[] args) {


        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for (int i = 0; i < 7; i++)                            // here list of arraylist is created for 7 indexes
            doubleArrayList.add(Math.random() * 100);

        for (int i = 0; i < doubleArrayList.size(); i++)      // now we are numerating the created arraylist size of 7
            System.out.println(doubleArrayList.get(i));




    }
}
