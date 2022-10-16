package Day31.StaticRecap;

public class _02_StaticMethods {

    int nonStatic = 10;
    static int staticNumber = 20;

    public static void staticMethod() {
        //  System.out.println(nonStatic);  we cannot call this because we need object
        System.out.println(staticNumber); // we can call this method
        // nonStaticMethod(); error because we cannot access non-static methods without objects
        staticMethod2(); // able to access because this one is a static method
    }

    public static void staticMethod2() {
        System.out.println("static Method");
    }

    public void nonStaticMethod() {
        System.out.println(nonStatic);
        System.out.println(staticNumber);
        staticMethod();
        nonStaticMethod2();

        // non-static is available to print them all

    }

    public void nonStaticMethod2() {
        System.out.println("non static method");
        staticMethod();
        nonStatic = 5;
    }













    }
