package Day34.Enums;

public enum Directions {

    // Enums can have constructors

    EAST("E", 5),
    WEST("W", 3),
    NORTH("N", 9),
    SOUTH("S", 1);

    final String shortName;
    int number;

     Directions(String shortName, int number) {
        this.shortName = shortName;
        this.number = number;

    }





}
