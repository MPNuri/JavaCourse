package Day30;

public class Car {

    /** instance fields
     * if you wanna reach instance variables you need to have objects
     * to access instance members we need to create an object
     * for each object 1 copy (of each instance variable) will be created
     **/
    String make;
    String model;
    int year;


    /**   Static Members
     *  static fields belongs to class itself (no object needed)
     *  to access static fields we need to call with class name Car.field or Car.method
     *  there will be only 1 copy for static variables to print total
     */
    static int totalVehicle = 0;

    void buyCar() {
        totalVehicle++;
    }


    static void printTotalVehicle() {
        System.out.println(totalVehicle);
        // we can not call non-static methods under static methods directly
        // we have to create object for the non-static members first
        Car cars = new Car();
        cars.buyCar();
    }


}
