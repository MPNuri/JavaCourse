package Day40;


public interface FirstInterface {


    // every interface methods are both public and abstract by default.
    public void method2 ();
    abstract void method1 ();
    void method3 (); // ---> public and abstract by default.
    // since this method abstract we cannot use body in this method

    /**  Abstract
     *
     * We cannot create set object --- Set<String> set = new Set<>();
     * Set is an interface to all type of sets -- hashSet, LinkedHashSet, treeSet.
     -   in Set interface none of the methods are implemented. Each set implement methods differently.
     -   Also Set interface is extends by Collection Interface

     * All the variables in Interfaces are by default "Public", "Static", "Final"

     * When you inherit from Interface class you must Override every Method
     */


    static int number = 1;
    public char c = 'c';
    final double dN = 5.7;

    boolean x = true;
    // ---> SO THIS IS ACTUALLY public static final boolean x = true;

    /**
     - Like the Abstract classes, Interfaces cannot be used to create object.
     - Interface methods do not have body
     - All methods inside Interface class has to be Overridden
     - Interfaces cannot have non-abstract methods
     - Interface cannot have Constructors
     - Interfaces must be declared public
     */







































}
