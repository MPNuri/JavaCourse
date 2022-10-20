package Day39.Classe;

public abstract class Abstract {



    public void nonAbstractMethod() {
        System.out.println("non abstract");
    }

    public abstract void abstractMethod();




    /**         Abstracts concept

     * abstract = soyut dusunce

     * so an abstract for Animal method is empty because we cannot tell the same for all kinds
     - basically we create an abstract method or field to fill in the subclass to be able to use the overridden methods

     * // Abstract classes can have both abstract and non-abstract methods but regular classes cannot have abstracted methods

     * // by using ABSTRACT class we will not be able to create an object for that class

     * // Abstract methods do not need body {}

     * //  When you have Abstract method in a parent class its child classes must implement all methods

     * // Abstract methods do not have body BUT will require when inherited

     * // we cannot have ( private abstract void methods(); )
     - because Abstract method needs to be inherited by child classes but if we use private abstract would be useless
     - so it will give compile time error

     * we also cannot use ( final public abstract anyMethod(); )
     -  because abstraction is being used to initialize under a child class.
     -  but final keyword means cannot be replaced or overridden. so this makes the final abstract useless

     * we also cannot have ( public static abstract void anyMethod(); )
     -  because static keyword methods belong to class where it is written.
     -  Since we will not be able to use in any other class it als would be useless



     */


}
