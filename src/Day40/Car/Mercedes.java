package Day40.Car;

public class Mercedes extends Car implements Diesel{


    public Mercedes(String make, String model, int year) {
        super(make, model, year);
    }


    @Override
    public void fuelUp() {
        System.out.println("change oil every 10k miles");
    }

    @Override
    public void changeOil() {
        System.out.println("use diesel");
        System.out.println("fuel up every 300 miles");
    }
}
