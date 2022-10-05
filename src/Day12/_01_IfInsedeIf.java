package Day12;

public class _01_IfInsedeIf {

    public static void main(String[] args) {

       // we are creating a new if inside if
        //so lets say there are 2 regulations for loan 1-) income percentage 2-) credit score
        // you first need to pass the first if and after that you are gonna check the credit score through out
        // new if else condition and after that you may tell the result

        boolean hasHighIncome = true;
        int creditScore = 790;

        if (hasHighIncome) {

            if (creditScore > 740) {
                System.out.println("You are eligible for loan!");
            } else {
                System.out.println("Your credit score is not good enough for loan!");
            }

        } else {
            System.out.println("You are not eligible for loan!");
        }

    }

}
//if we




















