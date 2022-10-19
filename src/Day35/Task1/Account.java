package Day35.Task1;

public class Account {


    private String userId;
    private double balance;

    // constructor fo userId
    public Account(String userId) {
        this.userId = userId ;
    }

    // getter for balance
    public double getBalance() throws IllegalAccessException {
       if (balance<1)
           throw new IllegalAccessException("cannot deposit lower than 1");
       return balance;
       }

    // setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }










}

