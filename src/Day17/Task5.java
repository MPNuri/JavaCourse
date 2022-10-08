package Day17;

public class Task5 {
    public static void main(String[] args) {

        // PART 1
        // declare an array of veggies and initialize it with some values use array = {}
        // print all elements

        // PART 2
        // make a copy of that array (by values)



        String[] array1 = {"tomato", "cucumber", "broccoli", "xx"};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


        String[] array2 = array1; // this way we are copying the string 1 not the current value
        // IF I WERE TO USE LIKE THIS WHEN I CHANGE THE FIRST ARRAY STRING SECOND WILL CHANGE AUTO

        String[] arrayCopy2 = new String[array1.length];

        for (int i = 0; i< array1.length; i++) {
            array2[i] = array1[i];

            System.out.println(array2[i]);
        }







    }
}
