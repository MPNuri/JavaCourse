package Day5;

import java.util.Scanner;

public class _01_userInput {
    public static void main(String[] args) {

        System.out.println( "pleae enter your name");
    // this is printing

        Scanner scanner = new Scanner(System.in);
      String userInput = scanner.nextLine();
        System.out.println("Your name: " + userInput);




        // we are now gonna create a object
        //we are here using SCANNER CLASS in order to get users input
        // that System.in means we are going to get user input from output window
        // import from top comes right after typing scanner
        //this scans what user type FROM OUTPUT WINDOW

        /*
        1-)This method allow us to use output window
        2-)the scanner we have in input table scans our input from output window
        3-) Second line ((scanner.nextLine();)) method scans and we are going to be able to read from the output page
         */


        //This scanner class method grants to use output window

      Scanner scanner1 = new Scanner(System.in);
 // first line letting java know we will read user input just like preparing
        //scanner.nextLine(); // in here java will be waiting for us to enter the text since we asked the user a text when
        // I type something it will finish the proc. so this line means ask user to write a message

        String userInput1 = scanner.nextLine();
        // we are using a String so I can store the result so after user enters the text we need to store the text
        // this is where string comes to work to store the text inside a variable












        // inside these parantezes we need to tell where we are gonna read from System.in yields to output window and that is
        // where we are gonna read from in this method





    }
}
