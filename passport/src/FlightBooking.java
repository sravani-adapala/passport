public class FlightBooking {
    public TicketBooking booking(CustomerDetails cd) {
        TicketBooking ticketBooking=new TicketBooking(23,"2345");
        System.out.println(cd);
        return ticketBooking;
    }
    public static void main(String[] args) {
        FlightBooking flightBooking = new FlightBooking();
        Passport passport = new Passport("768902", "2025");
        TicketBooking tt = flightBooking.booking(new CustomerDetails("1234567891", "sravs", passport));
        System.out.println(tt);
    }

}
