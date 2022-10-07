package Day14;

public class task1Whileloop {
    public static void main(String[] args) {


        int counter = 0;
        int total = 0;

        while (counter <= 100) {

            total = counter + total;
            counter++;
        }

        System.out.println(total);






    }
}
