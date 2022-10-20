package Day39;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name,age);
    }

    @Override
    public void move() {
        System.out.println("cats move fast");
    }

    @Override
    public void eat() {
        System.out.println("cat eats everything");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleeps for several times in a day");
    }


}
