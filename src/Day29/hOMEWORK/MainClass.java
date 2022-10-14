package Day29.hOMEWORK;

public class MainClass {
    /*
    -Part 3-
    Create main class and create new Company objects and initialize all the properties and print them all!
    Note: When you're initializing employee use hireEmployee and fireEmployee methods do not initialize manually!!!
    */

    public static void main(String[] args) {

        Company companyPrizma = new Company();

        companyPrizma.companyName = "Prizma";
        companyPrizma.yearCompanyFounded = 1992;
        companyPrizma.companyField = "Constraction";
        companyPrizma.ownerOfCompany = "Parlak Family";

        // answer 1-)



        companyPrizma.hireEmployee("Murillo", "labour", 987_654_321);

        // we are going to name the parameters ascending order

        //  companyPrizma.employeeValues = new Employee();  do not forget this
        //  companyPrizma.employeeValues.employeeName = "murillo"
        //  companyPrizma.employeeValues.title = "labour"
        //  companyPrizma.employeeValues.ssn = 987_654_321

        companyPrizma.printProperties();


        companyPrizma.fireEmployee();
        // after fireEmployee method there will only be company info in the terminal
        companyPrizma.printProperties();


















    }









}
