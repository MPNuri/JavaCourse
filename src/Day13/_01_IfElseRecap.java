package Day13;

public class _01_IfElseRecap {
    public static void main(String[] args) {


        /*
        Basic Structure of If Else

        if (condition) {
        sout

        } else if (another condition) {
        sout (this will be printed if first condition is not true)

        } else {
        sout (if non of the conditions does not apply print this)
        }
  */
        int income = 120_000;
        boolean hasHighIncome;

        if (income > 100_000) {
            hasHighIncome = true;
        } else {
            hasHighIncome = false;
        }
        System.out.println(hasHighIncome);





























    }
}
