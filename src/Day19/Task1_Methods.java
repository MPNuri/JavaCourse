package Day19;

public class Task1_Methods {
    public static void main(String[] args) {

        // create a function prints 0 to 10
        // whenever I create this function this will be printed

        functionNumbers0to10();
    }

    public static void functionNumbers0to10 () {

        int total = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            total = total + i;
        }

        System.out.println(total);

    }


}
