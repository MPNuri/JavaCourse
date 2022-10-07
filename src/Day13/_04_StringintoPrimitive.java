package Day13;

public class _04_StringintoPrimitive {
    public static void main(String[] args) {


        String number1 = "123456";
        String number2 = "987654";

        System.out.println(number1 + number2); // there is no math here, since our entries are string

        // now we are gonna convert strings into primitive data types

        int number1ConvertedintoINT = Integer.parseInt(number1);
        int number2ConvertedintoINT = Integer.parseInt(number2);

        System.out.println(number1ConvertedintoINT + number2ConvertedintoINT);

        String a = "4";
        byte abc = Byte.parseByte(a);
                // (PrimitivetypeA).parse(PrimitivetypeA)


    }


}
