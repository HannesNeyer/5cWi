package algorithmen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorter s = new BubbleSort();
        int[] result = s.sort(new int[] { 4, 2, 5, 1 });
        
        System.out.println(Arrays.toString(result));

        Gui gui = new Gui();
        gui.run();
    }
}