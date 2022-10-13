package Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Task
        // create list of 5 numbers from user input(you need to get 5 numbers from user input and add them to list)
        // sort the list in reverse order and print it

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <5; i++) {
            int numbers = scanner.nextInt();
            arrayList.add(numbers);
        }

        Collections.reverse(arrayList);
        System.out.println(arrayList);

    }
}
