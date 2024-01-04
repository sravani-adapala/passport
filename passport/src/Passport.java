public class Passport {
    String passportNumber;
    String expirationDate;

    public Passport(String passportNumber,String expirationDate){
        this.passportNumber=passportNumber;
        this.expirationDate=expirationDate;

    }
    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }


}
