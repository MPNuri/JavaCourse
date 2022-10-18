package Day33._02_FinalWithReferenceTypes;

import java.util.Arrays;

public class _02_FinalKeywordWithReference {
    public static void main(String[] args) {

        // ask this question

        final String[] months = new String[4];
        // number of array is fixed to 4. we cannot change this
        // but, we can replace the values the indexes hold.
        months[0] = "Jan";
        months[1] = "Feb";
        months[2] = "March";
        months[3] = "April";

        months[0] = "s";
        System.out.println(Arrays.toString(months));








    }
}
