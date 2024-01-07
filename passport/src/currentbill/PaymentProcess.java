package currentbill;

public class PaymentProcess {
    private int Presentunits;
    public int bill;

    public PaymentProcess(int presentunits){
        this.Presentunits=presentunits;
    }

    public void bill() {
        int PreviousCurrentBill=140;
        if (PreviousCurrentBill<=Presentunits){

            Presentunits=Presentunits-PreviousCurrentBill;
            bill=Presentunits * 15;
            System.out.println(bill);
        }




    }


    @Override
    public String toString() {
        return "PaymentProcess{" +
                "Presentunits=" + Presentunits +
                ", bill=" + bill +
                '}';
    }
}



