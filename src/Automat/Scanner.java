package Automat;

public class Scanner {
    private boolean TicketScanned = false;

    public Scanner(boolean TicketScanned) {
        this.TicketScanned = TicketScanned;
    }

    public void scanningTicket() {
        System.out.println("scanning Ticket...");
        TicketScanned = true;
        if (TicketScanned == true) {
            System.out.println("Ticket scanned succesfully :) ");
        }
        TicketScanned = false;
    }
}
