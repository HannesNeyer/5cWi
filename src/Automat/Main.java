package Automat;

public class Main {
    public static void main(String[] argv) {
        Printer p1 = new Printer(false);
        Scanner s1 = new Scanner(false);
        Ticket t1 = new Ticket(0, 0, null);
        Automat a1 = new Automat(t1);
        Controller c1 = new Controller(t1, p1, s1, a1);
        UI ui1 = new UI(c1);

        ui1.buttonPressedPrint();
        ui1.buttonPressedScann();
    }

}
