package Day31;

public class BankAccount {

    String customerName;
    int customerSSN;
    String customerAddress;
    double customerBalance = 0;

    /**
     * first -- constructors are must be named as class name
     * constructor must not have a return type
     **/

    public BankAccount(String customerName, int customerSSN) {
        //there is basically not much reason other than having a straight perspective
        this.customerName = customerName; // here field and parameter names are same. we need to use THIS.
        this.customerSSN = customerSSN;
        // just like this, now we know left one represents fields right one represents parameter field
    }

    // constructor overloading
    public BankAccount(String customerName, int customerSSN, String customerAddress) {
        this.customerName = customerName;
        this.customerSSN = customerSSN;
        this.customerAddress = customerAddress;
    }


        static double totalBalance= 0;

    void deposit(double moneyToDeposit) {
        customerBalance += moneyToDeposit;
        totalBalance += moneyToDeposit;
    }

    void withdraw(double moneyToWithdraw) {
        customerBalance -= moneyToWithdraw;
        totalBalance -= moneyToWithdraw;
    }

}
