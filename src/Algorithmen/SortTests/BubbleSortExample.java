package algorithmen.SortTests;

import java.util.Random;

public class BubbleSortExample {

    // Bubble Sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubbleSort(arr);
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

