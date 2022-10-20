package Day40.Car;

public class Prius extends Car implements Diesel, EvCar{

    public Prius(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void charge() {
        System.out.println("charge the Prius when needed");
    }

    @Override
    public void battery() {
        System.out.println("replace the battery at 1_000_000 miles");
    }

    @Override
    public void fuelUp() {
        System.out.println("fuel up every 800 miles");
    }

    @Override
    public void changeOil() {
        System.out.println("change oil every 8000 miles");
    }


}
