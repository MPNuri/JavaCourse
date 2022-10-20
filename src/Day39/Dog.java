package Day39;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println("Dogs run like a runner");
    }

    @Override
    public void eat() {
        System.out.println("dogs able to eat everything");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleeps for several times in a day but less than cats");
    }











}
