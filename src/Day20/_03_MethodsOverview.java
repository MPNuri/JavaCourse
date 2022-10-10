package Day20;

public class _03_MethodsOverview {

    public static void main(String[] args) {


    int result = sumThreeIntegers(20,30,40);
        System.out.println(result);
    }


    public static int sumThreeIntegers(int num1, int num2, int num3) {
        int sum = num1+num2+num3;
        return sum;
        // this method means inside main method we will write 3 integers and this method will return sum of these numbers
    }



}
