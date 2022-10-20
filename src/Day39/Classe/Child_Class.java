package Day39.Classe;

public class Child_Class extends Abstract {

    // non-abstract classes cannot include abstract class
    // but if there is inheritance relationship child classes can contain abstract classes afterwords

    @Override
    public void abstractMethod() {
        System.out.println("this is implementation of abstract method!");
    }


}
