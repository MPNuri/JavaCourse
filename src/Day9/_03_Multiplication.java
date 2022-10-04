package Day9;

public class _03_Multiplication {
    public static void main(String[] args) {

        //classic method by values
        System.out.println(5 * 3);

        //variable method
        int k = 5;
        int l = 7;
        System.out.println(k * l);

        //anothr way to use variable method
        int result = k * l;
        System.out.println(result);


        //These may confuse you when the one of the variables value change
        // System.out.println(result); and System.out.println(k * l);

        k = 10;

        System.out.println(result); // this will be 7*5 = 35 because we already printed this so we are gonna copy paste from the top
        System.out.println(k * l); // this result is 7*10 = 70 because value of k is changed we are recalculating

















    }
}
