package Homeworks.specialize;

public class s6 {
    public static void main(String[] args) {

        //Given three positive Strings(String represent price of an item, and it includes $ sign)
        //remove all the non-numeric characters.
        //change the Strings to int
        //and print the total
        //Example:
        //output should be == 65;
        //NOTE : if the output less than 0 change output to -1

        String num1 = "$15a";
        String num2 = "$20";
        String num3 = "$30";

        num1 = num1.replaceAll("[^\\d.]", "");
        num2 = num2.replaceAll("[^\\d.]", "");
        num3 = num3.replaceAll("[^\\d.]", "");

        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int z = Integer.parseInt(num3);

        System.out.println(x+y+z);






    }
}
