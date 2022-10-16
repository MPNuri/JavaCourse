package Day32._01_AccessModifierForClasses.PackageTwo;

import Day32._01_AccessModifierForClasses.PackageOne.Boat;
import Day32._01_AccessModifierForClasses.PackageOne.Car;
// from here we can either first create the importers or call the importers through creating new objects
// import Day32._01_AccessModifierForClasses.PackageOne.Plane; this class cannot be extended because it is default class
public class Main_02 {
    public static void main(String[] args) {


        Car car = new Car();

        Boat boat = new Boat();

       /* Plane plane = new plane();
       unavailable because Plane class is not public and (default)
       The access modifier is default */

    }
}
