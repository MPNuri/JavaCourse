package Day39.Task_Abstraction;

import javax.swing.*;

public abstract class BankCard {

    //TASK
    //
    //    - Create a BankCard parent class (Abstract Class)
    //        -methods: deposit and withdraw (abstract methods)
    //        -variable: create as you need(name, ssn...) (use encapsulation)

    private int ssn;
    private String name;

    private int money = 0;

    BankCard(int ssn, String name) {
        this.name = name;
        this.ssn = ssn;
    }

    public int getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    abstract void deposit(int moneyToDeposit) throws IllegalAccessException;

    abstract void withdraw(int moneyToWithdraw) throws IllegalAccessException;




}
