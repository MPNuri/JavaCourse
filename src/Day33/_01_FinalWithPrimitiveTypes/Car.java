package Day33._01_FinalWithPrimitiveTypes;

public class Car {

    public String name;
    public final int YEAR; // constant
    // apparently every car has its own year, and it cannot change.
    // so we need a logic that makes every model year fixed but changeable to each car

    public Car(int year) {
        this.YEAR = year;
        // now every car can have different fixed year
    }






}
