package Day39.Vehicle;

public class Main {
    public static void main(String[] args) {

    //    Vehicle vehicle = new Vehicle(4, 6) cannot create since this is an abstract class


        Vehicle vehicle = new SportsCar(17, 115);

        vehicle.move();
        vehicle.move(205); // overloaded method in SportsCar class
        vehicle.fuelUp();

        System.out.println(vehicle.getHorsePower());
        System.out.println(vehicle.getYear());

















    }

}
