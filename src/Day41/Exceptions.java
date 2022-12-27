package Day41;

import java.sql.Array;
import java.util.Arrays;

public class Exceptions {
    public static void main(String[] args) {


        // exceptions are runtime error controller.
        /*For example, we have an Array,
     but we do not know whether we initialized index of 15 or not.
     instead of checking manually we use exception rule so normal flow can maintain */


        // throws an exception because index 6 is not exist
        int[] array = new int[5];
        System.out.println(array[6]);

        // we cannot uppercase something do not exist
        String name = null;
        System.out.println(name.toUpperCase());

        System.out.println("merba");
        // for example here we won't be able print anything simply because of errors


        // so we are gonna create type with TRY, CATCH


    }
}
