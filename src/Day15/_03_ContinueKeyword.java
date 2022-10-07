package Day15;

public class _03_ContinueKeyword {
    public static void main(String[] args) {

        // continue and break keywords mostly used for loops
        // whenever java sees continue; it skips the execution such as 5 here

        for (int i = 0; i < 10; i++) {
            if (i < 5)   // now continue keyword will block to print the numbers smaller than 5
                continue;
            System.out.println(i); //5,6,7,8,9
        }




















    }
}
