package Day20;

public class _01_MethodsOverview {
    public static void main(String[] args) {

        // methods are useful for shortcut when we need to use the same package over and over
        // lets do a recap

        printFive(); // first
        printNumber(10); //second
        System.out.println(returnNumber(16)); // third

    }


    public static void printFive () {
        System.out.println(5);
    }

    public static void printNumber (int number) {
        // parameters here is int, so we can only print integer
        // int number = 10; from line 11
        System.out.println(number);
    }

    public static int returnNumber(int number) {
        return number;
    }




}
