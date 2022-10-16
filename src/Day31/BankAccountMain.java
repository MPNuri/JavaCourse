package Day31;

public class BankAccountMain {

    public static void main(String[] args) {

                                                 // we initialized these objects using constructor
        BankAccount bankAccount = new BankAccount("murimo", 661611);
                                      // this here is a constructor
        //   bankAccount.customerAddress = "nem york"
        //   bankAccount.customerSSN = 611563879;
        //   bankAccount.customerName = "dorono";

        // instead of initializing one by one we can call them in a method to shorten our work and
        // make a logic which does not accept deposit without information

        bankAccount.deposit(5000);

        System.out.println(bankAccount.customerBalance);



        BankAccount bankAccount1 = new BankAccount("mpn", 1846316, "dorono");

        bankAccount1.deposit(10_000);

        System.out.println(bankAccount1.customerBalance);

    }
}