package Day6;

public class StringMethods {
    public static void main(String[] args) {

        // String message1 = new String("Hello world");

   //This is how we are supposed to type but we use string a lot so we have a short cut

        String messeage = "Hello World"; // shortcut but this shortcut is only for string.


        boolean ismesseageStartsWithHello = messeage.startsWith("Hello");

        System.out.println(ismesseageStartsWithHello);

        boolean isSecondmesseageStartsWithW = messeage.startsWith("W",6);

        System.out.println(isSecondmesseageStartsWithW);




        // if the message starts with hello it will
        //be true if not then false
        // indexes starts with 0
        //



    }





}
