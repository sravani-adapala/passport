package currentbill;

public class PresentCurrentBill {
    private String name;
    private String id;
    private String date;
    private String address;
    public PresentCurrentBill(String name,String id,String date,String address) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.address = address;
    }

    @Override
    public String toString() {
        return "PresentCurrentBill{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


