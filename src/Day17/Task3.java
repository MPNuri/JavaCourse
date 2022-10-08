package Day17;

public class Task3 {
    public static void main(String[] args) {

        String[] fruits = {"apple", "watermelon", "peach", "strawberry", "kiwi"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[4-i]);
        }

        ///////////////////////////////////

        // reverse order
        for (int i = fruits.length - 1; i>=0; i--) {
            System.out.print(fruits[i] + " ");
        }














    }
}
