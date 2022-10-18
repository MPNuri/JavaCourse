package Day11;

public class MathClass {
    public static void main(String[] args) {


        // 1-)
        // gives us absolute value of the variables
        // |value| even if the value is negative number this will convert into positive
        int a = 1;
        int b = 2;
        int c = -3;
        System.out.println(Math.abs(c)); // answer; 3

        //2-) max method
        System.out.println(Math.max(a, b));  // gives you the maximum value

        //3-) min method
        System.out.println(Math.min(a, b)); // gives you minimum value

        //4-) round method
        System.out.println(Math.round(3.6)); // will round to nearest, here the number 4 as int
        System.out.println(Math.round(3.5)); // will round to nearest, here number 4 as int
        System.out.println(Math.round(3.4)); // will round to nearest, here number 3 as int

        //5-) ceil method
        System.out.println(Math.ceil(69.2)); // will always round to bigger number, as double

        //6-) floor method
        System.out.println(Math.floor(46.8)); // will always round to the smaller number 46
        System.out.println(Math.floor(7.999925)); // answer; 7 as double

        //7-) square method
        System.out.println(Math.sqrt(16)); //Karekok method answer; 4 | as double

        //8-)Power of method
        System.out.println(Math.pow(2 , 7)); // power of method answer; 128 | as double

        //9-) This will return a random number between (0-1)
        System.out.println("Random Number= " + Math.random());

        // 0<------------>1 The Random Number Method
        // luckily we can extend this method see below
        System.out.println(Math.random() * 100); // or even
        System.out.println(Math.random() * 15 - 46 ); //this will be between  [-46 , 31)

        int randomNumberInINT = (int) (Math.random() * 100);
        System.out.println(randomNumberInINT);
                                // we are first going to do math.random part and just after that we can convert into int
        // if we try to first convert into int then multiply by 100 we could have only 0 or 100 as an asnwer



        int x = (int) (Math.random()* 4 -10  );
        System.out.println(x);















    }
}
