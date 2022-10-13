package Day24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _02_Set {
    public static void main(String[] args) {

        // CANNOT BE UPDATED
        // CANNOT have PRIMITIVE data type

        // creating Set
        Set<Integer> integerSet = new HashSet<>();

        // adding elements into Set

        integerSet.add(10);
        integerSet.add(15);
        integerSet.add(20);
        integerSet.add(10); // there will only be one 10 printed

        System.out.println(integerSet);


        // set.size() --- checks the length of the size
        System.out.println("size " + integerSet.size());

        // set.isEmpty() --- checks if the set empty or not
        System.out.println("is set empty " + integerSet.isEmpty());

        // set.contains(10) --- returns boolean, also looks for value not index
        System.out.println("check if set contains 10 " + integerSet.contains(10));

        // set.remove(object) --- only objects since set methods are not printed in order (no indexes)
        integerSet.remove(20);
        System.out.println(integerSet);

        // set.clear() --- removes all the elements from our
        integerSet.clear();
        System.out.println(integerSet);







    }
}
