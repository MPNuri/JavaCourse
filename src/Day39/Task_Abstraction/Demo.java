package Day39.Task_Abstraction;

public class Demo {
    public static void main(String[] args) throws IllegalAccessException {


        //    create Demo class to check:
        //        debit card cannot overdraft
        //        credit card can overdraft

        BankCard card = new Debit_Card(1561516, "Muriloooo");

        card.deposit(500);
        System.out.println(card.getMoney());
        card.withdraw(250);

        System.out.println(card.getMoney());
        System.out.println(card.getSsn());
        System.out.println(card.getName());

        BankCard creditCard = new Credit_Card(16161689, "Muriloooo");

        creditCard.withdraw(55);
        System.out.println(creditCard.getMoney());

        System.out.println(creditCard.getName());
        System.out.println(creditCard.getSsn());


        creditCard.setMoney(500);
        System.out.println(creditCard.getMoney());

    }
}
