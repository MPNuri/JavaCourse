package Day19;

public class _01_Methods {
    public static void main(String[] args) {

        printHelloWorld5times();
        // we are calling or in other word creating a new method
        // imagine we have 1000s of code line, and we are going to need to print hello world 100 time in different places.
        // instead of writing one by one we are going to create a new method like below whenever
        // we type printHelloWorld5times(); inside main method and it will print as we said as we order

    }


    //creating a method - with normally no return type

    public static void printHelloWorld5times() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");


    }




}
