package Day4;

public class stringDataType {
    public static void main(String[] args) {


        System.out.println("TechnoStudy");
        //this is actually a string data type
        // you can also store this value inside a variable
        //there is no variable here we are just printing a text directly with the system


        String soccerClub = "ontario soccer";
        System.out.println(soccerClub);

        //in here we are storing a text inside a variable
        //strings are built from charts
        // we cannot update the values by renaming

        /* what string actually does is that string has combined of the all the data types
           for example int = 3 or double = 46.5465 or boolean isOkay = true false
           all these data types are limited resources however
           string captures almost every possible feature we need inside in it ""
        */

        //example

        String myActualBirthday = "1999/07/23";
        System.out.println(myActualBirthday);

        String myLegalBirthday = "1999/08/11;";
        System.out.println(myLegalBirthday);

       ;
        //VERY IMPORTANT
        //WHEN WE USE "" INSIDE A SOUT THAT MEANS PRINT EXACTLY WRITTEN
        //HOWEVER TYPING ONLY A NAME WITHOUT ANY "" MEANS PRINT THIS VARIABLE WHAT THE VARIABLE HOLDS

        System.out.println(myActualBirthday + myLegalBirthday);

        /*
        Inside of a String we can add multiple variables
         If you want to use a space between the dates or any data you written
        (+ " " +) will be enough
        this ( + " " + ) is another string but not needed to type

        */

       // we can also combine variables inside a variable see below
        String Birthdays = myLegalBirthday + " " + myActualBirthday;



    }

}
