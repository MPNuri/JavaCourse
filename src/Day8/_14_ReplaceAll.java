package Day8;

public class _14_ReplaceAll {
    public static void main(String[] args) {

        /* replace and replaceall methods are different
        replace accepts char and string based data types
        replace all accepts regex (range of character)
        */


     String phonenumber = "my phone is 647-862-5275";
     String protectedphonenumbers = phonenumber.replaceAll("[3-6]" , "#");
        System.out.println(protectedphonenumbers);

        // numbers between 3-6 are converted into #
        // instead of replacing individual indexes we are replacing by range for example numbers between 3-6 05 letters between a-c
        // this method only accepts strings
        // dont forget square brachets
        //
        String ptotectedletters = phonenumber.replaceAll("[m-n]" , "0");
        System.out.println(ptotectedletters); // must not have [] around replacement character.

       /* [A-z] means range of all letters
          [A-Z] All upper cased letters
          [a-z] all lower cased letters
       */











    }


}
