package Day42.Throws_Exception_Checked;

import java.io.IOException;

public class Demo_Class {
    public static void main(String[] args) {

        Account account = new Account();

        /* if your method throws checked exception you have to let them know your method throwing checked exception */


        // now we have to create try catch block to inhibit possible application crash
        // account.withdraw(85); even as we see here method is used correctly we have red underline

        try {
            account.deposit(50); // as we see we have a warning
        } catch (IOException ex) {
            System.out.println("please enter a amount more than 0");
        }













    }
}
