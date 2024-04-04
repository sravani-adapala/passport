package metrodestinationdemo;

public class MetroDemoTest {
    public static void main(String[] args) {

        EntryStation entry =new EntryStation();
        entry.source="Nagole";
        entry.date="31/03/2024";
        entry.time="10.30";

        ExitStation exit=new ExitStation();
        exit.destination="Rayadurgi";
        exit.date="31/03/2024";
        exit.time="11.45";

        MetroTicket metroTicket=new MetroTicket();
        metroTicket.entryStation=entry;
        metroTicket.exitStation=exit;
        metroTicket.price=85;
        metroTicket.ticketId="23456789";

        System.out.println(metroTicket.exitStation.destination);
        System.out.println(metroTicket.price);

    }
}
