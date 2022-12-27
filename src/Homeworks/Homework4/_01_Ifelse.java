package Homeworks.Homework4;

import java.util.Scanner;

public class _01_Ifelse {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("your results, = ");
        int quiz_score = scanner.nextInt();
        int mid_term_score = scanner.nextInt();
        int final_score = scanner.nextInt();

        int average = (quiz_score + mid_term_score + final_score) / 3;

        if (average >= 90) {
            System.out.println("grade=A");
        } else if (90 > average && average >= 70) {
            System.out.println("grade=B");
        } else if (70 > average && average >= 50) {
            System.out.println("grade=C");
        } else if (average < 50) {
            System.out.println("grade F");
        }


        if (quiz_score > mid_term_score && quiz_score > final_score) {
            System.out.println(quiz_score);
        } else if (mid_term_score > quiz_score && mid_term_score > final_score) {
            System.out.println(mid_term_score);
        } else if (final_score > quiz_score && final_score > mid_term_score) {
            System.out.println(final_score);
        } else {
            System.out.println("All Equals");
        }


        if (quiz_score<mid_term_score && quiz_score<final_score) {
            System.out.println(quiz_score);
        } else if (mid_term_score<quiz_score && mid_term_score<final_score) {
            System.out.println(mid_term_score);
        } else if (final_score<quiz_score && final_score<mid_term_score) {
            System.out.println(mid_term_score);
        } else {
            System.out.println("All equals");
        }


    }
}































/*


        String shoppingList[] = {"milk", "key", "tape", "charger", "water", "coffee", "banana", "toys", "tea", "watch"};

        for (int i = 0; i < shoppingList.length; i++) {
            if (shoppingList[i].length() < 5) {
                System.out.print(shoppingList[i] + " ");
            }
        }

*/



        //after printing them successfully create a new array called longItemsArray and
        //put the items longer than 5 letters in this array. Then print this array out
        //Note: You can make this array's length 10 so that it will never give an exception.
        //We don't care if there are empty spots





























