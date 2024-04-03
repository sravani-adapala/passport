package loandemo;

import java.rmi.server.UID;
import java.util.UUID;

public class LoanService {
    public Loan confirmLoan(User1 user1){

        Loan loan=new Loan();
        loan.firstName= user1.firstName;
        loan.lastName= user1.lastName;
        loan.amount=60000.00;
        loan.emi= "200";
        loan.tenure="8months";
        loan.loanId= UUID.randomUUID().toString();
        loan.rateOfIntrest=0.03;


        return loan;


        }
}
