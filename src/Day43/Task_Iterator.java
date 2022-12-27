package Day43;

import java.util.HashSet;
import java.util.Iterator;

public class Task_Iterator {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Mike");
        names.add("Steven");
        names.add("Alex");
        names.add("Robin");
        names.add("Amanda");


        // Part1: Using iterator print all the elements 1 by 1
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // Part2: Iterate over set by using iterator and get every element
        //        If element starts with 'A' then remove element

        Iterator<String> itr2 = names.iterator();

        while (itr2.hasNext()) {
            if (itr2.next().startsWith("A"))
                itr2.remove();
        }
        System.out.println(names);








    }
}
