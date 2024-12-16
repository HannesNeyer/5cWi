package algorithmen.datagenerator;

import java.util.Random;

public class ReverseDataGenerator {
    
    private static DataGenerator dataGenerator = new DataGenerator();
        
        public static int[] ReverseDataArray(int j) {
            int size = dataGenerator.getSize();
            int[] arr = dataGenerator.getDataArray();
            int[] reversedArray = new int[size];
        
            for (int i = 0; i < size; i++) {
                reversedArray[i] = arr[size - 1 - i];
            }
        return reversedArray;
    }

    public int[] ReverseDataArrayMinMax() {
        int size = dataGenerator.getSize();
        int min = dataGenerator.getMin();
        int max = dataGenerator.getMin();
        Random rand = new Random();
        int[] reversedArray = new int[size];
        
        for (int i = size - 1; i >= 0; i--) {
            int number = rand.nextInt(max + 1 - min) + min;
            reversedArray[size - 1 - i] = number;
        }
        return reversedArray;
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
