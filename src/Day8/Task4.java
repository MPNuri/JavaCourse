package Day8;

public class Task4 {
    public static void main(String[] args) {

        String firstString= "123456789";
        String secondString = "0123456789";


        char charAt1 = firstString.charAt(5);
        System.out.println(charAt1);


        char charAt2 = secondString.charAt(5);
        System.out.println(charAt2);
        // orrr

        System.out.println(firstString.charAt(7));
        System.out.println(secondString.charAt(7));

//my way was slower and harder but correct anyway


    }
}
