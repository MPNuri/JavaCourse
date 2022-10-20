package Day40.Car;

public class Tesla extends Car implements EvCar{


    public Tesla(String make, String model, int year) {
        super(make,model,year);
    }


    @Override
    public void charge() {
        System.out.println("charge every 500 miles");
    }

    @Override
    public void battery() {
        System.out.println("change battery every 100_000 miles");
    }












}
