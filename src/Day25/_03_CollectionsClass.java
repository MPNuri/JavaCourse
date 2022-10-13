package Day25;

import java.util.*;

public class _03_CollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();

        Set<Integer> numbersSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            int randomNumber = (int) (Math.random() * 100);
            numbersList.add(randomNumber);
            numbersSet.add(randomNumber);
        }

        System.out.println("ArrayList at first "+numbersList);
        System.out.println("HashSet at first "+numbersSet);

        // addAll() --- to add multiple elements into List/Set
        // 1-) first create a Integer   Arraylist

        Integer[] numbersArray = {99, 55, 22, 44};
        // this collection is number or string addAll into our sets or lists
        Collections.addAll(numbersList, numbersArray );
        Collections.addAll(numbersSet,5);

        System.out.println("after collection into list " + numbersList);
        System.out.println("after collection into set " + numbersSet);


        // sort() --- sort the list in ascending order
        // cannot be use for sets because sets are unordered methods (even the treeSet)
        Collections.sort(numbersList);
        System.out.println("arraylists after using sort method " + numbersList);


        // reverseOrder()  --- sorts the elements in descending order
        // also cannot be used for sets
        Collections.sort(numbersList, Collections.reverseOrder());
        System.out.println("after reverse method" + numbersList);

        // max and min methods can be used for sets as well

        // finds out the max value throughout Integer value
        Integer maxvalue = Collections.max(numbersList);
        System.out.println("sets max number = "+Collections.max(numbersSet)); // 81
        System.out.println("max number equals " + maxvalue ); // 99

        // finds out the min value throughout Integer value
        Integer minValue = Collections.min(numbersSet);
        System.out.println("sets min number = " +Collections.min(numbersList)); //22
        System.out.println("min number " + minValue); // 5











    }
}
