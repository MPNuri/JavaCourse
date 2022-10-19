package Day38.Cars;

public class Demo_Cars {
    public static void main(String[] args) {

        // eve though objects are same they act differently
        // this is how Polymorphism works

        Vehicle sportCar = new Sport_Car();
        Vehicle trucks = new Truck();
        Vehicle vehicle = new Vehicle();



        sportCar.carGoes();

        trucks.carGoes();

        vehicle.carGoes();











    }


}
