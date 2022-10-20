package Day40.Inheritance;

public class Plane implements Flying, InheritanceVehicle{

    @Override
    public void flying() {
        System.out.println("planes can fly");
    }

    @Override
    public void speed() {
        System.out.println("planes can go to every direction faster");
    }
}
