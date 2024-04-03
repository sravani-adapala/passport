package loandemo;

import bankdemo.Account;
import onewaybindingswiggydemo.Address;

public class LoanTest {
    public static void main(String[] args) {
        User1 userName=new User1();

        Address1 userAddress=new Address1();

        userName.firstName="sravani";
        userName.lastName="adapala";
        userName.age=24;
        userName.adharNo="3333333333";
        userName.address1=userAddress;


        userAddress.area="Ameerpet";
        userAddress.flatNo="5/G";
        userAddress.country="India";
        userAddress.pincode="500070";

        LoanService loanService=new LoanService();
        Loan loan=loanService.confirmLoan(userName);

        System.out.println(loan.firstName);
        System.out.println(loan.lastName);
        System.out.println(loan.amount);
        System.out.println(loan.emi);
        System.out.println(loan.loanId);
        System.out.println(loan.rateOfIntrest);
        System.out.println(loan.tenure);







    }
}
