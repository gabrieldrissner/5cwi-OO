package TicketAutomat;

public class UI {
    private Controller controller = new Controller();

    public void buttnPressed(){
        Ticket ticket = controller.createTicket();
    }
}
