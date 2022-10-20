package Day40.Inheritance;

public class SpaceShip implements Sailing,Flying, InheritanceVehicle {


    @Override
    public void speed() {
        System.out.println("spaceship are the fastest");
    }

    @Override
    public void flying() {
        System.out.println("spaceship can fly");
    }

    @Override
    public void sail() {
        System.out.println("spaceships can sail");
    }
}
