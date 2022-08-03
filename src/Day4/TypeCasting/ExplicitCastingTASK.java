package Day4.TypeCasting;

public class ExplicitCastingTASK {
    public static void main(String[] args) {

        double a = 5.3;
        int b = 5 + (int) a;
        System.out.println(b);

//perfectooo

    int student1 = 80;
    int student2 = 95;
    int student3 = 33;
    int student4 = 71;

    int studentaverage = (student1 + student2 + student3 +student4)/ 4;
        System.out.println(studentaverage);

    //here we are only able to print 69 but answer is 69.75
        // for his being happened we need to use double instead of int

    double studentaverage1 = (double) (student1 + student2 + student3 +student4)/ 4;
        System.out.println(studentaverage1);


      //PERFECTOOOO

        //if we were to try
        // double studentaverage1 = (student1 + student2 + student3 +student4)/ 4;
        //this is a mistake because here we would have been done the task in int
        //after the calculation conversion would be happeneed but because int cannot store decimal point
        //our answer would be 69.0) (.75) would not been calculated since int cannot stor or calculate decimal points




    }
}
