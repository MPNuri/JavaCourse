package Day12;

import java.util.Locale;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        //exam result example

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the exam result");
        String examResult = scanner.nextLine().toUpperCase();

        // WHEN USING INT OR DOUBLE NO NEED FOR ""
        // WHEN USING STRING USE "" OUTSIDE THE INDEXES

        switch (examResult) {

            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Well done");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Need to Improve");
                break;
            case "F":
                    System.out.println("Fail");
                    break;
            default:
                System.out.println("Not Valid Result");



        }











    }
}
