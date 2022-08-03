package Day4.TypeCasting;

public class implicitCasting {
    public static void main(String[] args) {

        //implicit casting is automatic casting
        //widening casting
        //basicaly we are converting smaller data into bigger data types automatically
        //converting byte integier there will be no data lose

 //byte -> short -> int -> long -> float -> double

    byte bytenumber = 10;
    short shortnumber = bytenumber;
        System.out.println(shortnumber);
        //very cool! we are only copying the byte data to short data type

    short shortnumber2 = 2222;
    int intnumber = shortnumber2;
        System.out.println(intnumber);

        int intnumber2 = 64846;
        long longnumber = intnumber2;
        System.out.println(longnumber);
// lets see real life example why would we even need this

        short x = 5;
        int y = 3 + x;
        System.out.println(y);
//cooll! lets see another example

        float screwnumber = 7.5F;
        double nailnumber = screwnumber;
        System.out.println(nailnumber);

double doublenumber2 = 5;
        System.out.println(doublenumber2);
        //at first 5 was a int but when we print it is auto. converted to a double
        // this is called implicited casting
        // when we write down a decimalled point and not specificly named as float it is a double

short toflot = 8;
float fromshort = toflot;
        System.out.println(fromshort);

        int x1 = 929726;
        double y1 = x1;
        System.out.println(y1);


double a = 2.1;
double b = 3 + a;
        System.out.println(b);

//in here normally we were supposed to convert the int to double which is 3
        // at this point but no needed since it is a default setting

    }

}
