package Day42.Throws_Exception_Checked;

import java.io.IOException;

public class Account {

    double balance;

    // checked exception asks us to handle with the exception right away
    // but if we handle here when someone else uses these methods they will not have checked exception
    // we use throws keyword and the exception name right after throws keyword

    void deposit(double moneyToDeposit) throws IOException {
        if (moneyToDeposit<=0)
            throw new IOException();
        balance +=moneyToDeposit;
    }

    void withdraw(double moneyToWithdraw) throws IOException{
        if (moneyToWithdraw<=0)
            throw new IOException();
        balance-=moneyToWithdraw;
    }

}
