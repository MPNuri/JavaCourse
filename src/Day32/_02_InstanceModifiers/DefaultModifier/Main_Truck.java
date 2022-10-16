package Day32._02_InstanceModifiers.DefaultModifier;

public class Main_Truck {
    public static void main(String[] args) {

        /** Our Truck Modifier Constructor and method are inside same package.
         * so we are able to process.
         * If we try to object them outside the package we would not be able to print
         **/

        Truck truck = new Truck("Dodge RAM");

        System.out.println(truck.truckName);

        truck.printTruckName();

    }
}
