package Day34.Enums;

public class Main {
    public static void main(String[] args) {

        /** to print ENUMS we can use these types **/


        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);

        Days lastOfTheWeek = Days.SUNDAY;
        System.out.println(lastOfTheWeek);

        // for a shortcut or a nickname
        System.out.println(Directions.NORTH);
        System.out.println(Directions.NORTH.shortName); // N


        Months months = Months.APRIL;
        System.out.println(months.monthsShort); // A




    }

}
