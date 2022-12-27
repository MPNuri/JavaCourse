package Day42.Throw_Exception_Unchecked;

public class Account {

    double money;

    // unchecked exception

    void deposit(double moneyToDeposit)  {
       if (moneyToDeposit<=0)
           throw new IllegalArgumentException();
        money +=moneyToDeposit;
    }

    void withdraw(double moneyToWithdraw) {
       if (moneyToWithdraw<=0)
           throw new IllegalArgumentException();
       money-=moneyToWithdraw;
    }




}
