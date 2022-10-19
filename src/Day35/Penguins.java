package Day35;

public class Penguins extends Animal {




    // coming from parents (Animal) class
    // we actually have name and age fields in the animal class
    // we also have sleep and eat methods in the animal class
    // So we do not need to rewrite

    //String name;
    //int age;
    int height;
    int weight;

    // but for the constructor we need to use super key word.
    // we can also extend the constructor using more variables
    public Penguins(String name, int age) {
        super(name, age); // calling parent constructor
    }





}
