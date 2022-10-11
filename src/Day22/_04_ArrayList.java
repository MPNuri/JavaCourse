package Day22;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_ArrayList {
    public static void main(String[] args) {

        /**   Arrays   **/

        int[] array = new int[3]; // fixed size array

        array[0] = 65; // initializing the array
        array[1] = 43;
        array[2] = 181;

        System.out.println(Arrays.toString(array)); // printing array
        int element = array[1]; // naming an element from array
        System.out.println(array[0]); // printing specific element from array here index 0
        System.out.println(array.length); // length of the array


        /**        ArrayList<>      **/

        ArrayList<Integer> arraylists = new ArrayList<>();
        // arraylist.add() ----- adding elements into list.
        arraylists.add(100); // index 0
        arraylists.add(1646); // index 1 ...
        arraylists.add(144);
        arraylists.add(197);
        arraylists.add(10);

        //arraylists.add(index); --- getting all the value of an index
        System.out.println(arraylists); // getting all the value of indexes

        // arraylists.add(index, element) --- to add element to specific index
        arraylists.add(0,101);
        // now our array will have extra one more element which is 101 at index 0
        // and every other element will increase its index by one
        System.out.println(arraylists);

        // Getting a specific index(element) below = this will print index of 2 = 1646 (after the line 37)
        Integer elementAtRandom = arraylists.get(2); // unboxing (came from Integer)
        System.out.println(elementAtRandom); // or you can directly print the specific element you are looking for by typing in "sout"


        int elementAt1 = arraylists.get(1); // autoboxing (came from int)
        System.out.println(elementAt1);


        // removing an element from index
        arraylists.remove(0); // now we are going to remove (index 0) which is 101 (after the edit)
        System.out.println(arraylists);

        // removing an element by their value, see below and terminator window
        //  we cannot just type the index number because java will assume index as a random value
        //  (will only remove first occurrence)
        Integer elementToRemove = 1646; // (unboxing), (1646 is removed)
        arraylists.remove(elementToRemove);
        System.out.println(arraylists);



        // arraylist.set(index, newValue)  ---  for updating a index value
        arraylists.set(2,66);
        System.out.println(arraylists); // it was 144 before the execution now it is 66


        // arrayList.size() --- returns the length of the arraylist
        int numberOfElements = arraylists.size(); // we need to use int first to print
        System.out.println("(size of elements) " + numberOfElements);


        // arrayList.isEmpty(); --- returns boolean and checks whether arraylist empty or not
        // 2 different type of solution below
        System.out.println(arraylists.isEmpty());

        // arraylists.clear(); --- removes all the elements from arrayLists
        arraylists.clear();
        System.out.println(arraylists);


        boolean checkIfEmpty = arraylists.isEmpty();;
        System.out.println(checkIfEmpty);









    }
}
