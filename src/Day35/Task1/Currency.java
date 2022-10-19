package Day35.Task1;

public enum Currency {

    USD,
    EURO
}



class BankAccount {

    String userId;
    double balance;
    Currency currency;

    // constructor
    public BankAccount(String userId, Currency currency) {
        this.userId = userId;
        this.currency = currency;

    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }




    public double deposit(double balance) throws IllegalAccessException {
       this.balance = balance;
       totalMoney += balance;
       if (balance < 0)
            throw new IllegalAccessException("please try again");
       balance++;
        return balance;
    }

    public double withdraw(double balance) throws IllegalAccessException {
        this.balance = balance;
        totalMoney -= balance;
        if (balance < 0)
            throw new IllegalAccessException("please try again");
        balance--;
        return balance;
    }

    // for -- checking total balance
    static int totalMoney = 0;

    static void calculationOfTotal() throws IllegalAccessException{

        if (totalMoney<0)
            throw new IllegalAccessException("your balance is under 0 please deposit money" );
        System.out.println(totalMoney);
    }





}