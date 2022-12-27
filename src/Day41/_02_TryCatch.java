package Day41;

public class _02_TryCatch {
    public static void main(String[] args) {

        /** this is the structure of TRY CATCH **/

        try {
            int[] array = new int[5];
            System.out.println(array[6]);  // this should crash the app,
                                           // but we use try catch block to prevent with exception
        } catch (Exception e) {
            System.out.println("the index does not exist");
        }


        // there are different type of exception name we will learn





















    }
}
