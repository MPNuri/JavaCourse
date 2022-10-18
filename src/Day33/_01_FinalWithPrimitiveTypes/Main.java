package Day33._01_FinalWithPrimitiveTypes;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(2017);

        car.name = "Maserati";
        System.out.println(car.YEAR);
        System.out.println(car.name);

        car.name = "honda"; // updated name of the car we cannot update the name before printing
        //        car.YEAR = 1989; --
        //        will not work because Year is final

        System.out.println(car.name);

        // But we can create a new object and call its year different as well as its name
        Car car1 = new Car(1989);

        car1.name = "Honda";
        System.out.println(car1.YEAR);
        System.out.println(car1.name);

        // car.YEAR = 1;





    }

}
