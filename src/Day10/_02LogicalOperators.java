package Day10;

import Day11.MathClass;

import java.util.Random;

public class _02LogicalOperators {
    public static void main(String[] args) {


       //            AND OPERATOR


        // if we use AND operator both condition must be true
        Random random = new Random();
        int temperature;
        temperature = random.nextInt(100);
        System.out.println(temperature);
        boolean iswarm = temperature <30 && temperature > 20; //AND operator

        System.out.println(iswarm);
        // here we are creating a range which calls if wheater is warm or not



       //           OR OPERATOR


        // OR CONDITIONS
        //In order to apply a loan you can have either a good income or high credit score
        // Even if one of the condition is wrong our customer will get the loan

        boolean hasGoodCredit = true;
        boolean hasHighIncome = false;

        boolean isEligible = hasGoodCredit || hasHighIncome; // OR operator ||
        System.out.println(isEligible);
























    }
}
