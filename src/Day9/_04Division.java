package Day9;

public class _04Division {
    public static void main(String[] args) {

        //value method
        System.out.println(9 / 3);

        //dont forget to use double when division cannot be completed fully
        System.out.println(9 / 2); //=4
        System.out.println(9 / 2.0); // 4.5
        //Remember we cannot divide different type of primitive to each other so one of them must change either auto or
        // manuel. if we are not gonna use manuel then smaller once will convert automatically to bigger data type
        // which is double here. so 9 will be 9.0 and dividion will be completed as 9.0 / 2.0 = 4.5

        //divison between variables
        int m = 65;
        int n = 13;
        System.out.println(m / n);

        int result = m / 1; // int result = 65
        System.out.println(result);

        m = 78; // result will not be changed because it is already assgined
        // to be clear it is solved


        // System.out.println(15 / 0); not possible


        int a = 25;
        int b = 4;
        double result1 = (double) a / (double) b;
        System.out.println(result1);
        //one double is enough in the right side because smaller data types will auto convert to bigger data type
















    }
}
