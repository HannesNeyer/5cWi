package algorithmen.SortTests;

import java.util.Random;

public class SelectionSortExample {

    // Selection Sort implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr);
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
