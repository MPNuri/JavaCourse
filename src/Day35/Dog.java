package Day35;

public class Dog extends Animal{

    // name and age fields are inherited
    // eat and sleep methods are inherited

    String type;



    public Dog(String name, int age) {
        super(name, age); // calling parent constructor
    }


    public void licker() {
        System.out.println("dog is licking itself");
    }

}
