package Day21;

public class Task1_OverLoading {
    public static void main(String[] args) {

        System.out.println(multiply(9,4));
        System.out.println(multiply(9,8,7));
        System.out.println(multiply(4.0,9.1));
        System.out.println(multiply(9.2,8.9,7.4));
        System.out.println(multiply(9.4,4));
        System.out.println(multiply(7,9.6));

    }

    public static int multiply(int number1, int number2) {
        return number1*number2;
    }

    public static int multiply(int number1, int number2, int number3) {
        return number1*number2*number3;
    }

    public static double multiply(double number1, double number2) {
        return number1*number2;
    }

    public static double multiply(double number1, double number2, double number3) {
        return number1*number2*number3;
    }

    public static double multiply(double number1, int number2) {
        return number1 * number2;
    }

    public static double multiply(int number1, double number2) {
        return number1 * number2;
    }










}
