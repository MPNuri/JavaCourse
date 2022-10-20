package Day40.Inheritance;

public class Boat implements Sailing,InheritanceVehicle{

    @Override
    public void sail() {
        System.out.println("boat can sail ");
    }

    @Override
    public void speed() {
        System.out.println("boat has speed");
    }
}
