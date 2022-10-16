package Day32._02_InstanceModifiers.PrivateModifier;

public class main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        //  cat.catName;
        //  cat.printCatName();
        //  inaccessible because field is private
        //  fields can only be accessed in the same class where they declared


        //   Cat cat1 = new Cat("muri");
        // inaccessible because constructor is private
        //  fields can only be accessed in the same class where they declared


        cat.setCatName("s");
        cat.getCatName();


    }

}
