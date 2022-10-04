package Day8;

public class _13_replace {
    public static void main(String[] args) {


        String firstString = "Hello World";

        String replacedString = firstString.replace('l' , '@');
        System.out.println(replacedString);
        // make sense
        /*
        1-) This method replaces the indexes
        2-) If there are more than 1 index we replace them all by one shoot for example l here
        3-) Don't forget to create your second string, so you can print CORRECTLY BECAUSE STRINGS CANNOT BE UPDATED
        4-) Inside sout '' use this because we are using char (single character) when only one letter being replaced
        5-) STRINGS ARE IMMUTABLE SO WE CANT UPDATE THEM
        */


        String replaceHello = firstString.replace("Hello" , "Hi"); //this is whole new string
        System.out.println(replaceHello);

        //If you want to replace more than one word use your words inside""
    }
}
