
package Homeworks.Homework1;

public class StringMethod1 {
    public static void main(String[] args) {

       String stringM11 = "TechnoStudy SDET Course!";
        System.out.println(stringM11.startsWith("T"));

        String stringM12 = "I love java!";
        System.out.println(stringM12.endsWith("java!"));

        String stringM13 = "      There are 8 primitive data types in Java!         ";
        System.out.println(stringM13.trim());

        String stringM14 =  "My bank account number is 0987654323456789 and my rooting number is 48883280129.";
        System.out.println(stringM14.replace("[0-9]" , "*"));

        String stringM15 = "Pracicing Java is really important!";
        System.out.println(stringM15.replaceAll("a" , "@"));

        String stringM16 = "     ";
        System.out.println(stringM16.isEmpty());

        String string17 = "HEY!";
        String string172 = "hey!";
        System.out.println(string17.equals(string172));

        String stringM18 = "HEY!";
        String stringM182 = "hey!";
        System.out.println(stringM182.toUpperCase());
        System.out.println(stringM18.equals(stringM182));

        String stringM19 = "We are going to be Software Testers in 6 months!";
        String substring = stringM19.substring(19);
        System.out.println(substring);



        String stringM20 = "123456789";
        String string202 =  "0987654321";
        System.out.println(stringM20.concat(string202));


        // MUHAMMET NURULLAH PARLAK

    }
}
