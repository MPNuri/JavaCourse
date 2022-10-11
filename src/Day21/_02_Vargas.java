package Day21;

public class _02_Vargas {
    public static void main(String[] args) {


        // varargs are parameters to call as much as input we want

        /**  Instead of using the overloading methods, just like below we can use varargs  **/

        // In the last chapter we saw there is a way to overload a method.
        // right now we are going to use variable arguments shortly called varargs
        // instead of adding by hand over and over and over again we use VARIABLE ARGUMENTS to have unlimited varieties

        System.out.println(sum(5,6,9,88,2));

    }

    // we are going to add as much as int we want, but we do not know how many we will use
        public static int sum(int... varargs) {

        int sum = 0;
        for (int i = 0; i < varargs.length; i++) {
            sum += varargs[i];
            }
        return sum;

    }













}
