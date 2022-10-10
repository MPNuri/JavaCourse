package Day19;

public class Task4_PrintArray {


    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {
        String cars[] = {"honda", "mercedes", "acura", "audi"};
        printArray(cars);
    }


    public static void printArray(String array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



}