package bankaccountdemo;

import java.util.UUID;

public class AccountService {
    public PassBook createAccount(User user){

        PassBook passBook=new PassBook();

        Address address =new Address();
        address.area="Miyapur";
        address.flatNo="305";
        address.country="India";
        address.pincode="500090";

        String name= user.firstName+user.lastName;
        passBook.accountHolderName=name;
        passBook.useraddress=user.address;
        passBook.bankaddress=address;
        passBook.accountNumber= UUID.randomUUID().toString();
        passBook.ifscCode="SBIN0002007";
        return passBook;


    }
}
