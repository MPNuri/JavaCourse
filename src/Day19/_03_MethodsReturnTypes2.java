package Day19;

public class _03_MethodsReturnTypes2 {
    public static void main(String[] args) {


      int total = sumOf2Numbers(5,15);
        System.out.println(total);

    }

    public static int sumOf2Numbers(int number1, int number2) {

        int sum = number1 + number2;
        return sum; // this here will return the result
    }
}
