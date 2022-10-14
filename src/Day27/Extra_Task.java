package Day27;

import java.util.*;

public class Extra_Task {
    public static void main(String[] args) {

        //Create a HashMap where the user has an accountNumber as a key and an email address as a value
        //Ex: 123456, "info@techno.study"
        //Create a couple of users and ask the user using Scanner class for an account number
        //Find the account and print "here's your email address: info@techno.study"

        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(13, "murillo@");
        myMap.put(31, "mpN@");
        myMap.put(6, "Nurimo");

        System.out.print("please enter your account number");
        Integer x = scanner.nextInt();


        if (myMap.keySet().equals(null)) {
            System.out.println("please enter you account number correctly");
        } else
            System.out.println("here you go boss, " + myMap.get(x));


        //For a second task print all your data in an increasing ordered version
        //EX: { 123 = "david@gmail.com", 124 = "angela@gmail.com", 125 = "diego@gmail.com" }
        //NOTE: do not change your original Map, your original map should stay as a HashMap


        Set<Integer> y = myMap.keySet();

        for (Integer z : y) {
            System.out.print(z + "=>" + myMap.get(z) + ", ");
        }



        // congratso you did it.





























    }
}
