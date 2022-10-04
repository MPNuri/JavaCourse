package Day10;

public class _01_ComparisonOperation {
    public static void main(String[] args) {

        // == is our physical method

        int a = 1;
        int b = 1;
        int c = 3;

        // the reason we are not using only = is (=) is being used for assigning the values to each other

        //assign to
        System.out.println(a = c); // means make c equal to a

        // equal to
        System.out.println(a == b); // true
        System.out.println(a == c); // false

        // unequal than
        System.out.println(a != b); //false
        System.out.println(a != c); //true

        // bigger than
        System.out.println(a > b); //false
        System.out.println(c > a); //true

        // smaller than
        System.out.println(a < b); // false
        System.out.println(b < c); //false

        // greater than and equal
        System.out.println(a >= b); // true
        System.out.println(c >= a); //true

        // smaller than and equal
        System.out.println(a <= b); // true
        System.out.println(a <= c); // true

        // we can store the values inside boolean

        boolean aIsSmallerC = a < c;
        System.out.println(aIsSmallerC); //true












    }
}
