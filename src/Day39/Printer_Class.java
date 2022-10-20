package Day39;

public class Printer_Class {
    public static void main(String[] args) {

        // Animal animal = new Animal("any", 0);
        // as we see abstract class cannot take in place as object


        Cat cats = new Cat("Misir", 8);

        cats.eat();
        cats.move();
        cats.sleep();

        Dog dogs = new Dog("Zeus", 6);

        dogs.eat();
        dogs.move();
        dogs.sleep();













    }
}
