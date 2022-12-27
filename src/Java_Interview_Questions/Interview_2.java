package Java_Interview_Questions;

public class Interview_2 {
    public static void main(String[] args) {

        int ASCIIvalue = 'c';
        System.out.println(ASCIIvalue);


        int num1 = 30;
        int num2 = 4;

        int remainder = num1 % num2;
        int qutient = num1 / num2;

        System.out.println(remainder);
        System.out.println(qutient);

        System.out.println("****************************");

        // great example for primitive types logic
        //  question = make a = 7 b = 4
        int a = 4;
        int b = 7;
        int c;

        c = a; // now a = empty, c = 4;
        a = b; // now a = 7, b is empty
        b = c; // now b = 4, c is empty




        System.out.println(a);
        System.out.println(b);


        System.out.println("**************************");



        // leap year question not using if else statement =>

        int leapYear = 200;
        String result = ((leapYear%4 == 0 && leapYear % 100!= 0)? "Lep year" : (leapYear % 400 == 0)? "leap year" : "is not leap year");

        System.out.println(result);


        System.out.println("***************************");



        int num101 = 10;


        for (int i = 0; i <= num101; i++) {
            for (int j = 0; j <= num101; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
        }
















    }
}
