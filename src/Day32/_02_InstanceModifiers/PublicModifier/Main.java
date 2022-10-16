package Day32._02_InstanceModifiers.PublicModifier;


public class Main {
    public static void main(String[] args) {

        // Public modifier, method or fields can be printed anywhere


        Car car = new Car("Audi");
        // able to print the constructor because modifier is public

        System.out.println(car.carName);
        // able to print field because modifier is public

        car.printCarName();
        // able to print method because modifier is public

    }
}
