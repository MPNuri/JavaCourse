package Java_Interview_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplication {
    public static void main(String[] args) {
        // Task
        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have
        // find out what are the duplicated values

        Set<Integer> nonDuplication = new HashSet<>();
        Set<Integer> newNumbers = new HashSet<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(3);


        for (Integer element: numbers) {
            if (!nonDuplication.add(element)){
                newNumbers.add(element);
            }
        }

        System.out.println("total duplication = "+ (numbers.size() - nonDuplication.size()));
        System.out.println(newNumbers);








    }
}
