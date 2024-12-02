package Algorithmen;
import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int number = rand.nextInt();
            arr[i] = number;
            System.out.println(arr[i]);
        }
        return arr;
    }
}
