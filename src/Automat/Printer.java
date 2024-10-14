package Automat;

public class Printer {
    private boolean TicketPrinted = false;

    public Printer(boolean TicketPrinted) {
        this.TicketPrinted = TicketPrinted;
    }

    public void printingTicket() {
        System.out.println("printing Ticket...");
        TicketPrinted = true;
        if (TicketPrinted == true) {
            System.out.println("Ticket printed succesfully :)");
        }
        TicketPrinted = false;
    }
}
