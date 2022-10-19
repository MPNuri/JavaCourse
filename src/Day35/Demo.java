package Day35;

import java.util.concurrent.Callable;

public class Demo {
    public static void main(String[] args) {


        Penguins penguins = new Penguins("Viuck", 13);

        penguins.name = "viaak";
        System.out.println(penguins.name);

        penguins.sleep();
        penguins.eat();

        // as we see we do not need to rewrite all these variables.
        // we can use the super class for our child class.


        Dog doggy = new Dog("Zeus", 8);

        doggy.type = "german and lesbian mixed";
        System.out.println(doggy.type);
        System.out.println(doggy.age);

        doggy.sleep();
        doggy.eat();
        doggy.licker();

        Cat kedy = new Cat("Misir", 8, "Fluffy");

        kedy.catchFly();
        kedy.eat();
        kedy.sleep();

        System.out.println(kedy.age);


        Tiger tigery = new Tiger("MpN", 9);

        tigery.color = "orange";

        System.out.println(tigery.name);
        System.out.println(tigery.color);

        tigery.tigerSize();
        tigery.eat();












    }
}
