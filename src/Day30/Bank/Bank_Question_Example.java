package Day30.Bank;

public class Bank_Question_Example {
    public static void main(String[] args) {

        // STUDY THIS

        Bank_01 bankOfAmerica = new Bank_01();

        bankOfAmerica.customerName = "Muriilo";
        Bank_01.customerBalance = 0;

        Bank_01.deposit(500_000);
        Bank_01.withdraw(50);

        ////////////////////////////////////////////////////////////////////////////////////////////////

        Bank_01.totalBankMoney();

        Bank_01 chaseBank = new Bank_01();

        chaseBank.customerName = "MPN";

        Bank_01.deposit(100_000);
        Bank_01.withdraw(10);

        Bank_01.totalBankMoney();




    }
}
