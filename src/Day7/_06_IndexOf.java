package Day7;

public class _06_IndexOf {
    public static void main(String[] args) {


        String welcomeMessage = "Welcome to TechnoStudy";

        welcomeMessage.indexOf('W');
        // this means give me index of W
        int indexOfW = welcomeMessage.indexOf('W');

        System.out.println(indexOfW);
        // in this example index of W is zeero
        //indexes are number of the letter starts with 0 and goes on

      int indexOfLowerW = welcomeMessage.indexOf('w');

        System.out.println(indexOfLowerW);

        // when there is no such an index asken in the print outline it will answer
        // as -1 (make sense)


        welcomeMessage.indexOf('t');
        // there are two t in this scenario so what will it print is the first one from left

        int indexOfFirstT = welcomeMessage.indexOf('t');

        System.out.println(indexOfFirstT);
        // this will print the first match
        //if we need to print second t we are gonna type

        int indexOfT = welcomeMessage.indexOf('t', 9);
// dont get confused because here we skipped the firs t because we told the start from index number 9
        System.out.println(indexOfT);

        //dont try to type "ch" or fromindex just kesme isareti and right after that use comma and type the number you need




    }




}
