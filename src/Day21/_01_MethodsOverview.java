package Day21;

public class _01_MethodsOverview {
    public static void main(String[] args) {

        // for example, we are going to use Math.max method, but we cannot use different parameters in the same line
        // so, we are going to create new method to overload
        // we are going to create multiple methods with the same name

        System.out.println(sum(1,6)); //1 and 6 here are the argumants
        // after overloading we can add one more number

        System.out.println(sum(1,9,6));
        // basically they have the same name but (more or less) or (different) parameters

        System.out.println(sum(4.1,9.3));
        // lets change parameters to double from int

        System.out.println(sum(8.8,9.0,7.2));
        // lets increase the double size


    }


    public static int sum(int number1, int number2) {

        return  number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {

        return number1 + number2 + number3;
    }

    public static double sum(double double1, double double2) {

        return double1 + double2;
    }

    public static double sum(double double1, double double2, double double3) {

        return double1 + double2 + double3;
    }



}
