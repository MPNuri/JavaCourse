package Java_Interview_3;

public class reverseOrderName {
    public static void main(String[] args) {

        String name = "random name";
        String reversedName = "";

        // System.out.println(name.length());

        //String[] container = new String[name.length()-1];

        for (int i = name.length()-1; i>=0; i--) {
            reversedName += name.charAt(i);
        }
        System.out.println(reversedName);




    }
}
