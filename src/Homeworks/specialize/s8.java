package Homeworks.specialize;

public class s8 {
    public static void main(String[] args) {

        //Given int number
        //print all the even numbers from 0 to int number
        //Example 1:
        //int input = 10;
        //print should be 0 2 4 6 8 10
        //Example 2:
        //int input = 15;
        //print should be 0 2 4 6 8 10 12 14

        int x = 8;
        int y = 2;

        for (int i = 0; i <x ; i++) {
            if (i % y == 0) {
                System.out.print(i);
            } else {
                System.out.print(" ");
            }
        }












    }
}
