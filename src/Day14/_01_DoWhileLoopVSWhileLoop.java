package Day14;

public class _01_DoWhileLoopVSWhileLoop {
    public static void main(String[] args) {

        int counter = 0;

        while (counter > 1) {
            // when the condition we write is false java will not run for whileloop
            System.out.println("hello");
        counter++;
        }

        // However, in DO while loop even if the condition is wrong we at least WE get to print once
        // DO AND WHILE works together

        int counter2 = 0;

        do {
            System.out.println("hello");
            counter2++;
        } while (counter2 > 1);








    }
}
