package Automat;

public class Automat {
    protected Ticket t1;
    protected Printer p1;
    protected Scanner s1;
    protected Controller c1;
    protected UI ui1;

    public Automat(Ticket t1) {
        this.t1 = t1;
    }

    public void createTicket(){
        Ticket t1 = new Ticket(0, 0, null);
    }
}
