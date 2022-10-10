package Day19;

public class _02_MethodsParameters2 {

    //lets see how to get 2 and more parameters
    public static void main(String[] args) {

        greeting("Lebron ", "James");


    }





    public static void greeting(String firstName, String lastName) {
        // the return type is void
        // just by using , we can type more than 1 input in the parameter section
        System.out.println("hello " + firstName + " " + lastName);


    }
}
