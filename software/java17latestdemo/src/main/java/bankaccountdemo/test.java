package bankaccountdemo;

public class test {
    public static void main(String[] args) {

        User user=new User();

        Address userAddress=new Address();
        userAddress.area="Uppal";
        userAddress.flatNo="7/G";
        userAddress.country="India";
        userAddress.pincode="500080";


        user.firstName="sravani";
        user.lastName="adapala";
        user.mobileNo="23457";
        user.dob="14-06-2002";
        user.adharNo="2222222222222";
        user.address=userAddress;

        AccountService accountService=new AccountService();
         PassBook passBook = accountService.createAccount(user);

        System.out.println(passBook.accountHolderName);
        System.out.println(passBook.accountNumber);
        System.out.println(passBook.useraddress);
        System.out.println(passBook.bankaddress);
        System.out.println(passBook.ifscCode);


    }
}
