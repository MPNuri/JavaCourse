package Day28;

public class Main {

    public static void main(String[] args) {

        // when we crate a object we use new key word


        Dog lucy = new Dog(); // create a new Dog Object
        lucy.breed = "Neapolitan Mastif";   // Now I can use properties from Dog class
        lucy.size = "Large"; // initialized size property for lucy object
        lucy.age = 5;
        lucy.color = "black";

        System.out.println("Lucy breed" + lucy.breed);

        lucy.eat();

        lucy.sleep(); // we are calling this method first and then printing the variable
        System.out.println(lucy.isSleeping);

        lucy.snoring();

        ///////////////////////////////////////////////////////////////////////

        Dog max = new Dog();

        // I am now able to use all the fields and methods from Dog class

        max.breed = "Maltese";   // Now I can use properties from Dog class for max
        max.size = "small"; // initialized size property for max object
        max.age = 3;
        max.color = "white";

        System.out.println("Max breed " + max.breed);
        System.out.println("Max color" + max.color);


        max.sleep();
        System.out.println("is max sleeping now = " + max.isSleeping);

        max.wakeUp();
        System.out.println("is max sleeping = " + max.isSleeping);

        ///////////////////////////////////////////////////////////////

        Dog cooper = new Dog();

        cooper.breed = "Chow Chow";   // Now I can use properties from Dog class
        cooper.size = "medium"; // initialized size property for lucy object
        cooper.age = 2;
        cooper.color = "cooper";

        System.out.println("Cooper age = " + cooper.age);
        System.out.println("Cooper breed = " + cooper.breed);

        cooper.sleep();
        System.out.println("is cooper sleeping = " + cooper.isSleeping);

        cooper.snoring(); // "ZzZzZzZzZ.... "







    }
}
