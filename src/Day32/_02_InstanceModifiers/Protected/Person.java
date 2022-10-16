package Day32._02_InstanceModifiers.Protected;

public class Person {

    protected String  name;

    protected Person() {}

    protected void printTheName () {
        System.out.println(name);
    }

    // see the Package_Accessor in Day32
    // using extends + name of the Class we can subclasses the other classes to each other and then process our job
    /**
     * first create the object based the Main class name and then use these methods through extend Person right after the Class name
     */

}
