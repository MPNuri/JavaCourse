package Day21;

public class Task2_Varargs {
    public static void main(String[] args) {

        System.out.println(multiply(9,2.1,5));
    }

    public static double multiply(double... varargs) {
       double multiplication = 1;

        for (int i = 0; i < varargs.length; i++) {
            multiplication *= varargs[i];
        }
        return multiplication;

    }







}
