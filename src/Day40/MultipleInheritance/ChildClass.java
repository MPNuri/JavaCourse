package Day40.MultipleInheritance;

public class ChildClass implements Parent1, Parent2 {

    /** we cannot inherit from 2 different classes,
        but we can inherit from multiple classes **/

    @Override
    public void methodOne() {
        System.out.println(variable1);
    }

    // we have this same method name in both parent classes
    // but overriding once is enough
    @Override
    public void methodTwo() {
        System.out.println(Parent1.variable2);
    }

    @Override
    public void methodThree() {
        System.out.println(Parent2.variable2);
    }










}
