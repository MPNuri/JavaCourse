package Day39.Vehicle;

public abstract class Vehicle {


    // Abstract methods can be overloaded
    // we can use the abstract keyword only for classes and methods
    // Abstracts cannot be used for fields and variables

    private int year;
    private int horsePower;

    public Vehicle(int year, int horsePower) {
        this.horsePower = horsePower;
        this.year = year;
    }


    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }


    public abstract void move();

    public abstract void move(int year);  // Abstract methods can be overloaded

    public abstract void fuelUp();





}
