package Day13;

public class _03_PrimitivetoString {
    public static void main(String[] args) {


        int intx = 1;
        int inty = 2;

        String intxConvertString = Integer.toString(intx);
        String intyConvertString = Integer.toString(inty);

        System.out.println(intxConvertString + intyConvertString);
        //12 as a result because our int converted to string



        byte z = 5;
        String bytezintoString = Byte.toString(z);


    }
}
