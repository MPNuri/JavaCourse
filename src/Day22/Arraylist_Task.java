package Day22;

import java.util.ArrayList;

public class Arraylist_Task {
    public static void main(String[] args) {


        //Task 1:
        //    1-Create one method name is getCount()
        //    Parameter is one (String ArrayList , String)
        //    return type is int.
        //    Count how many times your parameter String occurs in the arraylist and return the count
        //    For Example:
        //    ArrayList is [Orange , Kiwi , Peach , Banana , Orange]
        //    String is Orange
        //    count should be 2


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Peach");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(getCount(fruits, "Orange"));
    }

    static int getCount( ArrayList<String> fruits,String randomFruit ) {

        int counter = 0;

        for (int i = 0; i <fruits.size() ; i++) {
            if (fruits.get(i).contains(randomFruit)) {
                counter++;
            }
        }

        return counter;
    }














}
