package Day24;

import Day39.Classe.Abstract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task3_Add {
    public static void main(String[] args) {

        // Task
        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have
        // find out what are the duplicated values

        ArrayList<Integer> numbersArray = new ArrayList<>();

        numbersArray.add(1);
        numbersArray.add(3);
        numbersArray.add(1);
        numbersArray.add(2);
        numbersArray.add(4);
        numbersArray.add(5);
        numbersArray.add(3);

       HashSet<Integer> integerHashSet = new HashSet<>();
       ArrayList<Integer> duplicatedValues = new ArrayList<>();

        for (int i = 0; i <numbersArray.size() ; i++) {
            integerHashSet.add(numbersArray.get(i));
        }

        System.out.println(numbersArray.size() - integerHashSet.size());
        System.out.println(integerHashSet);
















    }
}
