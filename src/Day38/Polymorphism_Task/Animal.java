package Day38.Polymorphism_Task;

public class Animal {


    //POLYMORPHISM TASK (run time - compile time)
    //
    //- Create a class called Animal
    //    * create methods called run(), makeSound() in Animal class
    //
    //- Create subclasses of Animal: Cat, Dog, Horse
    //    * override makeSound() in subclasses
    //
    //- In Animal class (Overload run method)
    //    * run(int meters) method -> prints something like: Animal runs 4 meters
    //    * run(int units, String unit) method -> prints something like: Animal runs 2 units(kilometer, mile...)


    void run() {
        System.out.println("Especially Horses love running");
    }

    void run(int kilometers) {
        System.out.println("Wild animals at least run " + kilometers + " a day");
    }

    void run(int kilometers, String miles) {
        System.out.println("Animals runs " + kilometers + " " + miles);
    }

    void makeSound() {
    }



}
