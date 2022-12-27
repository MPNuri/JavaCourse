package Java_Interview_3;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Parameters {

    static int _04_Doubles(double one, double two,double three, double four) {
        int sum = (int) (one+two+three+four);

        return sum;
    }

    static void fiveGuys() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inte = new ArrayList<>();
        int newArray[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("your number please = ");
            int x = scanner.nextInt();
            inte.add(x);
        }
        System.out.println("your numbers are " + inte);
        Collections.sort(inte);
        System.out.println("your sorted numbers are = "+inte);
    }

    public static void main(String[] args) {
        System.out.println(_04_Doubles(5,4,6,5613));
        fiveGuys();
    }
}
