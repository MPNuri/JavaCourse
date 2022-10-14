package Day28.TaskPackage;

public class Cat {


    // TASK - OOP Intro (Objects and Classes)
    //
    //  Part 1
    //    1-Create a class called Cat with
    //       2 properties and 1 method that prints "Meow" sound
    //
    //    2-Create 2 objects of this class,
    //       set their properties and call their methods


    // Part 2
    // Create a method in Cat class to print cat properties


    int size;
    String name;
    String sex;

    void catSounds() {
        System.out.println("Meow");
    }

        void catProperties() {
            System.out.println(name);
            System.out.println(size);
            System.out.println(sex);

    }

    public static void main(String[] args) {
        Cat kedy = new Cat();

        kedy.size = 85;
        kedy.name = "Misir";
        kedy.sex = "male";

        System.out.println("kedy s name is " + kedy.name);
        System.out.println("misir is" + kedy.size + " cm");
        System.out.println("Misir is a " + kedy.sex);

        System.out.print("Misir always say ");
        kedy.catSounds();

        kedy.catProperties();
        /////////////////////////////////////////////
        Cat mavis = new Cat();

        mavis.size = 65;
        mavis.name = "mavis";
        mavis.sex = "female";

        System.out.println("mavis s name is " + mavis.name);
        System.out.println("mavis is" + mavis.size + " cm");
        System.out.println("mavis is a " + mavis.sex);

        System.out.print("mavis always say ");
        mavis.catSounds();

        mavis.catProperties();




    }

















}
