package Automat;

import java.util.Scanner;

public class UI {
    protected Controller c1;
    Scanner scanner = new Scanner(System.in);

    public UI(Controller c1) {
        this.c1 = c1;
    }

    public void buttons() {
        System.out.println("Write 0 for printing the Ticket");
        System.out.println("Write 1 for Scanning the Ticket");
        int selection = scanner.nextInt();
        if (selection == 0) {
            buttonPressedPrint();
        } else {
            buttonPressedScann();
        }
    }

    public void buttonPressedPrint() {
        this.c1.printTicket();
    }

    public void buttonPressedScann() {
        this.c1.scannTicket();
    }
}
