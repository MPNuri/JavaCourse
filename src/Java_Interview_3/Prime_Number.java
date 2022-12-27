package Java_Interview_3;

import java.util.Random;

public class Prime_Number {
    public static void main(String[] args) {

        Random rndmNumber1 = new Random();
        int rndmNumber = rndmNumber1.nextInt(99);
        int counter = 1;

        for (int i = 1; i < rndmNumber; i++) {
            if (rndmNumber%i == 0)
                counter++;
        }
        if (counter>2)
            System.out.println("not prime" +" -> " + rndmNumber + "total number of dividers" +" -> " + counter);
        else
            System.out.println("prime" +" -> " + rndmNumber);

    }
}
