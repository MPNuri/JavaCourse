package Day31.StaticRecap;

public class _01_UsefulMethods {

    // print array method
    // we used static because we just need to print all the arrays
    // static methods are faster if the regulations fit

      public static void printArray(int[] array) {
          for (int i = 0; i < array.length; i++) {
              System.out.println(array[i]);
          }
      }

      // this is instance example

          public void printArrayByHand(int[] array) {
              for (int i = 0; i < array.length; i++) {
                  System.out.println(array[i]);
              }

      }


}
