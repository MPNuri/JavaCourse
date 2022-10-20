package Day40.Inheritance;

public class Train implements InheritanceVehicle{

    @Override
    public void speed() {
        System.out.println("train goes slow but can carry heavy stuff");
    }
}
