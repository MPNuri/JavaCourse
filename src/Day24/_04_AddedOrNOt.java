package Day24;

import java.util.HashSet;
import java.util.Set;

public class _04_AddedOrNOt {
    public static void main(String[] args) {


        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(894);
        integerSet.add(895);
        integerSet.add(893);
        integerSet.add(892);
        integerSet.add(891);

        boolean is7Added = integerSet.add(7);
        // this boolean above will check if set is available to print a new integer value of 7
        // when we write a new integer (without a duplicate)
        System.out.println(is7Added); // true

        boolean is895ADDED = integerSet.add(895);
        // here we already had the integer 895, so we will not be able to print
        // which will turn false
        System.out.println(is895ADDED); // false











    }
}
