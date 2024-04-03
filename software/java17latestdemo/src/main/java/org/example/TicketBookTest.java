package org.example;

import java.util.Date;

public class TicketBookTest {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        ticket.movieName=" DJ TILLU";
        ticket.rowNumber="A";
        ticket.seatNumber=1;
        ticket.showTime=new Date();
    }
}
