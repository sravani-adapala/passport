package bankcreditcarddemo;

public class CreditCardTest {
    public static void main(String[] args) {

        Address address = new Address();

        address.flatNo = 9 - 60;
        address.street = "xyz";
        address.area = "KPHB";
        address.pincode = 522501;

        User user = new User();
        user.name = "sravani";
        user.dateOfBirth = "14/06/2002";
        user.mobileNumber = 23456789;
        user.aadharNumber = 3879;
        user.panNumber = "BIY44";
        user.address = address;

        CardService cardService = new CardService();
        System.out.println(cardService.card(user));
    }

}
