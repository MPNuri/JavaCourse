package Day22;

public class _02_AutoboxingAndUnboxing {
    public static void main(String[] args) {

        byte primitive = 10;
        Byte toreference = primitive;
        // now this is a Reference typed variable
        // this is called autoboxing by copying

        Character referenceChar = 'A';
        char toPrimitive = referenceChar;
        // now this is a primitive type variable
        // this is called unboxing by copying (primitives copy the values we or user gives)

        System.out.println(toreference);
        System.out.println(toPrimitive);








    }
}
