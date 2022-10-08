package Day17;

public class _01_PrintingArrayWithLoop {
    public static void main(String[] args) {


        int[] numbers = {2, 45, 20, 135, 4, 65, 9};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);

        // instead of printing one by one use for i method

        for (int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }










    }
}
