package Day24;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task2_Set {

    /**  work on this by your self 5/31/2022 second class
     *
     */

    // Part 2:
    // create a method that takes set and varargs of String and add all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        addAll(hashSet,"murillo", "nurillo");
        System.out.println(hashSet);



    }

    public static void addAll(HashSet<String> hashSet, String... elementsToAddSet) {

        Collections.addAll(hashSet, elementsToAddSet);

    }




}

