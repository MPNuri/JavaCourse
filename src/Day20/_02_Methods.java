package Day20;

public class _02_Methods {
    public static void main(String[] args) {

        int[] intarray = {1,2,3,4,5,6,7,8,9,11,12,13,14};
        printArray(intarray);

        int[] intarray2 = {11,64,64879,315,1354,31654,17};
        printArray(intarray2);


    }



    public static void printArray(int[] intArray) { //here printArray is the method name and inside parantesses are parameters
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
}






}
