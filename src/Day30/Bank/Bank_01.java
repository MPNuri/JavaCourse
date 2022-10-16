package Day30.Bank;

public class Bank_01 {

    String customerName;
    static double customerBalance;



    static int bankMoney = 0;

    static void deposit(double amountOfMoney) {
        customerBalance += amountOfMoney;
        bankMoney += amountOfMoney;
    }

    static void withdraw(double amounOfMoneyW) {
        bankMoney -= amounOfMoneyW;
    }

    static void totalBankMoney() {
        System.out.println(bankMoney+customerBalance);

    }

}
