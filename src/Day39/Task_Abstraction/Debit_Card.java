package Day39.Task_Abstraction;

public class Debit_Card extends BankCard{

    //    - Create two types of cards, credit and debit that extend BankCard class
    //        -debit card cannot overdraft (while implementing abstract methods do it accordingly)

   Debit_Card(int ssn, String name) {
       super(ssn, name);
   }

    @Override
    void deposit(int moneyToDeposit) throws IllegalAccessException {
        if (moneyToDeposit < 0)
            throw new IllegalAccessException("please enter valid amount");
        setMoney(getMoney() + moneyToDeposit);
    }


    @Override
    void withdraw(int moneyToWithdraw) throws IllegalAccessException {
        if (moneyToWithdraw<0)
            throw new IllegalAccessException("you cannot withdraw more than the amount");
        if (moneyToWithdraw > getMoney())
            throw new IllegalAccessException("you cannot withdraw the amount you entered");
        setMoney(getMoney() - moneyToWithdraw);
    }



}
