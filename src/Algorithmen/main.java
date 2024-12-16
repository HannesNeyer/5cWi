package algorithmen;

import java.util.Arrays;

import algorithmen.datagenerator.DataGenerator;

public class Main {
    public static void main(String[] args) {
        Sorter s = new BubbleSort();
        int[] result = s.sort(new int[] { 4, 2, 5, 1 });

        System.out.println(Arrays.toString(result));
    }
}