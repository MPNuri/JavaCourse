package Day28;

public class Dog {

    // Properties of a Dog --- Fields

    String breed;
    String size;
    int age;
    String color;
    boolean isSleeping;


    // behaviours of a dog --- Methods

    public void eat() {
        System.out.println("The dog is eating");
    }

    public void sleep() {
    isSleeping = true;
    }

    void  wakeUp() {
        isSleeping = false;
    }

    void snoring() {
        if (isSleeping)
            System.out.println("ZzZzZzZzZz");
    }












}
