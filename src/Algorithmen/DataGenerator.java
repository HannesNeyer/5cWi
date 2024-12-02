package Algorithmen;
import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int number = rand.nextInt();
            arr[i] = number;
        }
        return arr;
    }

    public static int[] generateDataArrayMinMax(int size, int min, int max) {
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int number = rand.nextInt(max + 1 - min) + min;
            arr[i] = number;
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println();
    }
}
