package Day32;

import Day32._02_InstanceModifiers.Protected.Person;

public class MainPerson extends Person {
    public static void main(String[] args) {

        MainPerson main = new MainPerson();
        main.name = "nuri";
        main.printTheName();


    }
}
