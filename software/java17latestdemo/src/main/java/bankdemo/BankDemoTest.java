package bankdemo;

import java.util.Date;

public class BankDemoTest {
    public static void main(String[] args) {

        Account account=new Account();
        account.accountNumber="123456";
        account.balence=2000;
        account.ifscCode="SBIN0002017";
        account.userName="User2345";
        account.password="123";

        Card card=new Card();
        card.account=account;
        card.cardNumber="123 345 456";
        card.cvv="111";
        card.expiryDate=new Date();

        ATM atm=new ATM();
        atm.atmId="555555";
        atm.balence=5000;
        atm.location="Miyapur";

        Transaction transaction=new Transaction();
        transaction.atm=atm;
        transaction.card=card;
        transaction.widthdrawAmt=2000;
        transaction.transactionId="2222222222222";

        System.out.println(transaction.atm.balence);
    }
}
