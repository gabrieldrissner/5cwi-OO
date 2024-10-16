package TicketAutomat;

import java.util.ArrayList;
import java.util.List;

public class Controller {
private List<Ticket> tickets = new ArrayList<>();
private Printer printer = new Printer();


public Ticket createTicket(){
    Ticket ticket = new Ticket();
    printer.printTicket(ticket);
    tickets.add(ticket);
    tickets.add(ticket);
    return ticket;
}
}
