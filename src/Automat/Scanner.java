package Automat;

public class Scanner {
    private boolean TicketScanned = false;

    public Scanner(boolean TicketScanned) {
        this.TicketScanned = TicketScanned;
    }

    public void printingTicket() {
        System.out.println("scanning Ticket...");
        TicketScanned = true;
        if (TicketScanned == true) {
            System.out.println("Ticket scanned succesfully :) ");
        }
        TicketScanned = false;
    }
}
