package Day12;

public class _02_TernaryOperator {
    public static void main(String[] args) {

        // we are going to see a shorter way to solve if else condition
        // this method is being used on very simple if else conditions


        int income = 175_000;
        // normally we go like this

      /*  if (income > 100_00)
           System.out.println("business class");
        } else {
            System.out.println("economy class");
        }
        */ // here is the shorter way


        String incomeAndFlights = income > 100_000 ? "First class" : "Economy class";
        System.out.println(incomeAndFlights);






    }
}
