package Day6;

public class _01_RStartswith {
    public static void main(String[] args) {

        String message1 =  "Hello World";

      boolean isMessageStartsWith =  message1.startsWith("H");

        System.out.println(isMessageStartsWith);
       //if we would like to check any other number s place
        // first type the letter you want to check than type down the number but be sure you have the index in the
        // message where you will be searching for
        //see below
       boolean isWat6 = message1.startsWith("W", 6); // here W at 6 so we are good

        System.out.println(isWat6);

      //using boolean because we are checking true or false based questions








    }
}
