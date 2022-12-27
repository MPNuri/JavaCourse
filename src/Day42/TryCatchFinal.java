package Day42;

public class TryCatchFinal {
    public static void main(String[] args) {


        // we have a keyword called Finally
        // lets see how we use finally


        try {
            int[] x = new int[5];
            x[1] =5;
            System.out.println(x[1]);
        } catch (IllegalArgumentException ex) {
            System.out.println("please be aware of the index limit");
        } finally {
            System.out.println("tis will be printed in any case");
        }

        // whether we have a exception or not finally keyword will be printed
























    }
}
