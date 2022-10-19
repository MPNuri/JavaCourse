package Day35;

public class Cat extends Animal{

    String type;

    public Cat(String name, int age, String type) {
        super(name, age); // calling parent constructor
        this.type = type;
    }

    public void catchFly() {
        System.out.println("cat is catching birds");
    }









}
