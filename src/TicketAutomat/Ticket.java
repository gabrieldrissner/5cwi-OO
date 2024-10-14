package TicketAutomat;

import java.util.Random;

public class Ticket {
    private int id;
    private long ticketTimeStamp;
    private long paidTimeStamp;

    Random random = new Random();

    public Ticket(int id, long ticketTimeStamp, long paidTimeStamp) {
        this.id = id;
        this.ticketTimeStamp = ticketTimeStamp;
        this.paidTimeStamp = paidTimeStamp;
    }

    public int getId() {
        return id;
    }

    public long getPaidTimeStamp() {
        return paidTimeStamp;
    }

    public long getTicketTimeStamp() {
        return ticketTimeStamp;
    }
}
