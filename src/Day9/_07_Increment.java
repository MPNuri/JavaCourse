package Day9;

public class _07_Increment {
    public static void main(String[] args) {

        int x = 1;
        x = x + 1; //increment means increasing a number

        System.out.println(x);

        x++; //same as line 7, so this incrementing the x by 1

        int y = 3;
        System.out.println(y);
        y = y + 1; // this increased the y value by ome
        System.out.println(y);

        // x += 1, ++x and x++ are same

        int a = 4;
        int b = a++; //this here first shares its value to b and then increment its value to 2, but it is too late
        //if it was written as ++b scenario would be different
        System.out.println(b);

        int k = 2;
        int l = ++k;
        System.out.println(l); //k = k + 1; int l = k
        //first it will increment the k and then assign its value to l

        int f = 5;
        int f1 = 7;
        System.out.println(f); // only printing
        System.out.println(f++); // will print after print this will increase by one

        System.out.println(++f1); // will increase by 1 and print




















    }
}
