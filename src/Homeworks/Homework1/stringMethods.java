package Homeworks.Homework1;

import java.util.Locale;

public class stringMethods {

    public static void main(String[] args) {


        String stringMethod1 = " \"I love java!\"";
        System.out.println(stringMethod1.length());

        String styringmethod2 = "\"Sprint planning\"";
        System.out.println(styringmethod2.length());

        String stringmethod3 = "paper";
        System.out.println(stringmethod3.toUpperCase());

        String stringmethod4 = "OraNge";
        System.out.println(stringmethod4.toLowerCase(Locale.ROOT));

        String stringmethod5 = "New Jersey";
        System.out.println(stringmethod5.toUpperCase());

        String stringmethod6 = "New York";
        System.out.println(stringmethod6.toLowerCase(Locale.ROOT));

        String stringMethods7 = "apple";
        System.out.println(stringMethods7.contains("app"));

        String stringmethod8 = "Florida";
        System.out.println(stringmethod8.indexOf("o"));

        String stringmethod9 = "Thank You";
        System.out.println(stringmethod9.indexOf("Y"));

        String stringmethod10 = "Friend";
        System.out.println(stringmethod10.charAt(3));

    // MUHAMMET NURULLAH PARLAK
    }
}
