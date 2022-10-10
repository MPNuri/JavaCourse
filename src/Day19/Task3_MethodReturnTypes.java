package Day19;

public class Task3_MethodReturnTypes {

    public static void main(String[] args) {

        int x = multiply2Numbers(5,9);
        System.out.println(x);
    }


    public static int multiply2Numbers(int number1, int number2) {
                   // (multiply2Numbers) should not be a printer instead it is a returner
        int multiplier = number1 * number2;
        return multiplier;
    }

}
