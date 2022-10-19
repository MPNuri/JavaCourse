package Day38.Polymorphism_Task;

public class Main {
    public static void main(String[] args) {


        //- Create Main class
        //    * create objects (Animal animal1 = new Cat(); - Animal animal2 = new Dog(); ....)
        //    * call the run() and makeSound() method for each object

        Animal misir = new Cat();

        misir.makeSound();
        misir.run();
        misir.run(5);
        misir.run(15, "meters");

        System.out.println();

        Animal zeus = new Dog();

        zeus.makeSound();
        zeus.run();
        zeus.run(23);
        zeus.run(25,"miles");

        System.out.println();

        Animal hornsy = new Horse();

        hornsy.makeSound();
        hornsy.run();
        hornsy.run(75);
        hornsy.run(56,"miles");







    }
}
