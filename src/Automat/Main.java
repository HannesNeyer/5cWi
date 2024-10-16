package Automat;

public class Main {
    public static void main(String[] argv) {
        Ticket t1 = new Ticket(0, 0, 0);
        Printer p1 = new Printer(false);
        Scanner s1 = new Scanner(false);
        Controller c1 = new Controller(t1, p1, s1);
        UI ui1 = new UI();

        Automat a1 = new Automat(t1, p1, s1, c1, ui1);
    }

}
