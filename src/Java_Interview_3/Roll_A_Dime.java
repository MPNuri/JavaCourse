package Java_Interview_3;

import java.util.Random;

public class Roll_A_Dime {
    public static void main(String[] args) {


        Random rndmDice = new Random();

        int oneToSix = rndmDice.nextInt(7);

            if (oneToSix == 6) {
                System.out.println("finally" + " == " + oneToSix);
            } else {
                System.out.println("nah mann it slipped" + " == " + oneToSix);
            }







}
}
