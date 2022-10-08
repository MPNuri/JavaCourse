package Day16;

public class Task3_NestedLoop {
    public static void main(String[] args) {


        //from first loop u decide how many lines you will use
        //from second line u decide how many star to put in a line


        for (int i = 0; i < 5; i++ ) {


            for (int j = 5; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }










    }
}
