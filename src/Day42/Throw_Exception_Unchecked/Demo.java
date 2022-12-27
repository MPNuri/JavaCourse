package Day42.Throw_Exception_Unchecked;

public class Demo {
    public static void main(String[] args) {


        Account account = new Account();
        // account.deposit(-15); when we enter negative amount app. will crash
        account.withdraw(50);

        System.out.println(account.money);


















    }
}
