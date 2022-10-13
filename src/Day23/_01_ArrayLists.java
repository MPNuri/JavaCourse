package Day23;

import java.util.HashSet;
import java.util.Set;

public class _01_ArrayLists {
    public static void main(String[] args) {

        // you did not watch today s lesson spend some time for this day


        // if we want to print all the elements from lists we need to use index numbers
        // but sets have no index numbers, so we are going to so how this works for Sets

        // there is a special loop for sets


        Set<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        // we are printing element from strings. we can use this Each Loop on all types
        for (String element : strings)
            System.out.println(element);


        int array[] = {7, 4, 9, 6, 8, 3, 1};
        for (int element1 : array)
            System.out.println(element1);








    }
}
