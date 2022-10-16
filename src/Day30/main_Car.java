package Day30;

import Day28.TaskPackage.Cat;

public class main_Car {
    public static void main(String[] args) {


        // Static keyword basically is for totalling non - related amount.
        // for example here we created 2 vehicle but if we declared total vehicle number in Car class
        // we would not be able to find total vehicle number according the objects. we would get amount of the same vehicle separately.



        Car car1 = new Car();
        car1.make = "toyota";
        car1.model = "camry ";
        car1.year = 1995;

        car1.buyCar();

        Car car2 = new Car();
        car2.make = "honda";
        car2.model = "accord coupe ";
        car2.year = 2010;

        car1.buyCar();

        Car.printTotalVehicle(); // at the end this will print total purchased vehicle







    }
}
