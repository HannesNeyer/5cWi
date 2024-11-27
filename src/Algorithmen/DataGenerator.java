package Algorithmen;
import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        int[] arr = new int[5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int number = rand.nextInt();
            arr[i] = number;
        }

        return arr;
    }
}
