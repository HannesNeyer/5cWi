package algorithmen.SortTests;

import java.util.Random;

public class InsertionSortExample {

    // Insertion Sort implementation
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Function to generate random array
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000000);
        }
        return arr;
    }

    // Measure the time for sorting
    public static long measureSortTime(int[] arr) {
        long startTime = System.currentTimeMillis();
        insertionSort(arr);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int[] sizes = {10000, 100000, 400000};

        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            long sortTime = measureSortTime(arr);
            System.out.println("Sorting " + size + " elements took " + sortTime + " milliseconds.");
        }
    }
}

