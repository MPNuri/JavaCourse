package Day42.CustomException;

public class demo {
    public static void main(String[] args) {


        // custom checked exception is used here.

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        try {
            intArray(numbers, 10);
        } catch (YouAreWrong exc) {
            System.out.println("index is out of limit");
        }


    }


    static void intArray(int[] a, int index) throws YouAreWrong{
        if (index>=a.length)
            throw new YouAreWrong();
        System.out.println(a[index]);

    }




}
