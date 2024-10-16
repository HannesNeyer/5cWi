package Automat;

public class UI {
    protected Controller c1;

    public UI(Controller c1) {
        this.c1 = c1;
    }

    public void buttonPressedPrint() {
        this.c1.printTicket();
    }

    public void buttonPressedScann() {
        this.c1.scannTicket();
    }
}
