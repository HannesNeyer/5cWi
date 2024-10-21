package Automat;

import java.util.List;
import java.util.ArrayList;

public class Controller {

    protected Ticket t1;
    protected Printer p1;
    protected Scanner s1;
    protected Automat a1;

    public Controller(Ticket t1, Printer p1, Scanner s1, Automat a1) {
        this.t1 = t1;
        this.p1 = p1;
        this.s1 = s1;
        this.a1 = a1;
    }

    public void printTicket(){
        this.p1.printingTicket();
        this.a1.createTicket();
    }

    public void scannTicket(){
        this.s1.scanningTicket();
    }


}
