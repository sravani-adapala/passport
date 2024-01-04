public class TicketBooking {
    int seats;
    String bookingId;


    public TicketBooking(int seats, String bookingId) {
        this.seats = seats;
        this.bookingId = bookingId;
    }
    @Override
    public String toString() {
        return "TicketBooking{" +
                "seats=" + seats +
                ", bookingId='" + bookingId + '\'' +
                '}';
    }


}
