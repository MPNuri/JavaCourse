package Day16.Arrays;

public class _03_JavaArrays {
    public static void main(String[] args) {


        //here we are looking for string array
        // initialized the size here
        String[] carsArray = new String[5];

        carsArray[0]= "mercedes";
        carsArray[1]= "ford";
        carsArray[2]= "tesla";
        carsArray[3]= "honda";
        carsArray[4]= "toyota";
        // value is initialized here

        System.out.println(carsArray[0]);
        System.out.println(carsArray[3]);

        String[] studentsArray = {"mario", "nigar", "ali", "faruk"};

        //updating the array number 3 value
        studentsArray[3] = "talal";

        System.out.println(studentsArray.length);
















    }
}
