package Day29.hOMEWORK;

import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class Company {
  /*  -Part 2-
    Create a class called Company with following fields and methods:
    a) companyName (field)
    b) yearCompanyFounded (field)
    c) companyField (field)
    d) ownerOfCompany (field)
    e) employee (field - type of field should be Employee!)

    f) hireEmployee (method - when you call this method you're going to initialize employee details - you need to get employee details as parameters)
    g) fireEmployee (method - when you call this method you're going to remove employee object <employee object should be null>)
    h) printProperties (method - if employee object is not null then this method should print employee information as well)


   */

    String companyName;
    int yearCompanyFounded;
    String companyField;
    String ownerOfCompany;
    Employee employeeValues;

    void companyProperties() {
        System.out.println("About company = " + (companyName + " " + companyField + " " + ownerOfCompany + " " + yearCompanyFounded));
    }


    // the reason we are using parameters is that we are not initializing if we initialize every company would hire the same guy
    // which we do not want.
    void hireEmployee(String employeeName, String employeeTitle, int employeeSsn) {
        employeeValues = new Employee();
        employeeValues.employeeName = employeeName;
        employeeValues.title = employeeTitle;
        employeeValues.ssn = employeeSsn;

    }

    void fireEmployee() {
        employeeValues = null;
    }

    void printProperties() {

        System.out.println("Company Name: " + companyName);
        System.out.println("Year " + companyName + " Founded " + yearCompanyFounded);
        System.out.println("Company Field: " + companyField);
        System.out.println("Owner of Company: " + ownerOfCompany);
        if (employeeValues != null)
            employeeValues.employeeProperties();
    }






}
