package currentbill;

public class PreviousCurrentBill {
    String units;
    String date;

    public PreviousCurrentBill(String units, String date) {
        this.units = units;
        this.date = date;
    }


    @Override
    public String toString() {
        return "PreviousCurrentBill{" +
                "units='" + units + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
