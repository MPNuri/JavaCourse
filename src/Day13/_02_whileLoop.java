package Day13;

import java.util.Scanner;

public class _02_whileLoop {
    public static void main(String[] args) {

        // we are going to ask user to enter int more than once, however without using scanner more than once
        // you ARE going to use SCANNER but NOT MORE THAN ONCE
        Scanner scanner = new Scanner(System.in);

        int counterFirst = 0; // IF THIS NUMBER CHANGES, TOTAL COUNTING WILL AUTO. CHANGES
        // this number here is the COUNTER. IT DOES CHECK HOW MANY MORE TIMES YOU NEED TO PRINT A NUMBER...
        // SO YOU CAN REACH THE COUNTER LIMIT AT "WHILE"
        int total = 0; // IF THIS NUMBER CHANGES ANSWER CHANGES
        // THIS 'TOTAL' INT HERE, IS BEING ADDED TO TOTAL AT THE END

        while (counterFirst < 5) { //THIS IS OUR CONDITION, SAYS STOP BEFORE 5. UP UNTIL 5 IT WILL CONTINUE EXECUTING.
            System.out.println("Please enter a number");
        int number = scanner.nextInt();
        total = total + number; // THIS HERE TOTALLING THE NUMBERS USER ENTERS
        counterFirst++; // ADDS +1 EACH TIME WE PRINT UNTIL REACHES TO LIMIT


        }
        System.out.println(total); // PRINTS THE TOTAL NUMBER FROM LINE 21...









    }
}
