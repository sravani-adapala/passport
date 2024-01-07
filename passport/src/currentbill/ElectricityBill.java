package currentbill;

public class ElectricityBill {
    public static void main(String[] args) {
        PresentCurrentBill presentCurrentBill=new PresentCurrentBill("sravs","768347","6/01/2024","hyb");
        PaymentProcess paymentbill=new PaymentProcess(160);
        paymentbill.bill();
        System.out.println(presentCurrentBill);
        System.out.println(paymentbill);
    }
}
