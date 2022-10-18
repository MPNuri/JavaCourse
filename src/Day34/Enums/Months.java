package Day34.Enums;

public enum Months {

    JANUARY("J"),
    FEBRUARY("F"),
    MARCH("M"),
    APRIL("A"),
    MAY("M"),
    JUNE("J"),
    JULY("J"),
    AUGUST("A"),
    SEPTEMBER("S"),
    OCTOBER("O"),
    NOVEMBER("N"),
    DECEMBER("D");

    final String monthsShort;
    // final, here is for the monthsShort.

    Months(String monthsShort) {
        this.monthsShort = monthsShort;
    }

}
