public class CustomerDetails {
    String Phonenumber;
    String name;
    Passport passport;


    public CustomerDetails(String phonenumber, String name, Passport passport) {
        this.Phonenumber = phonenumber;
        this.name = name;
        this.passport = passport;
    }


    @Override
    public String toString() {
        return "CustomerDetails{" +
                "Phonenumber='" + Phonenumber + '\'' +
                ", name='" + name + '\'' +
                ", passport=" + passport +
                '}';
    }
}




