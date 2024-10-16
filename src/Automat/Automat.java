package Automat;

public class Automat {
    protected Ticket t1;
    protected Printer p1;
    protected Scanner s1;
    protected Controller c1;
    protected UI ui1;

    public Automat(Ticket t1, Printer p1, Scanner s1, Controller c1, UI ui1) {
        this.t1 = t1;
        this.p1 = p1;
        this.s1 = s1;
        this.c1 = c1;
        this.ui1 = ui1;
    }

    public void getTicket() {
        Ticket t1 = new Ticket(0, 0, 0);
    }

}
