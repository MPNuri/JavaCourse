package Day8;

public class _16_EqualsAndEqualsIgnoredCase {

    //boolen will be used

    public static void main(String[] args) {

        //checks if 2 strings are equal or not

        String string9 = "Techno Study";
        String string8 = "Techno Study";
        String string7 = "TECHNO STUDY";

        System.out.println(string9.equals(string8));

        System.out.println(string8.equals(string7));

        //frist one is true but second is false because JAVA IS CASE SENSITIVE LANGUAGE
        //BUT IF WE USE IGNORE CASE LETS WHAT HAPPENS

        System.out.println(string7.equalsIgnoreCase(string9));
        //as we expected the print is true

        //if we want to make string 7 and 8 equal
        // another method other than ignore case is upper case method or lower case




















    }
}
