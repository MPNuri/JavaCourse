package Day8;

import Java_Interview_3.x;

import java.sql.Array;

public class _13_replace1 {
    public static void main(String[] args) {

        String example = "aaaaaaaaaaa";
        String result = "";

        int counter = 0;

        for (int i = 0; i < example.length(); i++) {
            if (i == 0) {
                result = result + example.charAt(i);
                counter++;
            }if (i != 0 && example.charAt(i) == example.charAt(i-1)) {
                counter++;
            } else if (i != 0 && example.charAt(i) != example.charAt(i-1)) {
                result = result + counter + example.charAt(i);
            }

            if (i == example.length() - 1) {
                result = result + counter;
            }
        }
        System.out.println(result);


    }


}
