package Day35.Task1;

public class MeinClaus {
    public static void main(String[] args) throws IllegalAccessException {


        Account mein = new Account("Murillo");
        mein.setBalance(28_973);
        System.out.println(mein.getBalance());

        System.out.println(mein.getUserId());

        ////

        BankAccount account = new BankAccount("MpN", Currency.EURO);
        account.deposit(5000);
        account.withdraw(3500);


        System.out.println(account.userId);

        System.out.println(account.getBalance());

        BankAccount.calculationOfTotal();











    }
}
