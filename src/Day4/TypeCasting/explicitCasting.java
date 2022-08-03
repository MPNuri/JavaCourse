package Day4.TypeCasting;

public class explicitCasting {
    public static void main(String[] args) {

        // explicit casting - narrowing casting ( happens manuel)
        //there could be data lose
        // Basically we are converting bigger data types into smaller data types
        // this long can be stored inside a INT see below

        long myLong = 2664466L;
        int myInteger = (int) myLong;
        System.out.println(myInteger);
        // so we are explicitly emphasizing our conversion

    int yourinteger = 3113;
    short myshort = (short) yourinteger;
        System.out.println(myshort);

// only use this method if the number you have is between the range of data type you convert

    short myShort = 13;
    byte mybyte = (byte) myShort;
        System.out.println(mybyte);

    //let s see what happens when conversion is not able to take place

    double myDouble1 = 23.56;
    int myInteger3 = (int) myDouble1;
        System.out.println(myInteger3);
        //here, after decimal point datas are lost


    short myshort9 = 129;
    byte mybyte4 = (byte) myshort9;
        System.out.println(mybyte4);
// result is -127 why? the number 129 is out of the range for byte
        // so it is overflowed and eneds up at -127



    }












}
