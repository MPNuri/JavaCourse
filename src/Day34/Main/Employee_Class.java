package Day34.Main;

import Day29.hOMEWORK.Employee;

public class Employee_Class {



    // now these variables are inaccessible
    private String name;
    private int SSN;
    private int baseSalary;
    private int hourlyRate;

    // constructor.
    public Employee_Class( String name,int ssn) {
        this.name = name;
        this.SSN = ssn;
    }


    public int wageCalculator(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    // getter -- we can reach the name (-even if it is private-) through this method
    public String getName() {
        return name;
    }

    // getter for ssn ---
    public int getBaseSalary() {
        return baseSalary;
    }

    // setter for ssn ---
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }


    // getter
    public int getHourlyRate() throws IllegalAccessException {
        if (hourlyRate<0)
            throw new IllegalAccessException("cannot be lower than 0");
        return hourlyRate;
    }

    // setter
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


















}
