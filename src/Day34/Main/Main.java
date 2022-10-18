package Day34.Main;

import Day29.hOMEWORK.Employee;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Employee_Class employee = new Employee_Class("jack", 65864561);

        employee.setBaseSalary(15_313);
        employee.setHourlyRate(33);
        System.out.println(employee.getName());
        System.out.println("Base salary " + employee.getBaseSalary());
        System.out.println("hourly rate " + employee.getHourlyRate());

        int wage = employee.wageCalculator(41);
        System.out.println("wage " + wage);


        // now through getter and setter we could get the declared stuff initialize under method fields and methods
        // and in this class we can only read the variables.
        // we cannot update anything because our information is private

        /** now we cannot update name and ssn,
         *  but we can change through typing manually base salary and hourly rate
         */

        // watch the first video as recap to get more note









    }
}
