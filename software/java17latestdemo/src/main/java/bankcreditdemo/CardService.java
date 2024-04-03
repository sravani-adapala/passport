package bankcreditdemo;

import java.util.Date;
import java.util.UUID;

public class CardService {
    public CreditCard card(User user){

        CreditCard creditCard=new CreditCard();
        creditCard.holderName= user.name;
        creditCard.bankName="State Bank Of India";
        creditCard.cardNo= UUID.randomUUID().toString();
        creditCard.cvv=UUID.randomUUID().toString();
        creditCard.cardExpiry=new Date();
        return creditCard;
    }
}
