package Java_Interview_3;

import java.util.ArrayList;

public class ReturnCreatedArraylist {

    // TASK
    // part 1:
    // create a method that will create an arrayList of integers
    // with 5 random numbers(1 to 10) and return the created ArrayList


    // part 2:
    // create a method that updates the middle element to the element that's provided in parameter
    // [3, 4, 1, 6, 9, 10]  -> provided parameter 100 -> [3, 4, 100, 6, 9]

    static ArrayList<Integer> integer(ArrayList<Integer> limit, int limiter) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add((int)(Math.random()*10));
        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(integer(list,7));
    }

}
