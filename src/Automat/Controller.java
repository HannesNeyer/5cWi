package Automat;

import java.util.List;
import java.util.ArrayList;

public class Controller {
    protected Ticket t1;
    protected Printer p1;
    protected Scanner s1;

    private List<Ticket> tickets = new ArrayList<Ticket>();

    public Controller(Ticket t1, Printer p1, Scanner s1) {
        this.t1 = t1;
        this.p1 = p1;
        this.s1 = s1;
    }

}
