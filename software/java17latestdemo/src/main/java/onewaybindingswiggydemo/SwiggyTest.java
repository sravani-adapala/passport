package onewaybindingswiggydemo;

public class SwiggyTest {
    public static void main(String[] args) {

       Address add=new Address();

        add.houseNo="ABC";
        add.flatNo="502";
        add.area="KPHB";
        add.pincode="522647";

       /* Address add2=new Address();

        add2.houseNo="ABC";
        add2.flatNo="502";
        add2.area="Miyapur";
        add2.pincode="522647";*/


        User user=new User();

        user.name="sravs";
        user.mobileNumber="2345678";
        user.eMail="sravs@gmail.com";
        user.address=add;


        Restaurent restaurent=new Restaurent();
        restaurent.restaurentName="lucky";
        restaurent.address=add;

        System.out.println(restaurent.restaurentName);




















      /*  useraddress.houseNo="1-15/1";
        useraddress.area="ramalayam";
        useraddress.street="vnk";
        useraddress.pincode="522647";


        restaurentaddress.houseNo="1-15/1";
        restaurentaddress.area="ramalayam";
        restaurentaddress.street="vnk";
        restaurentaddress.pincode="522647";

        restaurent.restaurentName="lucky";
        restaurent.address.
*/






    }
}
