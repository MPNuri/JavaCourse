package Day9;

public class _08_AssignmentOperators {

    public static void main(String[] args) {


      int x = 46; // simple assignment of value to x from 46
      int y = x;  //assignment of variable to y from x


        x = x + 4;
        // assigning new value to X by increasing by 4
        System.out.println(x);

        //However, have an easier way

        int z = 6;
        z += 4; // this means z = z + 4
        // increase value of y by 4
        System.out.println(z);

        int k = 10;
        k += 10;
        System.out.println(k);
        // which means increase the K s value by 10

        // this method works for subtraction as well so;

        int d = 86;
        d -= 51;
        System.out.println(d); // answer: 35

        int a = 10;
        a *= 5;
        System.out.println(a); // a * 5 = 50; multiply value of a by 5

        int p = 8;
        p /= 4;
        System.out.println(p); // 8 divided by 4

        int s = 79;
        s %= 11;
        System.out.println(s);




















    }
}
