package algorithmen;

import java.util.Scanner;

public class GUI {

    private Scanner scanner = new Scanner(System.in);
    private Sorter activeSorter = new BubbleSort();

    public void run() {
        while (true) {
            System.out.println("1. Selection Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Bubble Sort");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    activeSorter = new InsertionSort();
                    break;
                case 2:
                    activeSorter = new SeletionSort();
                    break;
                case 3:
                activeSorter = new BubbleSort();
                    break;
                default:
                    break;
            }

        }
    }

}
