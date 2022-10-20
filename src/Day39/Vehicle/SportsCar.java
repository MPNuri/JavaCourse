package Day39.Vehicle;

public class SportsCar extends Vehicle{

    // if we want we can implement SportsCar class,
    // but we have to override the abstracted methods

    public SportsCar(int year, int horsePowe) {
        super(year, horsePowe);
    }

    @Override
    public void move() {
        System.out.println("sports car moves fast");
    }

    @Override
    public void fuelUp() {
        System.out.println("sport car consume 93 oktan");
    }

    // we still have red line under class because we need to implement overloaded method as well

    @Override
    public void move(int miles) {
        System.out.println("Sports car is moving" + miles + "miles");
    }



}
