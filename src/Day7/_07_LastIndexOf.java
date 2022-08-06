package Day7;

public class _07_LastIndexOf {
    public static void main(String[] args) {
        String message = "Hello from TechnoStudy";


        message.lastIndexOf('o'); //16
        // here we are looking for the last "o"

        message.indexOf('o');//4, here we commended to start from the very first one unlike first example

        //these are generally number and indexes are numbers so we are gonna use int
        // it will be counted from left side and from 0 to infiniti

        int indexOfO = message.indexOf('o');

        int indexOfLastO = message.lastIndexOf('o'); //16 again

        System.out.println("Index of first O letter" + indexOfO);
        System.out.println("Index of Last O letter" + indexOfLastO );














    }




}
