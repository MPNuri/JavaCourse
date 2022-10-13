package Day24;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task1_Set {
    public static void main(String[] args) {


        // Task
        // Part 1:
        // create a String[] array of student name in your group, duplicate some names
        // add all the elements from String[] to Set<String>


        String[] array = {"Mithat", "Gonul", "Major", "Halit", "Mithat"};

        Set<String> setToArray = new HashSet<>(Arrays.asList(array));

        for (int i = 0; i < array.length; i++) {
            setToArray.add(array[i]);
        }

        Collections.addAll(setToArray, array);


        System.out.println(setToArray);





    }
}
